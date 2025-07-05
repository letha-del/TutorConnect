
package groupproject;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.regex.*;


public class Registration extends javax.swing.JFrame {
  Connection con;
  PreparedStatement ps;
  Statement st;
   
    public Registration() {
        initComponents();
        
    }
    
 
   

    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtStudents = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnRegister1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNames1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblStudNo = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblConPass = new javax.swing.JLabel();
        txtConPass = new javax.swing.JPasswordField();
        lblCon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Ques = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        lblQ = new javax.swing.JLabel();

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\software Eng\\test\\i.jpg")); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel4.setText("jLabel4");

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setText("CREATE NEW ACCOUNT");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 470, 56));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Enter Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 205, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Student No");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 205, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 500, -1));

        txtStudents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStudents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStudentsKeyReleased(evt);
            }
        });
        jPanel2.add(txtStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 500, -1));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Back >>");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 250, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 170, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Full Names");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 243, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1269, 212, 132, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1279, 222, 132, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1289, 232, 95, -1));

        btnRegister1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 250, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 127, 243, -1));

        txtNames1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNames1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNames1KeyReleased(evt);
            }
        });
        jPanel2.add(txtNames1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 500, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Confirm Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 205, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 500, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("New Password");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 205, -1));

        lblName.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 500, -1));

        lblStudNo.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.add(lblStudNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 500, -1));

        lblPhone.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 500, -1));

        lblPass.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 500, -1));

        lblConPass.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 500, -1));

        txtConPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConPassKeyReleased(evt);
            }
        });
        jPanel2.add(txtConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 500, 30));

        lblCon.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\software Eng\\test\\OIP (1)3.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 130, -1));

        Ques.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Question", "What is your favourate color?", "Who is your role model?" }));
        jPanel2.add(Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 500, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Answer Question");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        txtAnswer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        jPanel2.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 500, 30));

        lblQ.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lblQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        // TODO add your handling code here:
        String input = txtAnswer.getText().trim();
        if (input.matches("\\d+")) {
            // Input contains only digits, display error message

            lblQ.setText("Please enter a valid name no numbers allowed");
            lblQ.setForeground(Color.RED);
            txtAnswer.setBackground(Color.WHITE);
        } else {
            // Input contains only letters, set text field to green
            lblQ.setText("");
            lblQ.setForeground(Color.GREEN);
            txtAnswer.setBackground(Color.GREEN);

        }
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void txtConPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConPassKeyReleased
        String confirm = txtConPass.getText();
        String password = txtPass.getText();

        if (!confirm.equals(password)) {
            lblConPass.setText("Passwords do not match");
            lblConPass.setForeground(Color.RED);
            txtConPass.setBackground(Color.WHITE);
        } else {
            lblConPass.setText("Passwords match");
            lblConPass.setForeground(Color.GREEN);
            txtConPass.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_txtConPassKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        String password = txtPass.getText();
        if (password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+$")) {
            if (password.length() >= 8) {
                lblPass.setText("Strong Password");
                lblPass.setForeground(Color.GREEN);
                txtPass.setBackground(Color.GREEN);
            } else {
                lblPass.setText("Medium Password (must be at least 8 characters)");
                lblPass.setForeground(Color.YELLOW.darker());
                txtPass.setBackground(Color.YELLOW);
            }
        } else {
            lblPass.setText("Weak Password (must contain letters and numbers)");
            lblPass.setForeground(Color.RED);
            txtPass.setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_txtPassKeyReleased

    private void txtNames1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNames1KeyReleased
        String input = txtNames1.getText().trim();
        if (input.matches("\\d+")) {
            // Input contains only digits, display error message

            lblName.setText("Please enter a valid name no numbers allowed");
            lblName.setForeground(Color.RED);
            txtNames1.setBackground(Color.WHITE);
        } else {
            // Input contains only letters, set text field to green
            lblName.setText("");
            lblName.setForeground(Color.GREEN);
            txtNames1.setBackground(Color.GREEN);

        }
    }//GEN-LAST:event_txtNames1KeyReleased

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed

        connection();

    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtNames1.setText(null);
        txtStudents.setText(null);
        txtEmail.setText(null);
        txtPass.setText(null);
        txtConPass.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Login SignUpFrame= new Login();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStudentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudentsKeyReleased

        String input = txtStudents.getText().trim();
        if (!input.matches("\\d{9}")) {
            // Input does not contain exactly 9 digits
            if (input.matches("\\D+")) {
                // Input contains non-digits
                lblStudNo.setText("Student number must contain only digits.");
            } else {
                // Input contains digits but not 9 of them
                lblStudNo.setText("Student number must contain exactly 9 digits.");
            }
            lblStudNo.setForeground(Color.RED);
            txtStudents.setBackground(Color.WHITE);
        } else {
            // Input is a valid 9-digit number
            lblStudNo.setText("");
            txtStudents.setBackground(Color.GREEN);
        }

    }//GEN-LAST:event_txtStudentsKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased

        String emailText = txtEmail.getText();
        if (validateEmail(emailText)) {
            txtEmail.setBackground(Color.GREEN);
            lblPhone.setText("");
        } else {
            txtEmail.setBackground(Color.WHITE);
            lblPhone.setText("Email must contain letters, special characters, and numbers.");
        }
        }

        public static boolean validateEmail(String email) {
            // Regular expression to validate email format
            String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>])[A-Za-z\\d!@#$%^&*(),.?\":{}|<>]+$";
            return email.matches(regex);

    }//GEN-LAST:event_txtEmailKeyReleased
    private void checkPasswordsMatch() {
        String nonaPassword = String.valueOf(txtPass.getPassword());
        String confirmPassword = String.valueOf(txtConPass.getPassword());

        if (nonaPassword.equals(confirmPassword)) {
            lblConPass.setText("");
            lblConPass.setBackground(Color.GREEN);
        } else {
            lblCon.setText("Passwords do not match.");
            lblCon.setForeground(Color.RED);
            txtConPass.setBackground(Color.WHITE);
        }
}
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ques;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblConPass;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblQ;
    private javax.swing.JLabel lblStudNo;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JPasswordField txtConPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNames1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtStudents;
    // End of variables declaration//GEN-END:variables

    private void connection() {
        
     String Details = txtNames1.getText();
        String StudentNo = txtStudents.getText();
        String Email = txtEmail.getText();
        String Password = txtPass.getText();
        String Confirm = txtConPass.getText();
        String question = (String) Ques.getSelectedItem();
        String answer = txtAnswer.getText();

        String hostname = "jdbc:mysql://localhost:3306/stud";
        String username = "root";
        String passwords = "Lethabo27#";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(hostname, username, passwords);

            if ("".equals(Details)) {
                JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(StudentNo)) {
                JOptionPane.showMessageDialog(new JFrame(), "Student number is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(Email)) {
                JOptionPane.showMessageDialog(new JFrame(), "Contact number is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(Password)) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(Confirm)) {
                JOptionPane.showMessageDialog(new JFrame(), "Confirm password is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!Password.equals(Confirm)) {
                JOptionPane.showMessageDialog(new JFrame(), "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String query = "INSERT INTO admin (Details, Email, StudentNo, Passwords, ConfirmPass, Questions, Answer) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = con.prepareStatement(query)) {
                    pstmt.setString(1, Details);
                    pstmt.setString(2, Email);
                    pstmt.setString(3, StudentNo);
                    pstmt.setString(4, Password);
                    pstmt.setString(5, Confirm);
                    pstmt.setString(6, question);
                    pstmt.setString(7, answer);

                    pstmt.executeUpdate();

                    txtNames1.setText("");
                    txtEmail.setText("");
                    txtStudents.setText("");
                    txtPass.setText("");
                    txtConPass.setText("");
                    Ques.setSelectedIndex(0);
                    txtAnswer.setText("");

                    JOptionPane.showMessageDialog(null, "Account has been created successfully!");
                }
            }
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
   }

    private int calculatePasswordStrength(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      }
    

