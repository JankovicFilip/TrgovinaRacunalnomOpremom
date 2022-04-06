/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.zavrsnirad.view;

import edunova.zavrsnirad.controller.ObradaKomponenta;
import edunova.zavrsnirad.controller.ObradaKorisnik;
import edunova.zavrsnirad.controller.ObradaNarudzba;
import edunova.zavrsnirad.controller.ObradaRacunalo;
import edunova.zavrsnirad.model.Komponenta;
import edunova.zavrsnirad.model.Korisnik;
import edunova.zavrsnirad.model.Narudzba;
import edunova.zavrsnirad.model.Racunalo;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Admin
 */
public class NarudzbaTehnologijaProzor extends javax.swing.JFrame {

    ObradaNarudzba obradaNarudzba;
    ObradaKorisnik obradaKorisnik;
    ObradaKomponenta obradaKomponenta;
    ObradaRacunalo obradaRacunalo;
    /**
     * Creates new form NarudzbaTehnologijaProzor
     */
    public NarudzbaTehnologijaProzor() {
        initComponents();
        obradaNarudzba = new ObradaNarudzba();
        obradaKorisnik = new ObradaKorisnik();
        obradaKomponenta = new ObradaKomponenta();
        obradaRacunalo = new ObradaRacunalo();
        ucitajNarudzbe();
        ucitajKorisnika();
        
        
    }
    
    private void preuzmiVrijednosti(){
        var e = obradaNarudzba.getEntitet();
        e.setKorisnik((Korisnik) cmbKorisnik.getSelectedItem());
        if (dpDatumNarudzbe.getDate() != null) {
            e.setDatumNarudzbe(
                    Date.from(
                            dpDatumNarudzbe.getDate().atStartOfDay().atZone(
                                    ZoneId.systemDefault()
                            ).toInstant()
                    )
            );
        } else {
            e.setDatumNarudzbe(null);
        }
        if (dpDatumOtpreme.getDate() != null) {
            e.setDatumOtpreme(
                    Date.from(
                            dpDatumOtpreme.getDate().atStartOfDay().atZone(
                                    ZoneId.systemDefault()
                            ).toInstant()
                    )
            );
        } else {
            e.setDatumOtpreme(null);
        }
        //lblBrojNarudzbe.setText(String.valueOf(e.getSifra()));
    }
    
    private void ucitajNarudzbe(){
        DefaultListModel<Narudzba> narudzbe = new DefaultListModel<>();
        List<Narudzba> entiteti = obradaNarudzba.read();
        
        for(Narudzba n : entiteti) {
            narudzbe.addElement(n);
        }
        lstEntiteti.setModel(narudzbe);
    }
    
    private void ucitajKorisnika(){
        DefaultComboBoxModel<Korisnik> mk = new DefaultComboBoxModel<>();
        Korisnik korisnik = new Korisnik();
        korisnik.setSifra(Long.valueOf(0));
        korisnik.setIme("Nije odabrano!");
        korisnik.setPrezime("Nije odabrano");
        
        mk.addElement(korisnik);
        new ObradaKorisnik().read().forEach(s ->{
            mk.addElement(s);
        });
        
        cmbKorisnik.setModel(mk);
        
    }
    
    private void ucitajRacunala() {
        DefaultListModel<Racunalo> racunala = new DefaultListModel<>();
        List<Racunalo> entiteti = obradaRacunalo.read();
        for (Racunalo r : entiteti) {
            racunala.addElement(r);
        }
        lstSvaRacunala.setModel(racunala);
        
        
    }
    
