import java.awt.Dimension;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kushal
 */
public class log_in extends javax.swing.JFrame {

    /**
     * Creates new form log_in
     */
    public log_in() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 127, 34, 0);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("User_ID :-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 130, 90, 30);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("XYZ OFFICE SALARY MANAGEMENT SYSTEM");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 30, 620, 32);

        t1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t1.requestFocus();
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(350, 120, 222, 40);

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("PASSWORD :-");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 210, 120, 30);

        b1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        b1.setText("SIGN_IN");
        b1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(410, 310, 90, 30);

        b4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        b4.setText("NEW_USER");
        b4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(420, 500, 63, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 430, 940, 20);

        b3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        b3.setText("FORGOT_PASSWORD");
        b3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(390, 460, 130, 30);

        b5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        b5.setText("CLEAR");
        b5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(420, 353, 65, 30);

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(420, 530, 73, 19);
        getContentPane().add(t2);
        t2.setBounds(350, 200, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city1234.jpg"))); // NOI18N
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(new java.awt.Dimension(950, 570));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        
        String A,B;
       A=t1.getText();
        B=new String(t2.getPassword());
        try{
    Class.forName("java.sql.DriverManager");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salarymanagement","root","");
    String sql;
    A=t1.getText();
     B=new String(t2.getPassword());
    sql="select * from USERS where USER_ID="+A;
    System.out.print(sql);
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(sql);
     
 if(rs.next())
 {
      // JOptionPane.showMessageDialog(null,"INCORRECT USER_ID OR PASSWORD PLEASE CROSS-CHECK OR RESET PASSWORD"); 
 
   // else{
       
         String a=rs.getString("USER_ID");
        String b=rs.getString("password");
               
         
      if(a.equals(A) && b.equals(B))
      {
         
           JOptionPane.showMessageDialog(null,"WELCOME TO XYZ COMPANY");
          b1.setVisible(false);
          
          b3.setVisible(false);
          b5.setVisible(false);
          b4.setVisible(false);
          t1.setText("");
          t2.setText("");
          t1.setEditable(false);
          t2.setEditable(false);
 dispose();
input_screen s = new input_screen();
s.setVisible(true);
      }
      
      else{
           JOptionPane.showMessageDialog(this,"INCORRECT USER_ID OR PASSWORD PLEASE CROSS-CHECK OR RESET PASSWORD");
      }
     
      

 }}
catch(Exception e)
{
    
    JOptionPane.showMessageDialog(null,e.getMessage());
    JOptionPane.showMessageDialog(null,"INCORRECT USER_ID OR PASSWORD PLEASE CROSS-CHECK OR RESET PASSWORD");
    
}
        
    }//GEN-LAST:event_b1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
t1.setText("");
t2.setText("");
b1.setVisible(true);
//b2.setVisible(false);
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
login_newuser w = new login_newuser();
w.setVisible(true);
dispose();
    }//GEN-LAST:event_b4ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
dispose();
forgot_password q = new forgot_password();
q.setVisible(true);
    }//GEN-LAST:event_b3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables

    
}
