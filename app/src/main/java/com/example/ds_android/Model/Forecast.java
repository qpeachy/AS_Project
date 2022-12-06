package com.example.ds_android.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;

public class Forecast  implements Serializable {
    @SerializedName("main")
    Main main;
    @SerializedName("weather")
    ArrayList<Weather> weathers;

    @SerializedName("dt")
    private int datetime;

    @SerializedName("clouds")
    private double cloudiness;

    @SerializedName("list")
    private ArrayList<Forecast> lesForecasts;

    public Forecast(Main main, int datetime, double cloudiness) {
        this.main = main;
        this.datetime = datetime;
        this.cloudiness = cloudiness;
    }

    public Main getMain() {
        return main;
    }

    public Date getDatetime() {
        Instant instant = Instant.ofEpochSecond(datetime);
        Date date = (Date) Date.from(instant);
        return date;
    }

    public double getCloudiness() {
        return cloudiness;
    }

    public ArrayList<Weather> getWeathers() {
        return weathers;
    }

    public ArrayList<Forecast> getLesForecasts() {
        return lesForecasts;
    }
}
