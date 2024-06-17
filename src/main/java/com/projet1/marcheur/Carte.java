package com.projet1.marcheur;

import lombok.Data;

import java.util.List;

@Data
public class Carte {
    List<Lieux> lieux;
    String rue;

    public Carte(List<Lieux> voisin, String rue){
        this.rue = rue;
        this.lieux = voisin;
    }
}
