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
public class Anmelden {
    public boolean AnmeldeAbfrage(String ID, String PW){
        if(ID.matches(PW))
            return true;
        else
            return false;
    }
}
