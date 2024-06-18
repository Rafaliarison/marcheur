package com.projet1.marcheur.actions;

import com.projet1.marcheur.carte.Lieux;
import com.projet1.marcheur.marcheur.Marcheur;

import java.util.List;
import java.util.Random;

public class Marcher {
    private Marcheur marcheur;
    public Marcher(Marcheur marcheur){
        this.marcheur = marcheur;
    }
    public List<Lieux> marche(Lieux arrivee){
        Lieux positionActuelle = marcheur.getPositionActuelle();
        if (positionActuelle.getNom().equals(arrivee.getNom())){
            return marcheur.getLieuxConnus();
        }
        Random random = new Random();
        List<Lieux> voisins = positionActuelle.getVoisins();
        int index = random.nextInt(voisins.size());
        Lieux prochainLieu = voisins.get(index);

        marcheur.ajouterLieuConnu(prochainLieu);

        return marche(arrivee);
    }
}
