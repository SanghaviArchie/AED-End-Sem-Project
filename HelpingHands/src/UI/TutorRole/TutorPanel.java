/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TutorRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrg;
import Business.Organization.TutorOrg;
import Business.Organization.Organisation;
import Business.Organization.VolunteerOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TutorVolunteerWorkReq;
import Business.WorkQueue.LaboratoryTestWorkReq;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class TutorPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TutorOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;

    /**
     * Creates new form TutorPanel
     */
    public TutorPanel(JPanel userProcessContainer, UserAccount acc, TutorOrg org, Enterprise ent, Network net) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.ent = ent;
        this.ua = acc;
        this.net = net;
        autoPopReqTbl();

    }
    
    public void autoPopReqTbl(){
        DefaultTableModel mdl = (DefaultTableModel) tblVolReq.getModel();
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd MMM, yyyy");
        mdl.setRowCount(0);
        for (Iterator<WorkRequest> wr = ua.getWorkQueue().getWrList().iterator(); wr.hasNext();) {
            TutorVolunteerWorkReq req = (TutorVolunteerWorkReq) wr.next();
            Object[] row = new Object[6];
            row[0] = req;
            String dt = fmt.format(req.getDate());
            row[1] = dt;
            row[2] = req.getTime();
            row[3] = req.getNumOfVolunteers(); 
            row[4] = req.getVacancy();
            row[5] = req.getStatus();
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

        btnViewReqDetail = new javax.swing.JButton();
        btnNewReq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolReq = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVolList = new javax.swing.JButton();
        btnDeleteReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnViewReqDetail.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnViewReqDetail.setForeground(new java.awt.Color(102, 0, 102));
        btnViewReqDetail.setText("View Request Details");
        btnViewReqDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReqDetailActionPerformed(evt);
            }
        });

        btnNewReq.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnNewReq.setForeground(new java.awt.Color(102, 0, 102));
        btnNewReq.setText("Create New Request");
        btnNewReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewReqActionPerformed(evt);
            }
        });

        tblVolReq.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 12)); // NOI18N
        tblVolReq.setForeground(new java.awt.Color(102, 0, 102));
        tblVolReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Job Title", "Date", "Time", "No. of Volunteers", "Vacancy", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVolReq.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblVolReq);

        btnRefresh.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(102, 0, 102));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tutor Panel");

        btnVolList.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnVolList.setForeground(new java.awt.Color(102, 0, 102));
        btnVolList.setText("Get Volunteers List");
        btnVolList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolListActionPerformed(evt);
            }
        });

        btnDeleteReq.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnDeleteReq.setForeground(new java.awt.Color(102, 0, 102));
        btnDeleteReq.setText("Delete Request");
        btnDeleteReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnVolList, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNewReq, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteReq, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewReqDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnVolList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnNewReq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteReq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewReqDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewReqDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReqDetailActionPerformed
        int selectedrow= tblVolReq.getSelectedRow();
        if (selectedrow>=0)
        {
            TutorVolunteerWorkReq req = (TutorVolunteerWorkReq)tblVolReq.getValueAt(selectedrow, 0);
            ViewReqDetailPanel viewReq = new ViewReqDetailPanel(userProcessContainer, req);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("ViewRequestDetailsJPanel",viewReq);
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Make row selection","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewReqDetailActionPerformed

    private void btnNewReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewReqActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ReqVolunteerPanel", new ReqVolunteerPanel(userProcessContainer, ua, ent));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewReqActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        autoPopReqTbl();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnVolListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolListActionPerformed

        int selectedrow= tblVolReq.getSelectedRow();
        if (selectedrow>=0)
        {
            TutorVolunteerWorkReq req = (TutorVolunteerWorkReq)tblVolReq.getValueAt(selectedrow, 0);
            ViewReqDetailPanel viewReq = new ViewReqDetailPanel(userProcessContainer, req);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("ViewVolunteersJPanel",viewReq);
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Make row selection","Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnVolListActionPerformed

    private void btnDeleteReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReqActionPerformed
        int selectedRow = tblVolReq.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "sure about deleting?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                TutorVolunteerWorkReq req = (TutorVolunteerWorkReq)tblVolReq.getValueAt(selectedRow, 0);

                Organisation org = null;
                for (Organisation organization : ent.getOrgDir().getOrgList()){
                    if (organization instanceof VolunteerOrg){
                        org = organization;
                        break;}}

                if (org!=null){
                    org.getWorkQueue().getWrList().remove(req);
                    ua.getWorkQueue().getWrList().remove(req);
                }
                autoPopReqTbl();

            }
        }else{
            JOptionPane.showMessageDialog(null, "Make row selection");
        }
    }//GEN-LAST:event_btnDeleteReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteReq;
    private javax.swing.JButton btnNewReq;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewReqDetail;
    private javax.swing.JButton btnVolList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVolReq;
    // End of variables declaration//GEN-END:variables
}
