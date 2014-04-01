package pGUI_Ebene;

import pFach_Ebene.ArtikelVerwaltung;

/**
 *
 * @author Andermann
 */
public class HauptFenster extends javax.swing.JFrame {

	// HauptFenster initialisieren
    public HauptFenster() {
        nordPanel = new pGUI_Ebene.WerbungPanel();
        westPanel = new pGUI_Ebene.AuswahlPanel(this);
        ostJPanel = new pGUI_Ebene.WarenkorbPanel();
        suedPanel = new pGUI_Ebene.Werbung2Panel();
        mittePanel = new pGUI_Ebene.AnmeldePanel(this);
        initComponents();
        setVisible(true);
    }
    
    public void setPanel(int nr) {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        switch(nr){
            case(1): 
                remove(mittePanel);
                mittePanel = new pGUI_Ebene.ArtikelPanel(this);
                initComponents();
                break;
            case(2):
                remove(mittePanel);
                mittePanel = new pGUI_Ebene.RegistrationsPanel(this);
                initComponents();
                break;
            default: break;
        }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(westPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mittePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(ostJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(westPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                //.addGap(0, 0, 0)
                .addComponent(mittePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                //.addGap(0, 0, 0)
                .addComponent(suedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(ostJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

	// Variablen
    private pGUI_Ebene.MittePanel mittePanel;
    private pGUI_Ebene.NordPanel nordPanel;
    private pGUI_Ebene.OstJPanel ostJPanel;
    private pGUI_Ebene.SuedPanel suedPanel;
    private pGUI_Ebene.WestPanel westPanel;
    private pFach_Ebene.ArtikelVerwaltung artikelverwaltung;

    public MittePanel getMittePanel() {
        return mittePanel;
    }
    public WestPanel getWestPanel() {
        return westPanel;
    }

    public void setArtikelverwaltung(ArtikelVerwaltung artikelverwaltung) {
        this.artikelverwaltung = artikelverwaltung;
    }

    public ArtikelVerwaltung getArtikelverwaltung() {
        return artikelverwaltung;
    }
    
    
    
    
}
