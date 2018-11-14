/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import Data.User;
import Data.DataHandling;
import Data.Filehandling;
import java.time.LocalDate;
/**
 *
 * @author Renz
 */
public class opret_bruger extends javax.swing.JFrame {
    DataHandling d = new DataHandling();
    Filehandling f = new Filehandling();
    /**
     * Creates new form opret_bruger
     */
    public opret_bruger() {
        initComponents();
        this.svømmedisciplin.setVisible(false);
        this.jLabel7.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Birthdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Phonenumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();
        Coach = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        Aktivitetsform = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        svømmedisciplin = new javax.swing.JComboBox<>();
        OpretBruger = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Opret bruger");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Rediger bruger");

        jButton3.setText("Slet bruger");

        jLabel1.setText("Navn");

        jLabel2.setText("Fødselsdato");

        Birthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthdateActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefonnummer");

        jLabel4.setText("Email");

        jLabel5.setText("Status");

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktiv", "passiv" }));

        Coach.setText("Træner");

        jLabel6.setText("Aktivitetsform");

        Aktivitetsform.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vælg aktivitetsform", "motionist", "konkurrencesvømmer" }));
        Aktivitetsform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AktivitetsformActionPerformed(evt);
            }
        });

        jLabel7.setText("Svømmedisciplin");

        svømmedisciplin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vælg svømmedisciplin", "Butterfly", "Crawl", "Rygcrawl", "Brystsvømning" }));
        svømmedisciplin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svømmedisciplinActionPerformed(evt);
            }
        });

        OpretBruger.setText("Opret bruger");
        OpretBruger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpretBrugerActionPerformed(evt);
            }
        });

        jButton5.setText("Forside");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(Aktivitetsform, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(svømmedisciplin, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OpretBruger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coach)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aktivitetsform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(svømmedisciplin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Coach)
                .addGap(0, 0, 0)
                .addComponent(OpretBruger)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new opret_bruger().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void svømmedisciplinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svømmedisciplinActionPerformed
        
    }//GEN-LAST:event_svømmedisciplinActionPerformed

    private void AktivitetsformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AktivitetsformActionPerformed
        
        String str = (String) this.Aktivitetsform.getSelectedItem();
        
        if (str.equals("konkurrencesvømmer")) {
            this.jLabel7.setVisible(true);
            this.svømmedisciplin.setVisible(true);
        }if(str.equals("motionist")){
            this.jLabel7.setVisible(false);
            this.svømmedisciplin.setVisible(false);
        }
    }//GEN-LAST:event_AktivitetsformActionPerformed

    private void OpretBrugerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpretBrugerActionPerformed
        String str_status = this.Status.getSelectedItem().toString();
        String str_elite = this.Aktivitetsform.getSelectedItem().toString();
        String str_discipline = this.svømmedisciplin.getSelectedItem().toString();
        
        
        int ID = d.getMembers().size()+1;
        String name = Name.getText();
        String birthdate = Birthdate.getText();
        String phonenumber = Phonenumber.getText();
        String email = Email.getText();
        boolean elite = "elite".equalsIgnoreCase(str_elite);
        boolean active = "active".equalsIgnoreCase(str_status);
        boolean coach = Coach.isSelected();
        String memberSince = LocalDate.now().toString();
        
        User user;
        if(elite){
            user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, email, str_discipline);
        } else {
            user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, LocalDate.now().toString(), null);
        }
        d.addUser(user);
        System.out.println(user);
        f.writeObject(d.getMembers());
    }//GEN-LAST:event_OpretBrugerActionPerformed

    private void BirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthdateActionPerformed

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
            java.util.logging.Logger.getLogger(opret_bruger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opret_bruger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opret_bruger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opret_bruger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opret_bruger().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Aktivitetsform;
    private javax.swing.JTextField Birthdate;
    private javax.swing.JCheckBox Coach;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Name;
    private javax.swing.JButton OpretBruger;
    private javax.swing.JTextField Phonenumber;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> svømmedisciplin;
    // End of variables declaration//GEN-END:variables
}
