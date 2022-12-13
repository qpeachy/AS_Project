package com.example.ds_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.ds_android.Model.Forecast;
import com.example.ds_android.Model.PlatDuJour;
import com.example.ds_android.Model.Recette;
import com.example.ds_android.databinding.ActivityRecetteBinding;

public class RecetteActivity extends AppCompatActivity {

    private ActivityRecetteBinding binding;
    private RecyclerViewAdapterIngredients adapter;
    private Recette laRecette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecetteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        View view = binding.getRoot();
        setContentView(view);

        binding.ListIngredients.setHasFixedSize(true);
        LinearLayoutManager LayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.ListIngredients.setLayoutManager(LayoutManager);
        binding.ListIngredients.setFocusable(false);

        Intent rIntent = getIntent();
        laRecette = (Recette)rIntent.getSerializableExtra("Recette");

        adapter = new RecyclerViewAdapterIngredients(laRecette.getLesIngredients());
        binding.ListIngredients.setAdapter(adapter);

        binding.tvNom.setText(laRecette.getNom());
        binding.tvInstructions.setText(laRecette.getInstructions());
    }
}