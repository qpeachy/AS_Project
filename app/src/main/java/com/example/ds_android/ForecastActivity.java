package com.example.ds_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ds_android.Model.Forecast;
import com.example.ds_android.databinding.ActivityForecastBinding;

public class ForecastActivity extends AppCompatActivity {

    private ActivityForecastBinding binding;
    private Forecast leForecast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        binding = ActivityForecastBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        View view = binding.getRoot();
        setContentView(view);

        Intent fIntent = getIntent();
        leForecast = (Forecast)fIntent.getSerializableExtra("Forecast");

        binding.tvDescription.setText(leForecast.getWeathers().get(0).getDescription());
        binding.tvMain.setText(leForecast.getWeathers().get(0).getMain());
        binding.tvHumidity.setText("Humidité : " + String.valueOf(leForecast.getMain().getHumidity())+"%");
        binding.tvTemps.setText("Température : " + String.valueOf(leForecast.getMain().getTemp())+ "°C");
        binding.tvTempsMax.setText("Température max : " + String.valueOf(leForecast.getMain().getTempMax())+ "°C");
        binding.tvTempsMin.setText("Température min : " + String.valueOf(leForecast.getMain().getTempMin())+ "°C");
        binding.tvSunrise.setText("levé du soleil : " + leForecast.getSunrise());
        binding.tvSunset.setText("couché du soleil : " + leForecast.getSunset());
        binding.tvRessentie.setText("Ressentie : " + String.valueOf(leForecast.getMain().getFeelsLike())+ "°C");
        binding.tvRecette.setText(leForecast.getDaysComment());

        binding.btnRecette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rIntent = new Intent(getApplicationContext(), RecetteActivity.class);
                leForecast.CreatePdj();
                rIntent.putExtra("Recette", leForecast.getPlatDuJour());
                startActivity(rIntent);
            }
        });
    }
}