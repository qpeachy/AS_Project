package com.example.ds_android.Model;

import java.io.Serializable;

public class Ingredients implements Serializable {
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
