package com.projet1.marcheur;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Trajet {
    private Lieux depart;
    private Lieux arrivee;

    public Trajet(Lieux depart, Lieux arrivee) {
        this.depart = depart;
        this.arrivee = arrivee;
    }
}
