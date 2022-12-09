package com.example.ds_android.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Froid extends Recette implements Serializable {
    public Froid(ArrayList<Ingredients> lesIngredients, String nom) {
        super(lesIngredients, nom);
    }
}
