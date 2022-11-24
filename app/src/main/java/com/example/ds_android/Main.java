package com.example.ds_android;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    private double temp;
    @SerializedName("temp_min")
    private double tempMin;
    @SerializedName("temp_max")
    private double tempMax;
    @SerializedName("humidity")
    private double humidity;
    @SerializedName("feels_like")
    private double feelsLike;

    public double getTemp() {
        return temp;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getFeelsLike() {
        return feelsLike;
    }
}
