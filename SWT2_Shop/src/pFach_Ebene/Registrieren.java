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
public class Registrieren {
    public Registrieren() {
        kundenverwaltung = new KundenVerwaltung();
    }
    public int RegistrationEingeben(String BLZ, String Benutzername, 
                                        String Kontoinhaber, 
                                        String Kontonr, String NR, String Name, 
                                        String Passwort, String Strasse, 
                                        String Vorname){
        return kundenverwaltung.neuerKunde(BLZ, Benutzername, Kontoinhaber, 
                                  Kontonr, NR, Name, Passwort, Strasse, 
                                  Vorname);
        
        
    }
    
    // Variablen
    private KundenVerwaltung kundenverwaltung; 
}
