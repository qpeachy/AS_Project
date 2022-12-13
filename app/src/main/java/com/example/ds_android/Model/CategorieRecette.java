package com.example.ds_android.Model;

import java.io.Serializable;

public class CategorieRecette implements Serializable {
    private String nom;

    public CategorieRecette(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
