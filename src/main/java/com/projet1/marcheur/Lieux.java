package com.projet1.marcheur;

import java.util.List;

public class Lieux {
    String name;
    List<Lieux> voisin;

    public Lieux(String name, List<Lieux> voisin) {
        this.name = name;
        this.voisin = voisin;
    }
}
