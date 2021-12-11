/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gauri
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise ent;
    Network net;
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Network net, Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ent = ent;
        this.net=net;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbltitle = new javax.swing.JLabel();
        btnmanageuser = new javax.swing.JButton();
        btnmanageemp = new javax.swing.JButton();
        btnmanageorg = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 0, 102));

        Lbltitle.setBackground(new java.awt.Color(255, 255, 255));
        Lbltitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        Lbltitle.setForeground(new java.awt.Color(102, 0, 102));
        Lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbltitle.setText("Administrative Role Work Area");

        btnmanageuser.setBackground(new java.awt.Color(255, 255, 255));
        btnmanageuser.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 18)); // NOI18N
        btnmanageuser.setForeground(new java.awt.Color(102, 0, 102));
        btnmanageuser.setText("Manage User");
        btnmanageuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageuserActionPerformed(evt);
            }
        });

        btnmanageemp.setBackground(new java.awt.Color(255, 255, 255));
        btnmanageemp.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 18)); // NOI18N
        btnmanageemp.setForeground(new java.awt.Color(102, 0, 102));
        btnmanageemp.setText("Manage Employee");
        btnmanageemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageempActionPerformed(evt);
            }
        });

        btnmanageorg.setBackground(new java.awt.Color(255, 255, 255));
        btnmanageorg.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 18)); // NOI18N
        btnmanageorg.setForeground(new java.awt.Color(102, 0, 102));
        btnmanageorg.setText("Manage Organization");
        btnmanageorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageorgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnmanageorg, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnmanageemp, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmanageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Lbltitle)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmanageorg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmanageemp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmanageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanageuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageuserActionPerformed
        // TODO add your handling code here:
        ManageUserAccJPanel manageUserAccJPanel = new ManageUserAccJPanel(userProcessContainer, ent);
        userProcessContainer.add("manageUserAccJPanel", manageUserAccJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnmanageuserActionPerformed

    private void btnmanageempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageempActionPerformed

        ManageEmpJPanel manageEmployeeJPanel = new ManageEmpJPanel(userProcessContainer, ent.getOrgDir());
        userProcessContainer.add("manageEmpJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnmanageempActionPerformed

    private void btnmanageorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageorgActionPerformed

        ManageOrgJPanel manageOrganizationJPanel = new ManageOrgJPanel(userProcessContainer, ent.getOrgDir(), ent);
        userProcessContainer.add("manageOrgJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnmanageorgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbltitle;
    private javax.swing.JButton btnmanageemp;
    private javax.swing.JButton btnmanageorg;
    private javax.swing.JButton btnmanageuser;
    // End of variables declaration//GEN-END:variables
}