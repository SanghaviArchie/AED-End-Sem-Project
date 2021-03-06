/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TutorRole;
import Business.Enterprise.Enterprise;
import Business.Organization.Organisation;
import Business.Organization.VolunteerOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TutorVolunteerWorkReq;
import Business.WorkQueue.LaboratoryTestWorkReq;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
/**
 *
 * @author DELL
 */
public class ReqVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReqVolunteerPanel
     */
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount ua;
    
    public ReqVolunteerPanel(JPanel userProcessContainer, UserAccount acc, Enterprise ent) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ent = ent;
        this.ua = acc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtArea = new javax.swing.JTextField();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        tsTime = new javax.swing.JSpinner(sm);
        dtChoser = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRequirements = new javax.swing.JTextArea();
        txtTitle = new javax.swing.JTextField();
        txtNoOfStudents = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNoOfVol = new javax.swing.JTextField();
        requestVolunteerJButton = new javax.swing.JButton();
        txtNoOfHrs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 0, 102));

        txtArea.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtArea.setForeground(new java.awt.Color(102, 0, 102));

        JSpinner.DateEditor de = new JSpinner.DateEditor(tsTime, "HH:mm");
        tsTime.setEditor(de);
        tsTime.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        dtChoser.setToolTipText("");
        dtChoser.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        txtRequirements.setColumns(20);
        txtRequirements.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtRequirements.setRows(5);
        jScrollPane4.setViewportView(txtRequirements);

        txtTitle.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(102, 0, 102));

        txtNoOfStudents.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtNoOfStudents.setForeground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Job Title:");

        jLabel8.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Number of Students:");

        jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Date:");

        txtPlace.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtPlace.setForeground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Requirements:");

        jLabel7.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Place:");

        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 102));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Number of Volunteers:");

        txtNoOfVol.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtNoOfVol.setForeground(new java.awt.Color(102, 0, 102));

        requestVolunteerJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        requestVolunteerJButton.setForeground(new java.awt.Color(102, 0, 102));
        requestVolunteerJButton.setText("CREATE");
        requestVolunteerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVolunteerJButtonActionPerformed(evt);
            }
        });

        txtNoOfHrs.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtNoOfHrs.setForeground(new java.awt.Color(102, 0, 102));

        jLabel4.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Number of Hours:");

        jLabel9.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Area:");

        jLabel6.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Time: ");

        jLabel10.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("New Volunteer Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtNoOfHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(requestVolunteerJButton)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNoOfStudents, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtNoOfVol, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTitle)
                                            .addComponent(dtChoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tsTime)
                                            .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(299, Short.MAX_VALUE))))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtChoser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tsTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoOfHrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNoOfVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(requestVolunteerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TutorPanel tutorPanel = (TutorPanel) component;
        tutorPanel.autoPopReqTbl();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void requestVolunteerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVolunteerJButtonActionPerformed

        TutorVolunteerWorkReq req = new TutorVolunteerWorkReq();

        String title = txtTitle.getText();
        if(title== null || title.equals("")){
            JOptionPane.showMessageDialog(null, "Job Title cannot be left empty");
            return;
        }
        req.setTitle(title);

        Date dt = dtChoser.getDate();
        if(dt == null || dt.equals("")){
            JOptionPane.showMessageDialog(null, "Date cannot be left empty");
            return;
        }
        if(dt.before(new Date())){
            JOptionPane.showMessageDialog(null, "Invalid Date");
            return;
        }
        req.setDate(dt);

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm");

        Date time =  (Date) tsTime.getValue();
        String volTime = fmt.format(time);
        if(volTime == null || volTime.equals("")){
            JOptionPane.showMessageDialog(null, "Time field mandatory");
            return;
        }
        req.setTime(volTime);

        String volPlace = txtPlace.getText();
        if(volPlace == null || volPlace.equals("")){
            JOptionPane.showMessageDialog(null, "Place field mandatory");
            return;
        }
        req.setAddress(volPlace);

        String volArea = txtArea.getText();
        if(volArea == null || volArea.equals("")){
            JOptionPane.showMessageDialog(null, "Area field mandatory");
            return;
        }
        req.setArea(volArea);

        String noOfHrs = txtNoOfHrs.getText();
        if(noOfHrs == null || noOfHrs.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Hours field mandatory.");
            return;
        }
        req.setNumOfhours(noOfHrs);

        String stud = txtNoOfStudents.getText();
        if(stud == null || stud.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Students field mandatory.");
            return;
        }

        try {

            Integer.parseInt(stud);

        } catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Please enter a valid number for Number Of Students field");
            return;
        }
        Integer noOfStud = Integer.parseInt(stud);
        if(noOfStud<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of students should not less than or equal to zero.");
            return;
        }
        req.setNumOfStudents(noOfStud);

        String noOfVol = txtNoOfVol.getText();
        if(noOfVol == null || noOfVol.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Volunteers field is mandatory");
            return;
        }

        try {

            Integer.parseInt(noOfVol);

        } catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Please enter a valid number for Number Of Volunteers field");
            return;
        }
        Integer numVol = Integer.parseInt(noOfVol);
        if(numVol<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of volunteers should not be less than or equal to zero.");
            return;
        }
        req.setNumOfVolunteers(numVol);
        req.setVacancy(numVol);

        String requirements = txtRequirements.getText();
        if(requirements == null || requirements.equals("")){
            JOptionPane.showMessageDialog(null, "Requirements field mandatory");
            return;
        }
        req.setMessage(requirements);
        req.setSender(ua);
        req.setStatus("Sent");

        Organisation orgs = null;
        for (Organisation organisations : ent.getOrgDir().getOrgList()){
            if (organisations instanceof VolunteerOrg){
                orgs = organisations;
                break;
            }
        }
        if (orgs!=null){
            orgs.getWorkQueue().getWrList().add(req);
            ua.getWorkQueue().getWrList().add(req);
        }

        JOptionPane.showMessageDialog(null, "Volunteer Request succesfully sent.");

        txtTitle.setText("");
        dtChoser.setDate(null);
        txtPlace.setText("");
        txtArea.setText("");
        txtNoOfHrs.setText("");
        txtNoOfStudents.setText("");
        txtNoOfVol.setText("");
        txtRequirements.setText("");
    }//GEN-LAST:event_requestVolunteerJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private com.toedter.calendar.JDateChooser dtChoser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton requestVolunteerJButton;
    private javax.swing.JSpinner tsTime;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtNoOfHrs;
    private javax.swing.JTextField txtNoOfStudents;
    private javax.swing.JTextField txtNoOfVol;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextArea txtRequirements;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
