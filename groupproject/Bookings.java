/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package groupproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.net.*;
import java.util.Base64;
import java.io.*;


/**
 *
 * @author Admin
 */
public class Bookings extends javax.swing.JFrame {

   
    ResultSet rs;
    Connection con;
    PreparedStatement ps;
    Statement st;
    
    public Bookings() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        module = new javax.swing.JComboBox<>();
        Book = new javax.swing.JButton();
        back = new javax.swing.JButton();
        time = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tutor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Module Name");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Tutor name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Enter Time");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        module.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        module.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Programming", "Information Systems", "ICT Fundamentals" }));
        module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleActionPerformed(evt);
            }
        });
        jPanel3.add(module, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 146, 370, 30));

        Book.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Book.setText("Book");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });
        jPanel3.add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 138, -1));

        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setText("Back>>");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 140, 30));

        time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 370, -1));
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 370, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Book Tutorial!");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        tutor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel3.add(tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 222, 370, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Choose Date");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\software Eng\\test\\OIP2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 90, -1));

        Cancel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancel1.setText("Cancel");
        Cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel1ActionPerformed(evt);
            }
        });
        jPanel3.add(Cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 147, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleActionPerformed
      String hostname = "jdbc:mysql://localhost:3306/stud";
String username = "root";
String passwords = "Lethabo27#";

  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(hostname, username, passwords);
    String query = "SELECT Tutor FROM tutor WHERE Modules = ?";
            ps = con.prepareStatement(query);
          String Modules = module.getSelectedItem().toString();
            
          ps.setString(1, Modules);
             rs = ps.executeQuery();

            if (rs.next()) {
                String tutorName = rs.getString("Tutor");
                tutor.setText(tutorName);
            } else {
                tutor.setText("No tutor found for this module.");
            }

        } catch (SQLException e) {
           tutor.setText("Database error: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookings.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
  
  
  }
    }//GEN-LAST:event_moduleActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed

        String Time = time.getText();
        String Module = module.getSelectedItem().toString();

        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        String issueDate = date_format.format(date.getDate());

        String hostname = "jdbc:mysql://localhost:3306/stud";
        String username = "root";
        String passwords = "Lethabo27#";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection(hostname, username, passwords);
            Statement st = con.createStatement();

            String query = "INSERT INTO appointment (Module, Date,Time) VALUES ( '" + Module+ "','" + issueDate+ "', '" + Time + "' )";
            st.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Appointment booked successfully!" );

            st.close();
            con.close();
                
            api ap = new api();
            try {
                ap.sms("akanyang", "@k4ny4nG","+27638505964", "Hi I hope you're well. I wanted to check if you'll be able to make it to the tutorial class? YES/NO", Time);
            } catch (Exception e) {
                System.out.println(e);
            }
            
            
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_BookActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

       Student SignUpFrame = new Student();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_backActionPerformed

    private void Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel1ActionPerformed
       tutor.setText("");
       time.setText("");
    }//GEN-LAST:event_Cancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book;
    private javax.swing.JButton Cancel1;
    private javax.swing.JButton back;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> module;
    private javax.swing.JTextField time;
    private javax.swing.JTextField tutor;
    // End of variables declaration//GEN-END:variables
}
