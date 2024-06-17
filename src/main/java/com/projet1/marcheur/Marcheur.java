package com.projet1.marcheur;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Random;

@Getter
@Setter
public class Marcheur {
    String nom;
    private List<Lieux> direction;
    private List<Lieux> lieuxVisite;
    public Marcheur(List<Lieux> direction){
        this.direction = direction;
        this.lieuxVisite = new ArrayList<>();
    }

    public List<Lieux> marche(Lieux depart, Lieux arrivee, Carte carte){
        if (lieuxVisite.isEmpty()){
            lieuxVisite.add(depart);
        }
        Random random = new Random();
        Lieux positionActuel = getPositionActuel();
        List<Lieux> voisins = carte.getLieux().stream().filter(lieux -> lieux.getVoisins().equals(positionActuel)).toList();
        int index = random.nextInt(voisins.size());
        Lieux randomLieux = voisins.get(index);
        lieuxVisite.add(randomLieux);
        return marche(depart, arrivee, carte);
    }
    public Lieux getPositionActuel(){
        return lieuxVisite.get(lieuxVisite.size() - 1) ;
    }
}