    private void ucitajKomponente(){
        DefaultListModel<Komponenta> komponente = new DefaultListModel<>();
        List<Komponenta> entiteti = obradaKomponenta.read();
        for (Komponenta k : entiteti) {
            komponente.addElement(k);
        }
        lstSveKomponente.setModel(komponente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        dpDatumNarudzbe = new com.github.lgooddatepicker.components.DatePicker();
        dpDatumOtpreme = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbKorisnik = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstRacunalaNaNarudzbi = new javax.swing.JList<>();
        btnDodajRacunalo = new javax.swing.JButton();
        btnMakniRacunalo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSvaRacunala = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstSveKomponente = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstKomponentaNaNarudzbi = new javax.swing.JList<>();
        btnDodajKomponentu = new javax.swing.JButton();
        btnMakniKomponentu = new javax.swing.JButton();
        btnKreiraj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Datum narudžbe");

        jLabel2.setText("Datum Otpreme");

        jLabel3.setText("Korisnik");

        jScrollPane2.setViewportView(lstRacunalaNaNarudzbi);

        btnDodajRacunalo.setText(" <<");

        btnMakniRacunalo.setText(">>");
        btnMakniRacunalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakniRacunaloActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstSvaRacunala);

        jScrollPane4.setViewportView(lstSveKomponente);

        jScrollPane5.setViewportView(lstKomponentaNaNarudzbi);

        btnDodajKomponentu.setText(" <<");

        btnMakniKomponentu.setText(">>");
        btnMakniKomponentu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakniKomponentuActionPerformed(evt);
            }
        });

        btnKreiraj.setText("Kreiraj");

        btnPromjeni.setText("Promjeni");

        btnObrisi.setText("Obriši");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKreiraj)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dpDatumNarudzbe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dpDatumOtpreme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbKorisnik, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDodajKomponentu)
                    .addComponent(btnMakniKomponentu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnMakniRacunalo)
                        .addComponent(btnDodajRacunalo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDatumNarudzbe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDatumOtpreme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(btnDodajKomponentu)
                                    .addGap(29, 29, 29)
                                    .addComponent(btnMakniKomponentu)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDodajRacunalo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMakniRacunalo)
                                    .addGap(136, 136, 136)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKreiraj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMakniRacunaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakniRacunaloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMakniRacunaloActionPerformed

    private void btnMakniKomponentuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakniKomponentuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMakniKomponentuActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null) {
            return;
        }
        
        obradaNarudzba.setEntitet(lstEntiteti.getSelectedValue());
        var e = obradaNarudzba.getEntitet();
        if (e.getDatumNarudzbe()!= null) {
            dpDatumNarudzbe.setDate(e.getDatumNarudzbe().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            dpDatumNarudzbe.setDate(null);
        }
        
        if (e.getDatumOtpreme()!= null) {
            dpDatumOtpreme.setDate(e.getDatumOtpreme().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            dpDatumOtpreme.setDate(null);
        }
        if(e.getKorisnik()==null){
            cmbKorisnik.setSelectedIndex(0);
        }else{
            cmbKorisnik.setSelectedItem(e.getKorisnik());
        }
        
        DefaultListModel<Komponenta> mk = new DefaultListModel<>();
        if(e.getKomponente()!=null){
            Collections.sort(e.getKomponente(), new KomponentaComparator());
            mk.addAll(e.getKomponente());
        }
        lstKomponentaNaNarudzbi.setModel(mk);
        
        DefaultListModel<Racunalo> mr = new DefaultListModel<>();
        if(e.getRacunala()!=null){
            Collections.sort(e.getRacunala(), new RacunaloComparator());
            mr.addAll(e.getRacunala());
        }
        lstRacunalaNaNarudzbi.setModel(mr);
        
        
        
        
        
    }//GEN-LAST:event_lstEntitetiValueChanged

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajKomponentu;
    private javax.swing.JButton btnDodajRacunalo;
    private javax.swing.JButton btnKreiraj;
    private javax.swing.JButton btnMakniKomponentu;
    private javax.swing.JButton btnMakniRacunalo;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<Korisnik> cmbKorisnik;
    private com.github.lgooddatepicker.components.DatePicker dpDatumNarudzbe;
    private com.github.lgooddatepicker.components.DatePicker dpDatumOtpreme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<Narudzba> lstEntiteti;
    private javax.swing.JList<Komponenta> lstKomponentaNaNarudzbi;
    private javax.swing.JList<Racunalo> lstRacunalaNaNarudzbi;
    private javax.swing.JList<Racunalo> lstSvaRacunala;
    private javax.swing.JList<Komponenta> lstSveKomponente;
    // End of variables declaration//GEN-END:variables
}
