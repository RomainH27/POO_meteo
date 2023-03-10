package TP1.TP1_note_dm.controller;

import TP1.TP1_note_dm.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {

        @Autowired
        AddressRepository addressRepository;
        @GetMapping("/location")
        public String showAddresses(Model model) {
            model.addAttribute("allAddresses", addressRepository.findAll());
            return "location";
        }

}
