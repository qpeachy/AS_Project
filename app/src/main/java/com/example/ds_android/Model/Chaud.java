package com.example.ds_android.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Chaud extends Recette implements Serializable {

    public Chaud(ArrayList<Ingredients> lesIngredients, String nom) {
        super(lesIngredients, nom);
    }
}
