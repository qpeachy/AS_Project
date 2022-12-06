package com.example.ds_android.Model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Forecast implements Serializable {
    @SerializedName("main")
    Main main;
    @SerializedName("weather")
    Weather weather;
    @SerializedName("dt")
    private int datetime;
    @SerializedName("alls")
    private double cloudiness;

    public Forecast(Main main, Weather weather, int datetime, double cloudiness) {
        this.main = main;
        this.weather = weather;
        this.datetime = datetime;
        this.cloudiness = cloudiness;
    }

    public Main getMain() {
        return main;
    }

    public Weather getWeather() {
        return weather;
    }

    public int getDatetime() {
        return datetime;
    }

    public double getCloudiness() {
        return cloudiness;
    }
}
