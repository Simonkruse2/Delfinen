/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.DataHandling;
import Logic.ControllerImpl;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renz
 */
public class rediger_bruger extends javax.swing.JFrame {

    private final DataHandling d;
    ControllerImpl c;

    /**
     * Creates new form rediger_bruger
     */
    public rediger_bruger(DataHandling d) {
        initComponents();
        this.d = d;
        c = new ControllerImpl(d);
        addRowToJTableSletBruger();
    }

    public void addRowToJTableSletBruger() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[2];
        for (int i = 0; i < c.readMemberList().size(); i++) {
            rowData[0] = c.readMemberList().get(i).getID();
            rowData[1] = c.readMemberList().get(i).getName();
            model.addRow(rowData);
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

        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Coach = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Aktivitetsform = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Birthdate = new javax.swing.JTextField();
        svømmedisciplin = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        OpretBruger = new javax.swing.JButton();
        Phonenumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<String>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Slet bruger");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Forside");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Opret bruger");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Rediger bruger");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Coach.setText("Træner");

        jLabel1.setText("Navn");

        jLabel6.setText("Aktivitetsform");

        Aktivitetsform.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vælg aktivitetsform", "motionist", "konkurrencesvømmer" }));

        jLabel2.setText("Fødselsdato");

        jLabel7.setText("Svømmedisciplin");

        svømmedisciplin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vælg svømmedisciplin", "Butterfly", "Crawl", "Rygcrawl", "Brystsvømning" }));

        jLabel3.setText("Telefonnummer");

        OpretBruger.setText("Rediger bruger");
        OpretBruger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpretBrugerActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        jLabel5.setText("Status");

        Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aktiv", "passiv" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Søg");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Aktivitetsform, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(Birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(svømmedisciplin, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(OpretBruger, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coach)
                            .addComponent(Phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpretBruger)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new slet_bruger(d).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new opret_bruger(d).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // ID Text
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ID = Integer.parseInt(this.jTextField1.getText());
        this.Name.setText(c.søgBruger(ID).getName());
        this.Birthdate.setText(c.søgBruger(ID).getBirthdate());
        this.Phonenumber.setText(c.søgBruger(ID).getPhonenumber());
        this.Email.setText(c.søgBruger(ID).getEmail());
        //Status aktiv/passiv
        if (c.søgBruger(ID).isActive()) {
            this.Status.setSelectedIndex(0);
        }
        if (c.søgBruger(ID).isActive() == false) {
            this.Status.setSelectedIndex(1);
        }
        //Aktivitetsform motionist/Konkurrencesvømmer
        if (c.søgBruger(ID).isElite() == false) {
            this.Aktivitetsform.setSelectedIndex(1);
            this.svømmedisciplin.setVisible(false);
            this.jLabel7.setVisible(false);
        }
        if (c.søgBruger(ID).isElite()) {
            this.Aktivitetsform.setSelectedIndex(2);
        }
        //Svømmedisciplin (butterfly/crawl/rygcrawl/brystsvømning)
        if (c.søgBruger(ID).getDiscipline().equalsIgnoreCase("butterfly")) {
            this.svømmedisciplin.setSelectedIndex(1);
        }
        if (c.søgBruger(ID).getDiscipline().equalsIgnoreCase("crawl")) {
            this.svømmedisciplin.setSelectedIndex(2);
        }
        if (c.søgBruger(ID).getDiscipline().equalsIgnoreCase("rygcrawl")) {
            this.svømmedisciplin.setSelectedIndex(3);
        }
        if (c.søgBruger(ID).getDiscipline().equalsIgnoreCase("brystsvømning")) {
            this.svømmedisciplin.setSelectedIndex(4);
        }
        //Coach true/false
        this.Coach.setSelected(c.søgBruger(ID).isCoach());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new forside(d).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void OpretBrugerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpretBrugerActionPerformed
        int ID = Integer.parseInt(this.jTextField1.getText());
        c.søgBruger(ID).setName(this.Name.getText());
        c.søgBruger(ID).setBirthdate(this.Birthdate.getText());
        c.søgBruger(ID).setPhonenumber(this.Phonenumber.getText());
        c.søgBruger(ID).setEmail(this.Email.getText());
        //Set status aktiv/passiv
        if (this.Status.getSelectedItem().toString().equalsIgnoreCase("aktiv")) {
            c.søgBruger(ID).setActive(true);
        }
        //Set Aktiitetsform vælg/ motionist/ konkurrencesvømmer
        if (this.Aktivitetsform.getSelectedItem().toString().equalsIgnoreCase("konkurrencesvømmer")) {
            c.søgBruger(ID).setElite(true);
        }
        if (this.Aktivitetsform.getSelectedItem().toString().equalsIgnoreCase("motionist")) {
            c.søgBruger(ID).setElite(false);
        }
        //Set svømmedisciplin (crawl/rygcrawl/butterfly/brystsvømning)
        c.søgBruger(ID).setDiscipline(this.svømmedisciplin.getSelectedItem().toString());
        c.søgBruger(ID).setCoach(this.Coach.isSelected());
        c.redigerBruger();
        addRowToJTableSletBruger();
        
    }//GEN-LAST:event_OpretBrugerActionPerformed


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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> svømmedisciplin;
    // End of variables declaration//GEN-END:variables
}
