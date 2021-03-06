/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminRole;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
//import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class NetworkPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form NetworkPanel
     */
    public NetworkPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        autoPopNetwork();
    }
    
    private void autoPopNetwork() {
        DefaultTableModel mdl = (DefaultTableModel) tblNetwork.getModel();

        mdl.setRowCount(0);
        for (Network net : system.getNetList()) {
            Object[] obj = new Object[1];
            obj[0] = net;
            mdl.addRow(obj);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNetworkAdd = new javax.swing.JButton();
        txtNetworkName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNetworkDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblNetwork.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblNetwork.setForeground(new java.awt.Color(102, 0, 102));
        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNetwork);

        jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("NAME:");

        btnNetworkAdd.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnNetworkAdd.setForeground(new java.awt.Color(102, 0, 102));
        btnNetworkAdd.setText("ADD");
        btnNetworkAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkAddActionPerformed(evt);
            }
        });

        txtNetworkName.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 102));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE NETWORK WORKAREA");

        btnNetworkDelete.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnNetworkDelete.setForeground(new java.awt.Color(102, 0, 102));
        btnNetworkDelete.setText("DELETE");
        btnNetworkDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(971, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNetworkDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNetworkAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(295, 295, 295))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNetworkAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNetworkDelete)
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNetworkAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkAddActionPerformed

        String name = txtNetworkName.getText();
        if(name.equals("") || name==null){
            JOptionPane.showMessageDialog(null, "Network name mandatory");
            return;
        }
        for(Network net : system.getNetList()){
            if(net.getName().equalsIgnoreCase(name)){
                JOptionPane.showMessageDialog(null, "Existing Network");
            return;
            }
        }
        Network net = system.createNetwork();
        net.setName(name);

        autoPopNetwork();
        txtNetworkName.setText("");
    }//GEN-LAST:event_btnNetworkAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNetworkDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkDeleteActionPerformed

        int selectedRow = tblNetwork.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Make a row selection for network deletion", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Network net = (Network) tblNetwork.getValueAt(selectedRow, 0);

            for (Network network : system.getNetList()) {
                if (net== network) {
                    system.getNetList().remove(net);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Successfully deleted a network.");
            autoPopNetwork();
        }
    }//GEN-LAST:event_btnNetworkDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNetworkAdd;
    private javax.swing.JButton btnNetworkDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTextField txtNetworkName;
    // End of variables declaration//GEN-END:variables
}
