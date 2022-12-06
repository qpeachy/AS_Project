package com.example.ds_android.Model;

import com.example.ds_android.Model.Ingredients;

import java.util.ArrayList;

public class Recette {
    private ArrayList<Ingredients> LesIngredients;
    private String nom;

    public Recette(ArrayList<Ingredients> lesIngredients, String nom) {
        LesIngredients = lesIngredients;
        this.nom = nom;
    }

    public ArrayList<Ingredients> getLesIngredients() {
        return LesIngredients;
    }

    public String getNom() {
        return nom;
    }
}
