/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TransportorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organisation;
import Business.Organization.TransportOrg;
//import Business.Organization.VolunteerOrg;
import Business.Role.TransportorRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TutorVolunteerWorkReq;
import Business.WorkQueue.HospitalPharmacyWorkReq;
import Business.WorkQueue.VolunteerStorageWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
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
public class HomePagePanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount ua;
    private Enterprise ent;
    private TransportOrg org;
    /**
     * Creates new form HomePage
     */
    public HomePagePanel(JPanel userProcessContainer, UserAccount acc, Organisation org,  EcoSystem system, Enterprise ent) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ua = acc;
        this.system = system;
        this.ent = ent;
        this.org = (TransportOrg) org;
        autoPopOrders();
    }
    
    public void autoPopOrders(){    
        DefaultTableModel mdl = (DefaultTableModel) tblOrders.getModel();
        
        mdl.setRowCount(0);

        for (Iterator<WorkRequest> wr = org.getWorkQueue().getWrList().iterator(); wr.hasNext();) {
            WorkRequest workRequest = (WorkRequest) wr.next();
            if(workRequest instanceof VolunteerStorageWorkRequest){
                VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest) workRequest;
                if(req.getStatus().equalsIgnoreCase("Ordered")){
                    Object[] row = new Object[5];
                    row[0]= req;
                    row[1]=req.getSenderAddress();
                    row[2]= req.getRecieverAddress();
                    row[3] = req.getStatus();
                    mdl.addRow(row);
                }
            }else{
                HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq) workRequest;
                if(req.getStatus().equalsIgnoreCase("Delivery Requested")){
                    Object[] row = new Object[5];
                    row[0]= req;
                    row[2]= req.getSenderAdd();
                    row[1]= req.getRecieverAdd();
                    row[3] = req.getStatus();
                    mdl.addRow(row);
                }
            }
        }
    }
    
    private boolean checkPhoneNo(String phNo) {
        Pattern pattern = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = pattern.matcher(phNo);
        return matcher.matches();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        dtPickup = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        dtDeliver = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtPhNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSenderAddr = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReceiverAddr = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnAssignToMe = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 0, 102));

        jLabel25.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 102));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Delivery Work Area");

        tblOrders.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblOrders.setForeground(new java.awt.Color(102, 0, 102));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Sender Address", "Reciever Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("PickUp Date");

        dtPickup.setForeground(new java.awt.Color(102, 0, 102));
        dtPickup.setToolTipText("");
        dtPickup.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Delivery Date");

        dtDeliver.setForeground(new java.awt.Color(102, 0, 102));
        dtDeliver.setToolTipText("");
        dtDeliver.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Contact Number");

        txtPhNo.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtPhNo.setForeground(new java.awt.Color(102, 0, 102));
        txtPhNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhNoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Sender Address");

        txtSenderAddr.setBackground(new java.awt.Color(204, 204, 204));
        txtSenderAddr.setColumns(20);
        txtSenderAddr.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtSenderAddr.setForeground(new java.awt.Color(102, 0, 102));
        txtSenderAddr.setRows(5);
        jScrollPane2.setViewportView(txtSenderAddr);

        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Reciever Address ");

        txtReceiverAddr.setBackground(new java.awt.Color(204, 204, 204));
        txtReceiverAddr.setColumns(20);
        txtReceiverAddr.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtReceiverAddr.setForeground(new java.awt.Color(102, 0, 102));
        txtReceiverAddr.setRows(5);
        jScrollPane3.setViewportView(txtReceiverAddr);

        btnBack.setForeground(new java.awt.Color(102, 0, 102));
        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssignToMe.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnAssignToMe.setForeground(new java.awt.Color(102, 0, 102));
        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtDeliver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dtPickup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                    .addComponent(txtPhNo)))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(387, 387, 387)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssignToMe)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dtPickup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dtDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdersMouseClicked

        int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showConfirmDialog(null, "Make a row selection from the table to view desired details.","Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            WorkRequest wr = (WorkRequest) tblOrders.getValueAt(selectedRow, 0);
            if(wr instanceof VolunteerStorageWorkRequest){
                VolunteerStorageWorkRequest workRequest =(VolunteerStorageWorkRequest) wr;
                txtReceiverAddr.setText(workRequest.getRecieverAddress());
                txtSenderAddr.setText(workRequest.getSenderAddress());
            }else{
                HospitalPharmacyWorkReq workRequest =(HospitalPharmacyWorkReq) wr;
                txtSenderAddr.setText(workRequest.getRecieverAdd());
                txtReceiverAddr.setText(workRequest.getSenderAdd());
            }

        }
    }//GEN-LAST:event_tblOrdersMouseClicked

    private void txtPhNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhNoActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed

        int selectedRow = tblOrders.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showConfirmDialog(null, "For request assignment select a row from table.","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{

            WorkRequest wr = (WorkRequest)tblOrders.getValueAt(selectedRow, 0);
            if(wr instanceof VolunteerStorageWorkRequest){
                VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest) wr;

                Date pickupDate = dtPickup.getDate();
                if(pickupDate == null || pickupDate.equals("")){
                    JOptionPane.showMessageDialog(null, "Pick Up Date mandatory.");
                    return;
                }
                if(pickupDate.before(new Date())){
                    JOptionPane.showMessageDialog(null, "Enter valid date only.");
                    return;
                }

                req.setPickupDate(pickupDate);

                Date deliverDt = dtDeliver.getDate();
                if(deliverDt == null || deliverDt.equals("")){
                    JOptionPane.showMessageDialog(null, "Delivery Date mandatory.");
                    return;
                }
                if(deliverDt.before(new Date())){
                    JOptionPane.showMessageDialog(null, "Enter valid date only.");
                    return;
                }
                SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
                String delDtStr = fmt.format(deliverDt);
                String pickDtStr = fmt.format(pickupDate);
                if(delDtStr.compareTo(pickDtStr)<0){
                    JOptionPane.showMessageDialog(null, "Can't set delivery date prior to pickupdate.");
                    return;
                }
                req.setExpectedDelivery(deliverDt);

                String phNo = txtPhNo.getText();
                if(phNo == null || phNo.equals("")){
                    JOptionPane.showMessageDialog(null, "Contact Number mandatory.");
                    return;
                }
                if(!checkPhoneNo(phNo)){
                    JOptionPane.showMessageDialog(null, "Invalid Contact Number.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                req.setDeliveryNumber(phNo);

                req.setDelivery(ua);
                ua.getWorkQueue().getWrList().add(req);
                req.setStatus("Delivery Assigned");
                txtPhNo.setText("");
                txtSenderAddr.setText("");
                txtReceiverAddr.setText("");
                dtPickup.setDate(null);
                dtDeliver.setDate(null);
                JOptionPane.showMessageDialog(null, "Delivery Request assignment successful.");

                autoPopOrders();
            }
            else{
                HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq) wr;
                Date pickupDate = dtPickup.getDate();
                if(pickupDate == null || pickupDate.equals("")){
                    JOptionPane.showMessageDialog(null, "Pick Up Date Mandatory.");
                    return;
                }
                req.setPickupDate(pickupDate);

                Date deliverDt = dtDeliver.getDate();
                if(deliverDt == null || deliverDt.equals("")){
                    JOptionPane.showMessageDialog(null, "Delivery Date Mandatory.");
                    return;
                }
                req.setExpectedDelivery(deliverDt);

                String phNo = txtPhNo.getText();
                if(phNo == null || phNo.equals("")){
                    JOptionPane.showMessageDialog(null, "Contact Number Mandatory");
                    return;
                }
                if(!checkPhoneNo(phNo)){
                    JOptionPane.showMessageDialog(null, "Enter valid phone number", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                req.setDeliveryNo(phNo);

                req.setDelivery(ua);
                ua.getWorkQueue().getWrList().add(req);
                req.setStatus("Delivery Assigned");
                txtPhNo.setText("");
                txtSenderAddr.setText("");
                txtReceiverAddr.setText("");
                dtPickup.setDate(null);
                dtDeliver.setDate(null);
                JOptionPane.showMessageDialog(null, "Delivery Request Assignment Successful");

                autoPopOrders();
            }
        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnBack;
    private com.toedter.calendar.JDateChooser dtDeliver;
    private com.toedter.calendar.JDateChooser dtPickup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextArea txtReceiverAddr;
    private javax.swing.JTextArea txtSenderAddr;
    // End of variables declaration//GEN-END:variables
}