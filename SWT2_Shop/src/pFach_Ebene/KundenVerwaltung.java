/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pFach_Ebene;
import java.util.*;

/**
 *
 * @author Andermann
 */
public class KundenVerwaltung {
    private LinkedList<Kunde> Kundenliste;
    
    public KundenVerwaltung() {
        Kundenliste = new LinkedList<Kunde>();
    }
    public Kunde getKunden(int id) {
        return null;
    }
    
    public int neuerKunde(String BLZ, String Benutzername, String Kontoinhaber, 
                         String Kontonr, String NR, String Name, 
                         String Passwort, String Strasse, String Vorname){
        Kundenliste.add(new Kunde(BLZ, Benutzername, Kontoinhaber, Kontoinhaber, 
                              NR, Name, Passwort, Strasse, Vorname));
        return Kundenliste.size();
    }
}
