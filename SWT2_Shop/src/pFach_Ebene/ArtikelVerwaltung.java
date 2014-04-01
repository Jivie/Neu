/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pFach_Ebene;
import java.util.*;
import pGUI_Ebene.AuswahlPanel;
import pGUI_Ebene.HauptFenster;
/**
 *
 * @author Andermann
 */
public class ArtikelVerwaltung {
    private LinkedList<Artikel> artikelliste;
    private HauptFenster hauptfenster;
    public ArtikelVerwaltung(HauptFenster haupt) {
        artikelliste = new LinkedList<Artikel>();
        hauptfenster = haupt;
        haupt.setArtikelverwaltung(this);
    }
    public void neuerArtikel(String Name, String Hersteller, String Modell, 
                             double Preis, String Bild, String Kategorie){
        artikelliste.add(new Artikel(Name, Hersteller, Modell, Preis, Bild, Kategorie));
        AuswahlPanel ap = (AuswahlPanel)hauptfenster.getWestPanel();
        ap.addArtikel(artikelliste.getLast());
    }
    
    public Artikel getArtikel(long ID) {
     ListIterator<Artikel> it = artikelliste.listIterator();
     while(it.hasNext()){
         Artikel a = it.next();
         if(a.getID() == ID)
             return a;
     }
     return null;
    }
    public LinkedList<Artikel> getArtikelliste() {
        return artikelliste;
    }
}
