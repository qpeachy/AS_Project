package com.example.ds_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.ds_android.Instance.RetrofitClientInstance;
import com.example.ds_android.Model.Forecast;
import com.example.ds_android.databinding.ActivityMainBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        OpenWeatherService service =
                RetrofitClientInstance.getRetrofitInstance().create(OpenWeatherService. class);
        Call<Forecast> call = service.getForecast();
        call.enqueue(new Callback<Forecast>() {
            @Override
            public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                Forecast forecast = response.body();
            }
            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {  Toast.makeText(MainActivity.this, "Une erreur est survenue !",  Toast.LENGTH_SHORT).show();
            }
        });
    }
}