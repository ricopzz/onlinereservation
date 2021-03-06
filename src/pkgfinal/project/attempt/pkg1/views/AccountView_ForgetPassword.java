/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.attempt.pkg1.views;

import java.awt.event.ActionListener;

/**
 *
 * @author Yosua
 */
public class AccountView_ForgetPassword extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public AccountView_ForgetPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNewPassword = new javax.swing.JPanel();
        lblTextTop2 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JTextField();
        btnFinish = new javax.swing.JButton();
        panelVerificationCode = new javax.swing.JPanel();
        lblTextTop1 = new javax.swing.JLabel();
        txtVerificationCode = new javax.swing.JTextField();
        btnVerify = new javax.swing.JButton();
        panelEmail = new javax.swing.JPanel();
        lblTextTop = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTextTop2.setText("New Password");

        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.setMargin(new java.awt.Insets(1, 14, 2, 14));
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNewPasswordLayout = new javax.swing.GroupLayout(panelNewPassword);
        panelNewPassword.setLayout(panelNewPasswordLayout);
        panelNewPasswordLayout.setHorizontalGroup(
            panelNewPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewPasswordLayout.createSequentialGroup()
                .addGroup(panelNewPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNewPasswordLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNewPasswordLayout.createSequentialGroup()
                        .addGroup(panelNewPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNewPasswordLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNewPasswordLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(lblTextTop2)))
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelNewPasswordLayout.setVerticalGroup(
            panelNewPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewPasswordLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblTextTop2)
                .addGap(18, 18, 18)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnFinish)
                .addContainerGap())
        );

        lblTextTop1.setText("Enter the verification code below");

        txtVerificationCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerificationCodeActionPerformed(evt);
            }
        });

        btnVerify.setText("Verify");
        btnVerify.setMargin(new java.awt.Insets(1, 14, 2, 14));
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVerificationCodeLayout = new javax.swing.GroupLayout(panelVerificationCode);
        panelVerificationCode.setLayout(panelVerificationCodeLayout);
        panelVerificationCodeLayout.setHorizontalGroup(
            panelVerificationCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerificationCodeLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(panelVerificationCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTextTop1)
                    .addComponent(txtVerificationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerificationCodeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelVerificationCodeLayout.setVerticalGroup(
            panelVerificationCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerificationCodeLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblTextTop1)
                .addGap(30, 30, 30)
                .addComponent(txtVerificationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnVerify)
                .addContainerGap())
        );

        lblTextTop.setText("Please enter your email below and we'll send you ");

        lblText.setText("A verification code to change your password");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnContinue.setText("Continue");
        btnContinue.setMargin(new java.awt.Insets(1, 14, 2, 14));

        javax.swing.GroupLayout panelEmailLayout = new javax.swing.GroupLayout(panelEmail);
        panelEmail.setLayout(panelEmailLayout);
        panelEmailLayout.setHorizontalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelEmailLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(lblText))
                        .addComponent(lblTextTop))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmailLayout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEmailLayout.setVerticalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lblTextTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblText)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnContinue)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerificationCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerificationCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtVerificationCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerificationCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerificationCodeActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinishActionPerformed

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
            java.util.logging.Logger.getLogger(AccountView_ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountView_ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountView_ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountView_ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountView_ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTextTop;
    private javax.swing.JLabel lblTextTop1;
    private javax.swing.JLabel lblTextTop2;
    private javax.swing.JPanel panelEmail;
    private javax.swing.JPanel panelNewPassword;
    private javax.swing.JPanel panelVerificationCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNewPassword;
    private javax.swing.JTextField txtVerificationCode;
    // End of variables declaration//GEN-END:variables

    public void addContinueActionListener(ActionListener actionListener) {
        btnContinue.addActionListener(actionListener);
    }
    public void addVerifyActionListener(ActionListener actionListener) {
        btnVerify.addActionListener(actionListener);
    }
    public void addFinishActionListener(ActionListener actionListener) {
        btnFinish.addActionListener(actionListener);
    }
    
    public void setEmailPanelVisible(boolean a){
        panelEmail.setVisible(a);
    } 
    public void setVerificationCodePanelVisible(boolean a){
        panelVerificationCode.setVisible(a);
    } 
    public void setNewPasswordPanelVisible(boolean a){
        panelNewPassword.setVisible(a);
    } 
    
    public String getEmail(){
        return txtEmail.getText();
    }
    public String getVerificationCode(){
        return txtVerificationCode.getText();
    }
    public String getNewPassword(){
        return txtNewPassword.getText();
    }
}
