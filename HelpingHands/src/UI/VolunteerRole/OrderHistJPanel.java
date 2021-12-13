/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.VolunteerRole;

/**
 *
 * @author gauri
 */
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TutorVolunteerWorkReq;
import Business.WorkQueue.HospitalDoctorWorkReq;
import Business.WorkQueue.VolunteerStorageWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UI.DoctorRole.DoctorPanel;
public class OrderHistJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderHistJPanel
     */
    private JPanel userPCont;
    private UserAccount userAcc;
    private Enterprise ent;
    public OrderHistJPanel(JPanel userPCont, UserAccount userAcc, Enterprise ent) {
        initComponents();
        this.userPCont=userPCont;
        this.userAcc=userAcc;
        this.ent=ent;
        populateOrderHistTbl();
    }
public void populateOrderHistTbl()
    {

        DefaultTableModel mdl = (DefaultTableModel) tblorderhist.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM, yyyy");
        mdl.setRowCount(0);
        for (Iterator<WorkRequest> it = userAcc.getWorkQueue().getWrList().iterator(); it.hasNext();) {
            WorkRequest WR=it.next();
            if(WR instanceof VolunteerStorageWorkRequest)
            {
               
            VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest) WR;

            Object[] row = new Object[7];
            row[0] = req;
            
            row[1] = req.getStatus();
            row[2] = req.getReceiver();
            row[3] = req.getRecieverNumber();
            
            
            if(req.getPickupDate() ==null){
                row[6] = "";
            }else{
                Date dt = req.getPickupDate();
                String pickDt = formatter.format(dt);
                row[6] = pickDt; 
            }
            
            row[5] = req.getDeliveryNumber();
            if(req.getDelivery()==null){
                row[4] = "";
            }else{
                row[4] = req.getDelivery().getEmp().getName();
            }
            
            mdl.addRow(row);
            }
        }
    }
public void populateorderdetailstbl(ArrayList<String> category, ArrayList<Integer> quantity, ArrayList<String> description)
    {
         DefaultTableModel mdl = (DefaultTableModel) tblorderdetails.getModel();
        
        
        mdl.setRowCount(0);
                int L= category.size();
                System.out.println(L);
                System.out.println(quantity.size());
                System.out.println(description.size());
                for(int i=0;i<L;i++)
                {
                    
                    Object[] row = new Object[3];
                    row[0] = category.get(i);
                    row[1] = quantity.get(i);
                    row[2] = description.get(i);
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

        jScrollPane5 = new javax.swing.JScrollPane();
        tblorderhist = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblorderdetails = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        lblorderhist = new javax.swing.JLabel();
        lblorderdetails = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 0, 102));

        tblorderhist.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblorderhist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Status", "Reciever", "Reciever Contact", "Pickup By", "Delivery Contact", "Pickup Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorderhist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblorderhistMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblorderhist);

        tblorderdetails.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblorderdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Quantity", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblorderdetails);

        btnback.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblorderhist.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        lblorderhist.setText("Order History");

        lblorderdetails.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        lblorderdetails.setText("Order Details");

        lbltitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Volunteer Order History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblorderhist)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblorderdetails)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltitle)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblorderdetails, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblorderhist))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblorderhistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblorderhistMouseClicked
        int selRow = tblorderhist.getSelectedRow();

        if (selRow < 0){
            JOptionPane.showConfirmDialog(null, "Select a row from table.","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest)tblorderhist.getValueAt(selRow, 0);
            System.out.println(req.getOrdID());
            populateorderdetailstbl(req.getCategory(),req.getQuantity(),req.getDescription());
        }
    }//GEN-LAST:event_tblorderhistMouseClicked

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userPCont.remove(this);
        CardLayout layout = (CardLayout)userPCont.getLayout();
        layout.previous(userPCont);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblorderdetails;
    private javax.swing.JLabel lblorderhist;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblorderdetails;
    private javax.swing.JTable tblorderhist;
    // End of variables declaration//GEN-END:variables
}
