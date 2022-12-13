package com.example.ds_android.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Recette implements Serializable {
    private ArrayList<Ingredient> lesIngredients;
    private String nom;
    private String instructions;
    private CategorieRecette categorie;

    public Recette(ArrayList<Ingredient> lesIngredients, String nom, String instructions, CategorieRecette categorie) {
        this.lesIngredients = lesIngredients;
        this.nom = nom;
        this.instructions = instructions;
        this.categorie = categorie;
    }

    public ArrayList<Ingredient> getLesIngredients() {
        return lesIngredients;
    }

    public String getNom() {
        return nom;
    }

    public String getInstructions() {
        return instructions;
    }

    public CategorieRecette getCategorie() {
        return categorie;
    }
}
