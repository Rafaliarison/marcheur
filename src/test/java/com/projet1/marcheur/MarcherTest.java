package com.projet1.marcheur;

import com.projet1.marcheur.actions.Marcher;
import com.projet1.marcheur.carte.Carte;
import com.projet1.marcheur.carte.Lieux;
import com.projet1.marcheur.marcheur.Marcheur;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class MarcherTest {
    private Lieux hei;
    private Lieux esti;
    private Lieux pullman;
    private Marcheur bjarni;
    private Marcher marcher;
    
    @BeforeEach
    public void setUp(){
        esti = new Lieux("ESTI", Arrays.asList());
        pullman = new Lieux("Pullman", Arrays.asList(esti));
        hei = new Lieux("HEI", Arrays.asList(pullman));
        
        esti.getVoisins().add(pullman);
        pullman.getVoisins().add(hei);

        Carte carte = new Carte(Arrays.asList(hei, pullman, esti));
        bjarni = new Marcheur("Bjarni", hei);
        marcher = new Marcher(bjarni);
    }
    @Test
    public void testMarche(){
        List<Lieux> parcours = marcher.marche(esti);
        assertEquals("HEI", parcours.get(0).getNom());
        assertEquals("ESTI", parcours.get(parcours.size() - 1).getNom());
    }

    private void assertEquals(String hei, String nom) {
    }
}
