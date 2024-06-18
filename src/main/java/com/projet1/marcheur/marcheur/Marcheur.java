package com.projet1.marcheur.marcheur;

import com.projet1.marcheur.carte.Lieux;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Marcheur {
    private String nom;
    private List<Lieux> lieuxConnus;
    public Marcheur(String nom, Lieux lieuxInitial){
        this.nom = nom;
        this.lieuxConnus = new ArrayList<>();
        this.lieuxConnus.add(lieuxInitial);
    }
    public Lieux getPositionActuelle(){
        return lieuxConnus.get(lieuxConnus.size() - 1);
    }
    public void ajouterLieuConnu(Lieux lieu){
        if (!lieuxConnus.contains(lieu)){
            lieuxConnus.add(lieu);
        }
    }
}