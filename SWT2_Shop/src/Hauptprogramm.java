
import pGUI_Ebene.HauptFenster;
import pFach_Ebene.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andermann
 */
public class Hauptprogramm {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HauptFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HauptFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HauptFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HauptFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Klassen erstellen
        HauptFenster haupt;
        ArtikelVerwaltung artikelverwaltung;

        haupt = new HauptFenster();
        artikelverwaltung = new ArtikelVerwaltung(haupt);
        
        artikelverwaltung.neuerArtikel("Viagra-5", "MedicsHeals", "5er Packung", 
                                       2.50, "LABER", "Medikamente");
        artikelverwaltung.neuerArtikel("Viagra-10", "MedicsHeals", "10er Packung",
                                       4.80, "LABER", "Medikamente");
        artikelverwaltung.neuerArtikel("Viagra-25", "MedicsHeals", "25er Packung",
                                       11.00, "LABER", "Medikamente");
        artikelverwaltung.neuerArtikel("Viagra-50", "MedicsHeals", "50er Packung",
                                       20.00, "LABER", "Medikamente");
        artikelverwaltung.neuerArtikel("Energy-Drink", "PowerDope", "0.5 Dose",
                                       2.05, "LABER1", "Getraenke");
        artikelverwaltung.neuerArtikel("Energy-Drink", "PowerDope", "0.5 Dose",
                                       2.05, "LABER1", "Getraenke");
        
    }
}
