package com.projet1.marcheur;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Marcheur {
    Lieux sens;
    List<Lieux> direction;
    public Marcheur(List<Lieux> direction, Lieux sens){
        this.sens = sens;
        this.direction = direction;
    }

    public void MarcheVers(Lieux sens, List<Lieux> direction){


    }
}
