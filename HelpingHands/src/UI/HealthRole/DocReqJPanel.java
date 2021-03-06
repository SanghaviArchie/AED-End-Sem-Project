/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HealthRole;

/**
 *
 * @author gauri
 */
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrg;
import Business.Organization.HealthOrg;
import Business.Organization.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalDoctorWorkReq;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DocReqJPanel extends javax.swing.JPanel {
    /**
     * Creates new form DocReqJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;
    
    public DocReqJPanel(JPanel userProcessContainer, UserAccount acc, Enterprise ent, Network net) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ent = ent;
        this.ua = acc;
        this.net = net;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnoofpat = new javax.swing.JLabel();
        txtnoofpat = new javax.swing.JTextField();
        btnreq = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        lblpurpose = new javax.swing.JLabel();
        lblpattype = new javax.swing.JLabel();
        lblcase = new javax.swing.JLabel();
        lbldoctype = new javax.swing.JLabel();
        rbnewcheckup = new javax.swing.JRadioButton();
        rbregcheckup = new javax.swing.JRadioButton();
        cbpattype = new javax.swing.JComboBox();
        cbdoctype = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpur = new javax.swing.JTextArea();
        lbltitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 0, 102));

        lblnoofpat.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblnoofpat.setForeground(new java.awt.Color(102, 0, 102));
        lblnoofpat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnoofpat.setText("Number of Patients:");

        txtnoofpat.setBackground(new java.awt.Color(204, 204, 204));
        txtnoofpat.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtnoofpat.setForeground(new java.awt.Color(102, 0, 102));

        btnreq.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnreq.setForeground(new java.awt.Color(102, 0, 102));
        btnreq.setText("REQUEST");
        btnreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreqActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(102, 0, 102));
        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblpurpose.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblpurpose.setForeground(new java.awt.Color(102, 0, 102));
        lblpurpose.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpurpose.setText("Purpose:");

        lblpattype.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblpattype.setForeground(new java.awt.Color(102, 0, 102));
        lblpattype.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpattype.setText("Patients Type:");

        lblcase.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblcase.setForeground(new java.awt.Color(102, 0, 102));
        lblcase.setText("Case:");

        lbldoctype.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lbldoctype.setForeground(new java.awt.Color(102, 0, 102));
        lbldoctype.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldoctype.setText("Doctor Type :");

        rbnewcheckup.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        rbnewcheckup.setForeground(new java.awt.Color(102, 0, 102));
        rbnewcheckup.setText("New Checkup");

        rbregcheckup.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        rbregcheckup.setForeground(new java.awt.Color(102, 0, 102));
        rbregcheckup.setSelected(true);
        rbregcheckup.setText("Regular Checkup");
        rbregcheckup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbregcheckupActionPerformed(evt);
            }
        });

        cbpattype.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        cbpattype.setForeground(new java.awt.Color(102, 0, 102));
        cbpattype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Child", "Adult", "Old", "Mix" }));

        cbdoctype.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        cbdoctype.setForeground(new java.awt.Color(102, 0, 102));
        cbdoctype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General Physician", "Pediatrician", "Cardiologist", "Urologist", "Psychiatrist", "Ophthalmologist", "Orthopedist", "Dermatologist" }));

        txtpur.setBackground(new java.awt.Color(204, 204, 204));
        txtpur.setColumns(20);
        txtpur.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtpur.setForeground(new java.awt.Color(102, 0, 102));
        txtpur.setRows(5);
        jScrollPane1.setViewportView(txtpur);

        lbltitle.setBackground(new java.awt.Color(255, 255, 255));
        lbltitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(102, 0, 102));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("New Doctor Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnback)
                .addContainerGap(715, Short.MAX_VALUE))
            .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpurpose)
                    .addComponent(lbldoctype)
                    .addComponent(lblcase)
                    .addComponent(lblnoofpat)
                    .addComponent(lblpattype))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbnewcheckup)
                            .addComponent(rbregcheckup)
                            .addComponent(txtnoofpat)
                            .addComponent(cbpattype, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbdoctype, 0, 250, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnreq))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addGap(15, 15, 15)
                .addComponent(lbltitle)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldoctype)
                    .addComponent(cbdoctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcase)
                    .addComponent(rbnewcheckup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbregcheckup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnoofpat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnoofpat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpattype, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbpattype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpurpose))
                .addGap(25, 25, 25)
                .addComponent(btnreq, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreqActionPerformed
        HospitalDoctorWorkReq req = new HospitalDoctorWorkReq();
        String doctype = (String)cbdoctype.getSelectedItem();
        if(doctype == null || doctype.equals("")){
            JOptionPane.showMessageDialog(null, "Doctor Type can't be empty!");
            return;
        }
        req.setDocType(doctype);

        String type = txtnoofpat.getText();
        if(type == null || type.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Patients cannot be empty!");
            return;
        }
        try {
            Integer.parseInt(type);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter a valid number for Number Of Patients.");
            return;
        }

        Integer totalpat = Integer.parseInt(type);
        if(totalpat<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of patients should not be less than or equal to zero");
            return;
        }
        req.setNoOfPatients(totalpat);

        String msg = txtpur.getText();
        if(msg == null || msg.equals("")){
            JOptionPane.showMessageDialog(null, "Purpose cannot be empty");
            return;
        }
        req.setMessage(msg);

        String pattype=(String)cbpattype.getSelectedItem();
        if(pattype == null || pattype.equals("")){
            JOptionPane.showMessageDialog(null, "Patient Type cannot be empty");
            return;
        }
        req.setPatientType(pattype);
        String patcase;
        if(rbnewcheckup.isSelected())
        {
            patcase="New Checkup";
        }
        else
        {
            patcase="Regular Checkup";
        }
        req.setCaseType(patcase);
        req.setSender(ua);
        req.setStatus("Sent");

       Organisation org = null;
       
        for(Enterprise e: net.getEntDir().getEntList())
        {
            if(e.getEntType().equals(e.getEntType().Hospital))
            {
                for (Organisation organization : e.getOrgDir().getOrgList())
                {
                    if (organization instanceof DoctorOrg){
                        org = organization;
                        org.getWorkQueue().getWrList().add(req);           
                    }
                }
            }
        }
        if (org!=null){
            ua.getWorkQueue().getWrList().add(req);
        }

        JOptionPane.showMessageDialog(null, "Successfully Sent Doctor Request");
        cbdoctype.setSelectedIndex(0);
        txtnoofpat.setText("");
        txtpur.setText("");
        cbpattype.setSelectedIndex(0);
        rbnewcheckup.setSelected(true);
    }//GEN-LAST:event_btnreqActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.autoPopReqTbl();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void rbregcheckupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbregcheckupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbregcheckupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnreq;
    private javax.swing.JComboBox cbdoctype;
    private javax.swing.JComboBox cbpattype;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcase;
    private javax.swing.JLabel lbldoctype;
    private javax.swing.JLabel lblnoofpat;
    private javax.swing.JLabel lblpattype;
    private javax.swing.JLabel lblpurpose;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JRadioButton rbnewcheckup;
    private javax.swing.JRadioButton rbregcheckup;
    private javax.swing.JTextField txtnoofpat;
    private javax.swing.JTextArea txtpur;
    // End of variables declaration//GEN-END:variables
}
