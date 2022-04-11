/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.zavrsnirad.view;

import edunova.zavrsnirad.controller.ObradaNarudzba;
import edunova.zavrsnirad.model.Komponenta;
import edunova.zavrsnirad.model.Narudzba;
import edunova.zavrsnirad.model.Racunalo;
import edunova.zavrsnirad.util.OperaterUtil;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class KosaricaProzor extends javax.swing.JFrame {

    private ObradaNarudzba obrada;
    private Racunalo r;
    private Komponenta k;
    private DecimalFormat nf;

    DefaultTableModel table;

    /**
     * Creates new form NarudzbaProzor
     */
    public KosaricaProzor() {
        initComponents();
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("hr", "HR"));
        nf = new DecimalFormat("###,###.00", symbols);
        setTitle(OperaterUtil.getNaslov("Lista svih narudžbi"));
        obrada = new ObradaNarudzba();
        ucitaj();

    }

    /*public BigDecimal getUkupnaCijena() {
        BigDecimal suma;
        BigDecimal a = r.getCijena();
        BigDecimal b = k.getCijena();
        
        suma = a.add(b);
        
        return suma;
        
        
        
    }*/
    public BigDecimal getUkupnaCijena(Narudzba n) {
        BigDecimal suma = BigDecimal.ZERO;
        for (Komponenta k : n.getKomponente()) {
            if (k.getCijena() == null) {
                continue;
            }
            suma = suma.add(k.getCijena());
        }
        for (Racunalo r : n.getRacunala()) {
            if (r.getCijena() == null) {
                continue;
            }
            suma = suma.add(r.getCijena());
        }
        return suma;

    }

// OVO JE UKUPNA CIJENA OD OBJE KOMPONENTE I U getUkupnaCijana staviti getUkupnaCijena(n);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        tblNardudzba = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblNardudzba.setAutoCreateRowSorter(true);
        tblNardudzba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Broj narudžbe", "Ime i prezime korisnika", "Komponenta", "Računalo", "Ukupna cijena"
            }
        ));
        tblNardudzba.setColumnSelectionAllowed(true);
        tblNardudzba.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNardudzba.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(tblNardudzba);
        tblNardudzba.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ucitaj() {
        table = (DefaultTableModel) tblNardudzba.getModel();
        List<Narudzba> entiteti = obrada.read();

        for (Narudzba n : entiteti) {
            Object[] o = new Object[5];
            o[0] = n.getSifra();
            o[1] = n.getKorisnik().toString();
            o[2] = n.getKomponente();
            o[3] = n.getRacunala();
            o[4] = nf.format(getUkupnaCijena(n));

            table.addRow(o);
        }

        /*DefaultListModel<Narudzba> narudzbe = new DefaultListModel<>();
        List<Narudzba> entiteti = obrada.read();
        for (Narudzba n : entiteti) {
            narudzbe.addElement(n);
        }
        lstEntiteti.setModel(narudzbe);*/
    }

    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblNardudzba;
    // End of variables declaration//GEN-END:variables

}
