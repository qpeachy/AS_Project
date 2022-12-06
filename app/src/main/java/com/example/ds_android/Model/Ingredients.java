package com.example.ds_android.Model;
public class Ingredients {
    private String nom;
    private String indice;

    public Ingredients(String nom, String indice) {
        this.nom = nom;
        this.indice = indice;
    }

    public String getNom() {
        return nom;
    }

    public String getIndice() {
        return indice;
    }
}
