package com.projet1.marcheur.carte;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Lieux {
    private String nom;
    private List<Lieux> voisins;
    public Lieux(String nom, List<Lieux> voisins) {
        this.nom = nom;
        this.voisins = voisins;
    }
}
