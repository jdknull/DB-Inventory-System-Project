
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


 class Add_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Add_Customer
     */
    public Add_Customer() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Caddress = new javax.swing.JTextField();
        Cmname = new javax.swing.JTextField();
        AddCustomer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Clname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cphone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cfname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Middle Name");

        jLabel8.setText("Address");

        Caddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaddressActionPerformed(evt);
            }
        });

        Cmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmnameActionPerformed(evt);
            }
        });

        AddCustomer.setText("Add");
        AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerActionPerformed(evt);
            }
        });

        jLabel6.setText("Last Name");

        Clname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClnameActionPerformed(evt);
            }
        });

        jLabel2.setText("Add Customer");

        jLabel3.setText("Phone");

        Cphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CphoneActionPerformed(evt);
            }
        });

        jLabel4.setText("First Name");

        Cfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CfnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Cmname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clname, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Cphone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Cfname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(Caddress, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cmname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Caddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(AddCustomer)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaddressActionPerformed

    private void CmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmnameActionPerformed

    private void AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerActionPerformed
        // TODO add your handling code here:
        try {
            if (Cphone.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Phone is empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Cfname.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "First name is empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Cmname.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Middle  name is empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Clname.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Last name is empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Caddress.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Customer Address is empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                //insert into Dependent values(0532512490,'Saeed', 'Mastour', 'AlHarbi', 7);
                String query = "insert into Customer values(" + Cphone.getText() + ",'" + Cfname.getText() + "','" + Cmname.getText() + "','" + Clname.getText() + "','" + Caddress.getText() + "')";
                Statement statement = con.prepareStatement(query);
                ResultSet Rs = statement.executeQuery(query);

                query = "commit";
                statement = con.prepareStatement(query);
                Rs = statement.executeQuery(query);

                JOptionPane.showMessageDialog(this, "Customer has beem Added");
                this.setVisible(false);
                this.dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, " Error: " + e.getMessage());
        }
    }//GEN-LAST:event_AddCustomerActionPerformed

    private void ClnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClnameActionPerformed

    private void CphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CphoneActionPerformed

    private void CfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CfnameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Customer().setVisible(true);
            }
        });
    }
    Connection con;

    public void setConnection(Connection con) {
        this.con = con;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomer;
    private javax.swing.JTextField Caddress;
    private javax.swing.JTextField Cfname;
    private javax.swing.JTextField Clname;
    private javax.swing.JTextField Cmname;
    private javax.swing.JTextField Cphone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
