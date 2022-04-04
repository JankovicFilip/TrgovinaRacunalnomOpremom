/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.zavrsnirad.view;

import edunova.zavrsnirad.util.OperaterUtil;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Izbornik extends javax.swing.JFrame {

    private SimpleDateFormat df;
    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        postavke();
    }
    
    private void postavke(){
        setTitle(OperaterUtil.getNaslov("Izbornik"));
        jmAplikacija.setText(OperaterUtil.NAZIV_APP);
        
        df= new SimpleDateFormat("dd. MMMM. yyy. HH:mm:ss");
        Vrijeme v = new Vrijeme();
        v.start();
    }
    
    private class Vrijeme extends Thread{

        @Override
        public void run() {
                    lblVrijeme.setText(df.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
            }
            run();

        }   
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        lblVrijeme = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAplikacija = new javax.swing.JMenu();
        jmiExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiRacunala = new javax.swing.JMenuItem();
        jmiKomponente = new javax.swing.JMenuItem();
        jmiNarudzbe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        lblVrijeme.setText("jLabel1");
        jToolBar1.add(lblVrijeme);

        jmAplikacija.setText("File");

        jmiExit.setText("Izlaz");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jmAplikacija.add(jmiExit);

        jMenuBar1.add(jmAplikacija);

        jMenu1.setText("Trgovina");

        jmiRacunala.setText("Računala");
        jmiRacunala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRacunalaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRacunala);

        jmiKomponente.setText("Komponente");
        jmiKomponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiKomponenteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiKomponente);

        jmiNarudzbe.setText("Narudzbe");
        jMenu1.add(jmiNarudzbe);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 491, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 424, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
            dispose();
    }//GEN-LAST:event_jmiExitActionPerformed

    private void jmiRacunalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRacunalaActionPerformed
        new RacunalaProzor().setVisible(true);
    }//GEN-LAST:event_jmiRacunalaActionPerformed

    private void jmiKomponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiKomponenteActionPerformed
        new KomponentaProzor().setVisible(true);
    }//GEN-LAST:event_jmiKomponenteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu jmAplikacija;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiKomponente;
    private javax.swing.JMenuItem jmiNarudzbe;
    private javax.swing.JMenuItem jmiRacunala;
    private javax.swing.JLabel lblVrijeme;
    // End of variables declaration//GEN-END:variables
}