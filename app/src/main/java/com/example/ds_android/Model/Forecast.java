package com.example.ds_android.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.time.Instant;
import java.util.ArrayList;

public class Forecast  implements Serializable {
    @SerializedName("cnt")
    private int cnt;

    @SerializedName("main")
    private Main main;

    @SerializedName("weather")
    private ArrayList<Weather> weathers;

    @SerializedName("dt")
    private int datetime;

   @SerializedName("list")
    private ArrayList<Forecast> lesForecasts;

    public Forecast(Main main, int datetime) {
        this.main = main;
        this.datetime = datetime;
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
}
