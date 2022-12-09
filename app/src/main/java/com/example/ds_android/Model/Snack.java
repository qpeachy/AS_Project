package com.example.ds_android.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Snack extends Recette implements Serializable {
    public Snack(ArrayList<Ingredients> lesIngredients, String nom) {
        super(lesIngredients, nom);
    }
}
