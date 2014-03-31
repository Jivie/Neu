/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tester;

/**
 *
 * @author Acer
 */
public class Kunde {
    private String vorString;
    private String nachString;

    public Kunde(String vorString, String nachString) {
        this.vorString = vorString;
        this.nachString = nachString;
    }

    public String getVorString() {
        return vorString;
    }

    public String getNachString() {
        return nachString;
    }

    public void setVorString(String vorString) {
        this.vorString = vorString;
    }

    public void setNachString(String nachString) {
        this.nachString = nachString;
    }    
}
