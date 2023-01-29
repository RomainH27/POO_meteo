package TP1.TP1_note_dm.model;

public class Meteo {

    private int index = 0;

    public Meteo(){
    }
    public Meteo(int index){

        this.index = index;
    }

    String getMeteo(){
        if(getIndex() == 0){
            return ("Soleil");
        }
        if(getIndex() == 1){
            return ("Peu nuageux");
        }
        if(getIndex() == 2){
            return ("Ciel voilé");
        }
        if(getIndex() == 3){
            return ("Nuageux");
        }
        if(getIndex() == 4){
            return ("Très nuageux");
        }
        if(getIndex() == 5){
            return ("Couvert");
        }
        if(getIndex() == 6){
            return ("Brouillard");
        }
        if(getIndex() == 7){
            return ("Brouillard givrant");
        }
        if(getIndex() == 10){
            return ("Pluie faible");
        }
        if(getIndex() == 11){
            return ("Pluie modérée");
        }
        if(getIndex() == 12){
            return ("Pluie forte");
        }
        if(getIndex() == 13){
            return ("Pluie faible verglaçante");
        }
        if(getIndex() == 14){
            return ("Pluie modérée verglaçante");
        }
        else{
            return ("Condition météo imprévues !");
        }

    }

    public int getIndex() {
        return index;
    }
}
