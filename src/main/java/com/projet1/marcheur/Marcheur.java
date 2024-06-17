package com.projet1.marcheur;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Marcheur {
    String direction;
    String sens;

    public Marcheur(String direction, String sens){
        this.direction = direction;
        this.sens = sens;
    }
}
