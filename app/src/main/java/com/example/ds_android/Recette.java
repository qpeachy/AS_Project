package com.example.ds_android;

import java.util.Dictionary;

public class Recette {
    private Dictionary<String, String> recettesChaudes;
    private Dictionary<String, String> recettesFroides;
    private Dictionary<String, String> snacks;
    private Weather weather;

    public Recette(Dictionary<String, String> recettesChaudes, Dictionary<String, String> recettesFroides, Dictionary<String, String> snacks, Weather weather) {
        this.recettesChaudes = recettesChaudes;
        this.recettesFroides = recettesFroides;
        this.snacks = snacks;
        this.weather = weather;
    }

    public Dictionary<String, String> getRecettesChaudes() {
        return recettesChaudes;
    }

    public void setRecettesChaudes(Dictionary<String, String> recettesChaudes) {
        this.recettesChaudes = recettesChaudes;
    }

    public Dictionary<String, String> getRecettesFroides() {
        return recettesFroides;
    }

    public void setRecettesFroides(Dictionary<String, String> recettesFroides) {
        this.recettesFroides = recettesFroides;
    }

    public Dictionary<String, String> getsnacks() {
        return snacks;
    }

    public void setsnacks(Dictionary<String, String> snacks) {
        this.snacks = snacks;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public void lesRectteesChaudes(){
        recettesChaudes.put("Boeuf bourguignon", "\n" +
                "1 5 kg de Bœuf pour bourguignon " +
                "200g de Lardon\n" +
                "60 g de Beurre\n" +
                "10 Petits oignons\n" +
                "2 Carotte\n" +
                "2 gousses d'ail\n" +
                "60g de farine (4 cuillières à soupe)\n" +
                "50cl de vin rouge Bourgogne\n" +
                "Bouillon de viande (2 cubes de bouillon de bœuf pour 50 cl 1 2 de litre d'eau) 2 verres\n" +
                "250g de champignon\n" +
                "1 Bouquet garni\n" +
                "Sel\n" +
                "Poivre\n");
    }

    public void lesRecettesFroides(){
        recettesFroides.put("soupe gaspacho",
                "9 tomates bien mûres\n" +
                "1.5 " +
                "poivron rouge\n" +
                "1.5 " +
                "poivron vert\n" +
                "1 oignon\n" +
                "ail\n" +
                "1 gousse d'ail\n" +
                " 2 c.à.s de vinaigre de xérès\n" +
                "1 tranche pain de mie\n" +
                "huile d'olive\n" +
                "poivre et piment\n" +
                "sel\n" +
                "1.5 concombre\n" +
                "4 oignons nouveaux\n" +
                "2 oeufs durs\n" +
                "basilic frais");
    }

    public void LesSnacks(){
        snacks.put("Garlic bread", "4 gousses d'ail\n" +
                "1 bouquets de persil\n" +
                "1 baguette\n" +
                "100g de beurre salé\n");
    }

}
