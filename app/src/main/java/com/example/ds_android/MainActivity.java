package com.example.ds_android;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ds_android.Instance.RetrofitClientInstance;
import com.example.ds_android.Model.Forecast;
import com.example.ds_android.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private RecyclerViewAdapteForecasts adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        OpenWeatherServices service =
                RetrofitClientInstance.getRetrofitInstance().create(OpenWeatherServices. class);
        Call<Forecast> call = service.getForecast();
        call.enqueue(new Callback<Forecast>() {
            @Override
            public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                Forecast forecasts = response.body();

                binding.ListForecast.setHasFixedSize(true);
                LinearLayoutManager LayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
                binding .ListForecast.setLayoutManager(LayoutManager);
                binding.ListForecast.setFocusable(false);
                adapter = new RecyclerViewAdapteForecasts(forecasts.getLesForecasts());
                binding.ListForecast.setAdapter(adapter);

                binding.ListForecast.addOnItemTouchListener(new RecyclerTouchListenerForecasts(getApplicationContext(), binding.ListForecast, new RecyclerViewClickListenerForecasts() {
                    @Override
                    public void onClick(View view, int position) {
                       Intent intent = new Intent(getApplicationContext(), ForecastActivity.class);
                       intent.putExtra("Forecast", forecasts.getLesForecasts().get(position));
                        startActivity(intent);
                    }
                }));
            }
            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {  Toast.makeText(MainActivity.this, "Une erreur est survenue !",  Toast.LENGTH_SHORT).show();
            }
        });
    }
}