/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RestaurantRole;

import UI.RestaurantRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organisation;
import Business.Organization.RestaurantOrg;
import Business.Organization.TransportOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VolunteerRestaurantWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class NewRequestPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private RestaurantOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;
    /**
     * Creates new form NewRequestPanel
     */
    public NewRequestPanel(JPanel userProcessContainer, UserAccount acc, RestaurantOrg org,Network net, Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = (RestaurantOrg)org;
        this.ent = ent;
        this.ua = acc;
        this.net=net;
        autoPopFoodList();
    }
    
    public void autoPopFoodList() {
        DefaultTableModel mdl = (DefaultTableModel)tblMedList.getModel();
        mdl.setRowCount(0);    
        SimpleDateFormat fmt = new SimpleDateFormat("dd MMM, yyyy");
        
        for (Iterator<WorkRequest> wr = org.getWorkQueue().getWrList().iterator(); wr.hasNext();) {
            WorkRequest workRequest = wr.next();
           if(workRequest instanceof VolunteerRestaurantWorkRequest){
               VolunteerRestaurantWorkRequest req = (VolunteerRestaurantWorkRequest) workRequest;
                if(req.getStatus().equalsIgnoreCase("sent"))
                {
                Object[] row = new Object[7];
                row[0] = req;
                row[1]=req.getNgoName();
                row[3]=req.getQuantity();
                row[2]=req.getSender();
                row[4] = req.getReqDate();
                row[5]=req.getStatus();
                row[6]=req.getFoodList();
                mdl.addRow(row);
                }
               
           }
            
            
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

        jLabel25 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMedList = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnViewFoodList = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnRefresh = new javax.swing.JButton();

        jLabel25.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 102));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("New Food Requests");

        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 102));
        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblMedList.setForeground(new java.awt.Color(102, 0, 102));
        tblMedList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NGO", "Sender", "Medicine List", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblMedList);

        btnAssignToMe.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnAssignToMe.setForeground(new java.awt.Color(102, 0, 102));
        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnViewFoodList.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnViewFoodList.setForeground(new java.awt.Color(102, 0, 102));
        btnViewFoodList.setText("View Food List");
        btnViewFoodList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFoodListActionPerformed(evt);
            }
        });

        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtMessage.setRows(5);
        jScrollPane4.setViewportView(txtMessage);

        btnRefresh.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(102, 0, 102));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAssignToMe)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewFoodList))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewFoodList, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedList.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
            return;
        }
        VolunteerRestaurantWorkRequest req = (VolunteerRestaurantWorkRequest)tblMedList.getValueAt(selectedRow, 0);
        req.setReceiver(ua);
        req.setStatus("Assigned");
        ua.getWorkQueue().getWrList().add(req);
        JOptionPane.showMessageDialog(null, "The food request is assigned successfully");
        autoPopFoodList();
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnViewFoodListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFoodListActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedList.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }
        VolunteerRestaurantWorkRequest req = (VolunteerRestaurantWorkRequest)tblMedList.getValueAt(selectedRow, 0);
        txtMessage.setText(req.getFoodList()+"");
        txtMessage.setEditable(false);

    }//GEN-LAST:event_btnViewFoodListActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        autoPopFoodList(); 
        txtMessage.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewFoodList;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblMedList;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
