package com.example.ds_android.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class PlatDuJour implements Serializable {
    private ArrayList<Chaud> RecettesChaudes;
    private ArrayList<Froid> RecettesFroides;
    private ArrayList<Snack> RecettesSnacks;

    public PlatDuJour(ArrayList<Chaud> recettesChaudes, ArrayList<Froid> recettesFroides, ArrayList<Snack> recettesSnacks) {
        RecettesChaudes = recettesChaudes;
        RecettesFroides = recettesFroides;
        RecettesSnacks = recettesSnacks;
    }

    public ArrayList<Chaud> getRecettesChaudes() {
        return RecettesChaudes;
    }

    public ArrayList<Froid> getRecettesFroides() {
        return RecettesFroides;
    }

    public ArrayList<Snack> getRecettesSnacks() {
        return RecettesSnacks;
    }

    public int randRecette(ArrayList<Recette> ListRecette){
        int max = ListRecette.size();
        Random rand = new Random();
        int randRecette = rand.nextInt(max);
        return randRecette;
    }

    public Object RecettesduJours(Forecast unForcast){

        ArrayList lesRecettes = new ArrayList<>();
        if(unForcast.getMain().getTemp() < 12.00){
            lesRecettes = getRecettesFroides();
        }
        if(unForcast.getMain().getTemp() > 20.00){
            lesRecettes = getRecettesChaudes();
        }
        else
            lesRecettes = getRecettesSnacks();

        int position = randRecette(lesRecettes);
        return lesRecettes.get(position);
    }
}
