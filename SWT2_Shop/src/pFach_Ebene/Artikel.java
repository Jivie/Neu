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
public class Artikel {
    private String Name;
    private String Hersteller;
    private String Modell;
    private double Preis;
    private String Bild;
    private String Kategorie;
    private long ID;
    private static long Counter;

    public Artikel(String Name, String Hersteller, String Modell, double Preis, 
            String Bild, String Kategorie) {
        this.Name = Name;
        this.Hersteller = Hersteller;
        this.Modell = Modell;
        this.Preis = Preis;
        this.Bild = Bild;
        this.Kategorie = Kategorie;
        ID = Counter++;
    }

    public String getName() {
        return Name;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public String getModell() {
        return Modell;
    }

    public double getPreis() {
        return Preis;
    }

    public String getBild() {
        return Bild;
    }

    public String getKategorie() {
        return Kategorie;
    }

    public long getID() {
        return ID;
    }

    public static long getCounter() {
        return Counter;
    }
    
    
    
}
