package com.example.ds_android;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
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
    private List<Forecast> dataForecast;
    private RecyclerViewAdapteForecasts adapter;
    private ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result.getResultCode()==1){
                Intent resultIntent = result.getData();
                if(resultIntent != null){
                    Forecast nForecast = (Forecast) resultIntent.getSerializableExtra("Forecast");
                    adapter.notifyDataSetChanged();
                }
            }
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.ListForecast.setHasFixedSize(true);
        LinearLayoutManager LayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding .ListForecast.setLayoutManager(LayoutManager);
        binding.ListForecast.setFocusable(false);

        OpenWeatherService service =
                RetrofitClientInstance.getRetrofitInstance().create(OpenWeatherService. class);
        Call<Forecast> call = service.getForecast();
        call.enqueue(new Callback<Forecast>() {
            @Override
            public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                Forecast forecasts = response.body();
                dataForecast = new ArrayList<>();
                dataForecast = (List<Forecast>) forecasts;
                adapter = new RecyclerViewAdapteForecasts((ArrayList<Forecast>) dataForecast);
                binding.ListForecast.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {  Toast.makeText(MainActivity.this, "Une erreur est survenue !",  Toast.LENGTH_SHORT).show();
            }
        });
    }
}