package com.example.ds_android;

import com.example.ds_android.Model.Forecast;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OpenWeatherServices {
    @GET("forecast?q=Annecy&appid=e075a0b59517e88cc46940bb262add13&units=metric")
    Call<Forecast> getForecast();
}
