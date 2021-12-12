/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import Business.Employee.Employee;
import Business.Employee.Volunteer;
import Business.Enterprise.Enterprise;
import Business.Organization.Organisation;
import Business.Role.Role;
import static Business.Role.Role.Type.Volunteer;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauri
 */
public class ManageUserAccJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccJPanel
     */
    private JPanel container;
    private Enterprise ent;

    public ManageUserAccJPanel(JPanel usercontainer, Enterprise ent) {
        initComponents();
        this.ent = ent;
        this.container = usercontainer;
        popOrgCB();
        autoPopData();
    }
    public void popOrgCB() {
        orgcb.removeAllItems();
        for (Organisation org : ent.getOrgDir().getOrgList()) {
            orgcb.addItem(org);
        }
    }
    public void populateEmployeeComboBox(Organisation org){
        empcb.removeAllItems();
        for (Employee emp : org.getEmpDir().getEmpList()){
            empcb.addItem(emp);
        }
    }
    private void populateRoleComboBox(Organisation org){
        rolecb.removeAllItems();
        for (Role role : org.getRoleList()){
            rolecb.addItem(role);
        }
    }
    public void autoPopData() {
        DefaultTableModel mdl = (DefaultTableModel) usertable.getModel();
        mdl.setRowCount(0);
        for (Organisation org : ent.getOrgDir().getOrgList()) {
            for (UserAccount ua : org.getUserAccDir().getUserAccList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) usertable.getModel()).addRow(row);
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

        btncreate = new javax.swing.JButton();
        lblusername = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        lblpwd = new javax.swing.JLabel();
        lblemp = new javax.swing.JLabel();
        empcb = new javax.swing.JComboBox();
        lblorg = new javax.swing.JLabel();
        orgcb = new javax.swing.JComboBox();
        lblrole = new javax.swing.JLabel();
        rolecb = new javax.swing.JComboBox();
        btnback = new javax.swing.JButton();
        lbltitle = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpwd = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 0, 102));

        btncreate.setBackground(new java.awt.Color(255, 255, 255));
        btncreate.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btncreate.setForeground(new java.awt.Color(102, 0, 102));
        btncreate.setText("Create User");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        lblusername.setBackground(new java.awt.Color(255, 255, 255));
        lblusername.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(102, 0, 102));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblusername.setText("User Name");

        usertable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        usertable.setForeground(new java.awt.Color(102, 0, 102));
        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usertable);

        lblpwd.setBackground(new java.awt.Color(255, 255, 255));
        lblpwd.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblpwd.setForeground(new java.awt.Color(102, 0, 102));
        lblpwd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblpwd.setText("Password");

        lblemp.setBackground(new java.awt.Color(255, 255, 255));
        lblemp.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblemp.setForeground(new java.awt.Color(102, 0, 102));
        lblemp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblemp.setText("Employee");

        empcb.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        empcb.setForeground(new java.awt.Color(102, 0, 102));
        empcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblorg.setBackground(new java.awt.Color(255, 255, 255));
        lblorg.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblorg.setForeground(new java.awt.Color(102, 0, 102));
        lblorg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblorg.setText("Organization");

        orgcb.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        orgcb.setForeground(new java.awt.Color(102, 0, 102));
        orgcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgcbActionPerformed(evt);
            }
        });

        lblrole.setBackground(new java.awt.Color(255, 255, 255));
        lblrole.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        lblrole.setForeground(new java.awt.Color(102, 0, 102));
        lblrole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblrole.setText("Role");

        rolecb.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        rolecb.setForeground(new java.awt.Color(102, 0, 102));
        rolecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rolecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolecbActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lbltitle.setBackground(new java.awt.Color(255, 255, 255));
        lbltitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(102, 0, 102));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("MANAGE USER ACCOUNT WORKAREA");

        txtusername.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(102, 0, 102));

        txtpwd.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addGap(84, 84, 84)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpwd)
                    .addComponent(lblorg)
                    .addComponent(lblemp)
                    .addComponent(lblrole)
                    .addComponent(lblusername))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btncreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orgcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rolecb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtusername)
                            .addComponent(empcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback)
                    .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblorg)
                            .addComponent(orgcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblemp)
                            .addComponent(empcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblrole)
                            .addComponent(rolecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblusername)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpwd)
                            .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 private boolean checkPassword(String input){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$#&])[A-Za-z\\d$#*&]{6,}$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        String UName = txtusername.getText();
        String Pwd = String.valueOf(txtpwd.getPassword());
        Organisation org = (Organisation) orgcb.getSelectedItem();

        Role role = (Role) rolecb.getSelectedItem();
        if(empcb.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "Select Employee/ Create New Employee");
            return;
        }
        Employee emp = (Employee) empcb.getSelectedItem();
        if(UName.equals("") || UName==null || Pwd.equals("") || Pwd==null){
            JOptionPane.showMessageDialog(null, "Emter Login information.");
            return;
        }

        for(UserAccount acc:org.getUserAccDir().getUserAccList()){
            if(acc.getUname().equals(UName)){
                JOptionPane.showMessageDialog(null, "This username is already in use.");
                return;
            }
        }
        for(UserAccount acc:org.getUserAccDir().getUserAccList()){
            if(acc.getEmp()== emp){
                JOptionPane.showMessageDialog(null, "This employee already exists for other account.");
                return;
            }
        }
        if(org.getName().equals("Volunteer Organization")){
            Volunteer vol = (Volunteer) emp;
            org.getUserAccDir().createAccount(UName, Pwd, vol, role);

        } else {
            org.getUserAccDir().createAccount(UName, Pwd, emp, role);
        }
        txtusername.setText("");
        txtpwd.setText("");
        autoPopData();
    }//GEN-LAST:event_btncreateActionPerformed

    private void orgcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgcbActionPerformed
        Organisation organization = (Organisation) orgcb.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_orgcbActionPerformed

    private void rolecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolecbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolecbActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JComboBox empcb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblemp;
    private javax.swing.JLabel lblorg;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel lblrole;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblusername;
    private javax.swing.JComboBox orgcb;
    private javax.swing.JComboBox rolecb;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
