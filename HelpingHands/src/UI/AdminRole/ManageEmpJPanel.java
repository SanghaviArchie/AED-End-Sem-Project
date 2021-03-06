/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import Business.Employee.Employee;
import Business.Organization.Organisation;
import Business.Organization.OrganisationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauri
 */
public class ManageEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private OrganisationDirectory orgDir;
    private JPanel userProcessContainer;
    
    public ManageEmpJPanel(JPanel userProcessContainer,OrganisationDirectory orgDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orgDir = orgDir;
        
        autoPopOrgCB();
        autoPopOrgEmpCB();
    }
    public void autoPopOrgCB(){
        orgcombo.removeAllItems();
        for (Organisation org : orgDir.getOrgList()){
            orgcombo.addItem(org);
        }
    }
    public void autoPopOrgEmpCB(){
        CbOrg.removeAllItems();
        for (Organisation org : orgDir.getOrgList()){
            CbOrg.addItem(org);
        }
    }
    private void autoPoptbl(Organisation org){
        DefaultTableModel mdl = (DefaultTableModel) OrgTbl.getModel();
        mdl.setRowCount(0);
        for (Employee emp : org.getEmpDir().getEmpList()){
            Object[] row = new Object[2];
            row[0] = emp.getId();
            row[1] = emp.getName();
            mdl.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrgTbl = new javax.swing.JTable();
        btncreate = new javax.swing.JButton();
        orgcombo = new javax.swing.JComboBox();
        lblOrganisation = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        LblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        CbOrg = new javax.swing.JComboBox();
        LblOrg = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 0, 51));

        jPanel1.setBackground(new java.awt.Color(180, 195, 195));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        OrgTbl.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        OrgTbl.setForeground(new java.awt.Color(102, 0, 102));
        OrgTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(OrgTbl);

        btncreate.setBackground(new java.awt.Color(255, 255, 255));
        btncreate.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btncreate.setForeground(new java.awt.Color(102, 0, 102));
        btncreate.setText("Create Employee");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        orgcombo.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        orgcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgcomboActionPerformed(evt);
            }
        });

        lblOrganisation.setBackground(new java.awt.Color(255, 255, 255));
        lblOrganisation.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblOrganisation.setForeground(new java.awt.Color(51, 0, 51));
        lblOrganisation.setText("Organization");

        btnback.setBackground(new java.awt.Color(255, 255, 255));
        btnback.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(102, 0, 102));
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        LblName.setBackground(new java.awt.Color(255, 255, 255));
        LblName.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        LblName.setForeground(new java.awt.Color(51, 0, 51));
        LblName.setText("Name");

        txtName.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(102, 0, 102));

        CbOrg.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        CbOrg.setForeground(new java.awt.Color(102, 0, 102));
        CbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LblOrg.setBackground(new java.awt.Color(255, 255, 255));
        LblOrg.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        LblOrg.setForeground(new java.awt.Color(51, 0, 51));
        LblOrg.setText("Organization");

        lbltitle.setBackground(new java.awt.Color(180, 195, 195));
        lbltitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(102, 0, 102));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("MANAGE EMPLOYEE WORKAREA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addGap(165, 165, 165)
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblOrg)
                            .addComponent(LblName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(lblOrganisation)
                                .addGap(100, 100, 100)
                                .addComponent(orgcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btncreate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback)
                    .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrganisation))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblOrg)
                    .addComponent(CbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblName))
                .addGap(75, 75, 75)
                .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed

        Organisation org = (Organisation) CbOrg.getSelectedItem();
        String name = txtName.getText();
        if(org.getName().equals("Volunteer Organization")){
            org.getEmpDir().createVolunteer(name);
            autoPoptbl(org);
            return;
        }
        org.getEmpDir().createEmp(name);
        autoPoptbl(org);

    }//GEN-LAST:event_btncreateActionPerformed

    private void orgcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgcomboActionPerformed
        Organisation org= (Organisation) orgcombo.getSelectedItem();
        if (org != null){
            autoPoptbl(org);
        }
    }//GEN-LAST:event_orgcomboActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CbOrg;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblOrg;
    private javax.swing.JTable OrgTbl;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrganisation;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JComboBox orgcombo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
