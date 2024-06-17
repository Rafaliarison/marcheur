package com.projet1.marcheur;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Lieux {
    private String nom;
    private List<Lieux> voisins;

    public Lieux(String nom) {
        this.nom = nom;
        this.voisins = new ArrayList<>();
    }
    public void ajouterVoisins(Lieux lieux){

    }

}
