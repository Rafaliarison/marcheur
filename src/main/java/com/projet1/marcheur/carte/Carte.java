package com.projet1.marcheur.carte;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
public class Carte  {
    private List<Lieux> lieux;

    public Carte(List<Lieux> voisin){
        this.lieux = lieux;
    }
}
