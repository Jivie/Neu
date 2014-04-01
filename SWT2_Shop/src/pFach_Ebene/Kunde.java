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
public class Kunde {
    private String BLZ;
    private String Benutzername;
    private String Kontoinhaber;
    private String Kontonr;
    private String NR;
    private String Name;
    private String Passwort;
    private String Strasse;
    private String Vorname;

    public Kunde(String BLZ, String Benutzername, String Kontoinhaber, 
                 String Kontonr,String NR, String Name, String Passwort, 
                 String Strasse, String Vorname) {
        this.BLZ = BLZ;
        this.Benutzername = Benutzername;
        this.Kontoinhaber = Kontoinhaber;
        this.Kontonr = Kontonr;
        this.NR = NR;
        this.Name = Name;
        this.Passwort = Passwort;
        this.Strasse = Strasse;
        this.Vorname = Vorname;
    }
    
    
    
    
}
