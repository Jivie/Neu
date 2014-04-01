/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pGUI_Ebene;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Chris
 */
public class ArtikelNode extends DefaultMutableTreeNode{
    long ID;
    String Name;

    // Wurzel bzw. Kategorien
    public ArtikelNode(String Name) {
        super(Name);
        ID = -1;
        this.Name = Name;
    }
    // Blätter
    public ArtikelNode(long ID, String Name) {
        super(Name);
        this.ID = ID;
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
