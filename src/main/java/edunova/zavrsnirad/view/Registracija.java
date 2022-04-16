/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.zavrsnirad.view;

import edunova.zavrsnirad.controller.ObradaKorisnik;
import edunova.zavrsnirad.model.Korisnik;
import edunova.zavrsnirad.util.OibUtil;
import edunova.zavrsnirad.util.OperaterUtil;
import edunova.zavrsnirad.util.ZavrsniRadException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Admin
 */
public class Registracija extends javax.swing.JFrame {

    private ObradaKorisnik obradaKorisnik;

    //private ObradaKo
    /**
     * Creates new form Registracija
     */
    public Registracija() {
        initComponents();
        obradaKorisnik = new ObradaKorisnik();
        setTitle(OperaterUtil.getNaslov("Registracija"));
    }
    
    private void preuzmiVrijednosti(){
        var e = obradaKorisnik.getEntitet();
        e.setIme(txtIme.getText());
        e.setPrezime(txtPrezime.getText());
        e.setAdresa(txtAdresa.getText());
        e.setBrojTelefona(txtBrojTelefona.getText());
        e.setOib(txtOib.getText());
        e.setEmail(txtEmail.getText());
        e.setLozinka(BCrypt.hashpw(String.valueOf(txtLozinka.getPassword()), BCrypt.gensalt()));
        e.setUloga("admin");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtOib = new javax.swing.JTextField();
        txtAdresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBrojTelefona = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLozinka = new javax.swing.JPasswordField();
        btnKreiraj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        txtIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImeKeyPressed(evt);
            }
        });

        txtPrezime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrezimeKeyPressed(evt);
            }
        });

        txtAdresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdresaKeyPressed(evt);
            }
        });

        jLabel3.setText("OIB");

        jLabel4.setText("Adresa");

        jLabel5.setText("Broj telefona");

        txtBrojTelefona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBrojTelefonaKeyPressed(evt);
            }
        });

        jLabel6.setText("Email");

        jButton1.setText("Generiraj OIB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel7.setText("Lozinka");

        btnKreiraj.setText("Kreiraj");
        btnKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLozinka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIme, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(txtBrojTelefona, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAdresa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnKreiraj)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKreiraj)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtImeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImeKeyPressed
        if (txtIme.getText().trim().isEmpty()) {
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPrezime.requestFocus();
        }


    }//GEN-LAST:event_txtImeKeyPressed

    private void txtPrezimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrezimeKeyPressed
        if (txtPrezime.getText().trim().isEmpty()) {
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAdresa.requestFocus();
        }
    }//GEN-LAST:event_txtPrezimeKeyPressed

    private void txtAdresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdresaKeyPressed
        if (txtAdresa.getText().trim().isEmpty()) {
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtBrojTelefona.requestFocus();
        }
    }//GEN-LAST:event_txtAdresaKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (txtEmail.getText().trim().isEmpty()) {
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLozinka.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtBrojTelefonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrojTelefonaKeyPressed
        if (txtBrojTelefona.getText().trim().isEmpty()) {
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtBrojTelefonaKeyPressed

    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
        try {
            obradaKorisnik.setEntitet(new Korisnik());
            preuzmiVrijednosti();
            obradaKorisnik.create();
            
        } catch (ZavrsniRadException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnKreirajActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtOib.setText(OibUtil.generirajOib());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKreiraj;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtBrojTelefona;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JPasswordField txtLozinka;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables
}