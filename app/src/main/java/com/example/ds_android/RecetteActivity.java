package com.example.ds_android;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.ds_android.Model.Forecast;
import com.example.ds_android.Model.PlatDuJour;
import com.example.ds_android.databinding.ActivityRecetteBinding;

public class RecetteActivity extends AppCompatActivity {

    private ActivityRecetteBinding binding;
    private RecyclerViewAdapterIngredients adapter;
    private PlatDuJour lePlatDuJour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recette);
        binding = ActivityRecetteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = new Intent();
        Forecast leForecast = (Forecast) intent.getSerializableExtra("Forecast");
        lePlatDuJour = new PlatDuJour();

        binding.ListIngredients.setHasFixedSize(true);
        LinearLayoutManager LayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.ListIngredients.setLayoutManager(LayoutManager);
        binding.ListIngredients.setFocusable(false);
        //adapter = new RecyclerViewAdapterIngredients();
    }
}