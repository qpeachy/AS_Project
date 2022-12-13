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
        binding.tvHumidity.setText(String.valueOf(leForecast.getMain().getHumidity()));
        binding.tvTemps.setText(String.valueOf(leForecast.getMain().getTemp()));
        binding.tvTempsMax.setText(String.valueOf(leForecast.getMain().getTempMax()));
        binding.tvTempsMin.setText(String.valueOf(leForecast.getMain().getTempMin()));
        binding.tvSunrise.setText(leForecast.getSunrise());
        binding.tvSunset.setText(leForecast.getSunset());
        binding.tvRecette.setText(leForecast.getDaysComment());

        binding.btnRecette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rIntent = new Intent(getApplicationContext(), RecetteActivity.class);
                rIntent.putExtra("Recette", leForecast.getPlatDuJour());
                startActivity(rIntent);
            }
        });
    }
}