/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RestaurantRole;

import UI.RestaurantRole.*;
import UI.DoctorRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.RestaurantOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author DELL
 */
public class RestaurantPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private RestaurantOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;
    /**
     * Creates new form PharmacistPanel
     */
    public RestaurantPanel(JPanel userProcessContainer, UserAccount acc, RestaurantOrg org,Network net, Enterprise ent) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.org = (RestaurantOrg)org;
        this.ent = ent;
        this.ua = acc;
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

        btnNewReq = new javax.swing.JButton();
        btnHomePage = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 0, 102));

        btnNewReq.setForeground(new java.awt.Color(102, 0, 102));
        btnNewReq.setText("New Requests");
        btnNewReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewReqActionPerformed(evt);
            }
        });

        btnHomePage.setForeground(new java.awt.Color(102, 0, 102));
        btnHomePage.setText("HomePage");
        btnHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomePageActionPerformed(evt);
            }
        });

        btnDelivery.setForeground(new java.awt.Color(102, 0, 102));
        btnDelivery.setText("Delivery");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNewReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelivery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnHomePage)
                .addGap(27, 27, 27)
                .addComponent(btnNewReq)
                .addGap(18, 18, 18)
                .addComponent(btnDelivery)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewReqActionPerformed
        // TODO add your handling code here:
        NewRequestPanel newRequestPanel = new NewRequestPanel(userProcessContainer, ua, org, net, ent);
        userProcessContainer.add("newRequestPanel", newRequestPanel);
        newRequestPanel.autoPopFoodList();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewReqActionPerformed

    private void btnHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomePageActionPerformed
        // TODO add your handling code here:
        RestHomePagePanel homePagePanel = new RestHomePagePanel(userProcessContainer, ua, org, net, ent);
        userProcessContainer.add("homePagePanel", homePagePanel);
        homePagePanel.autoPopAssignedReq();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHomePageActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        // TODO add your handling code here:
        DeliveryPanel deliveryPanel = new DeliveryPanel(userProcessContainer, ua, org, net, ent);
        userProcessContainer.add("deliveryPanel", deliveryPanel);
        deliveryPanel.autoPopDelivery();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDeliveryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnHomePage;
    private javax.swing.JButton btnNewReq;
    // End of variables declaration//GEN-END:variables
}
