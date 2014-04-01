/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pFach_Ebene;

/**
 *
 * @author Andermann
 */
public class AnmeldeVerwaltung {
    // Attribute
    pFach_Ebene.Anmelden anmelden;
    pFach_Ebene.Registrieren regestrieren;
    
    public AnmeldeVerwaltung() {
        anmelden = new pFach_Ebene.Anmelden();
        regestrieren = new pFach_Ebene.Registrieren();
    }
    // Methode zum anmelden
    public boolean anmelden(String ID, String PW){
        return anmelden.AnmeldeAbfrage(ID, PW);
    }
    // Methode zum registrieren
    public int registrieren(String BLZ, String Benutzername, 
                                 String Kontoinhaber, 
                                 String Kontonr, String NR, String Name, 
                                 String Passwort, String Strasse, 
                                 String Vorname){
        return regestrieren.RegistrationEingeben(BLZ, Benutzername, 
                                                 Kontoinhaber, Kontoinhaber, 
                                                 NR, Name, Passwort, Strasse, 
                                                 Vorname);
    }
}

