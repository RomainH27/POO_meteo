package TP1.TP1_note_dm.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Controller
public class MeteoController {

    @PostMapping("/meteo")
    public String meteo(@RequestParam(name="address", required=false, defaultValue="Rennes") String namePost, Model model) throws IOException {
        model.addAttribute("address", namePost);

        String url = "https://api-adresse.data.gouv.fr/search/?q=" + namePost + "&limit=1";

        RestTemplate restTemplate = new RestTemplate();

        // Reception du résultat de la requête
        String result = restTemplate.getForObject(url, String.class);


        Pattern p = Pattern.compile("coordinates\":(.*?)]},\"properties");

        Matcher m = p.matcher(result);

        String match ="";

        if(m.find()){
            match = m.group(1);
        }

        match = match.substring(1);

        String[] longlat = match.split(",");

        String longi = longlat[0];

        String  lati = longlat[1];

        String url_2 = "https://api.meteo-concept.com/api/forecast/nextHours?token=dd4cb1b5e27705c19beb52cd5c7a5bf7bb7e837262688975eb8dc099d50ae2de&latlng=" + lati + "," + longi ;

        RestTemplate restTemplate_2 = new RestTemplate();

        String result_2 = restTemplate_2.getForObject(url_2, String.class);





        Pattern p_2 = Pattern.compile("temp2m\":(.*?),\"rh2m");

        Matcher m_2 = p_2.matcher(result_2);

        String match_2 ="";

        if(m_2.find()){
            match_2 = m_2.group(1);
        }


        model.addAttribute("result", match_2);


        return "meteo";
    }
}
