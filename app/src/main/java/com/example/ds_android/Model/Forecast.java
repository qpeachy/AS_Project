package com.example.ds_android.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Forecast  implements Serializable {

    @SerializedName("main")
    private Main main;

    @SerializedName("weather")
    private ArrayList<Weather> weathers;

    @SerializedName("dt")
    private int datetime;

   @SerializedName("list")
    private ArrayList<Forecast> lesForecasts;

    @SerializedName("sunrise")
    private int sunrise;

    @SerializedName("sunset")
    private int sunset;

    private PlatDuJour platDuJour;

    public Forecast(Main main, ArrayList<Weather> weathers, int datetime, ArrayList<Forecast> lesForecasts, int sunrise, int sunset) {
        this.main = main;
        this.weathers = weathers;
        this.datetime = datetime;
        this.lesForecasts = lesForecasts;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public void CreatePdj(){
        this.platDuJour = new PlatDuJour();
    }

    public Main getMain() {
        return main;
    }

    public Date getDatetime() {
        Instant instant = Instant.ofEpochSecond(datetime);
        Date date = Date.from(instant);
        return date;
    }

    public ArrayList<Weather> getWeathers() {
        return weathers;
    }

    public ArrayList<Forecast> getLesForecasts() {
        ArrayList<Forecast> lesForecastsMidi = new ArrayList<Forecast>();
        for (int i = 1; i < lesForecasts.size(); i+=8) {
         lesForecastsMidi.add(lesForecasts.get(i));
        }
        return lesForecastsMidi;
    }

    public String getSunrise() {
        Date dateSunsrise = new Date(sunrise *1000L);
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
        String result = sdf.format(dateSunsrise);
        return result;
    }

    public String getSunset() {
        Date dateSunset = new Date(sunset *1000L);
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
        String result = sdf.format(dateSunset);
        return result;
    }

    public String getDaysComment(){
        String sentence = "Hummm ! Un bon snack pour une journée banale ";
        if(getMain().getTemp() < 12)
            sentence = "Brrrrr! Une recette chaude est nécéssaire pour combattre ce temps!";
        if(getMain().getTemp() > 20)
            sentence = "Ouf! Une recette froide pour réduire la température!";
        return sentence;
    }

    public Recette getPlatDuJour() {

        ArrayList list = new ArrayList<Recette>();
        if(getMain().getTemp() <= 10.00) {
            list = platDuJour.getTypeRecettes("Chaude");
        }
        else if(getMain().getTemp() >= 20.00) {
            list = platDuJour.getTypeRecettes("Froide");
        }
        else {
            list = platDuJour.getTypeRecettes("Snack");
        }
        int position = platDuJour.randRecette(list);
        return (Recette) list.get(position);
    }
}
