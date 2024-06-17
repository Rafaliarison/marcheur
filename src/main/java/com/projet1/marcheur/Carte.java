package com.projet1.marcheur;

import lombok.Data;

import java.util.List;

@Data
public class Carte {
    private List<Lieux> lieux;

    public Carte(List<Lieux> voisin){
        this.lieux = voisin;
    }
    public void ajouterLieux(){

    }
}
