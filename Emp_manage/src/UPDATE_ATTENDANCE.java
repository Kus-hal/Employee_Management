import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kushal
 */
public class UPDATE_ATTENDANCE extends javax.swing.JFrame {

    /**
     * Creates new form UPDATE_ATTENDANCE
     */
    public UPDATE_ATTENDANCE() {
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

        T2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        T6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        T8 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(848, 554));
        getContentPane().setLayout(null);

        T2.setEditable(false);
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        getContentPane().add(T2);
        T2.setBounds(234, 216, 164, 43);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 204));
        jLabel2.setText("Employee no.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 80, 148, 43);
        getContentPane().add(T1);
        T1.setBounds(410, 80, 175, 43);

        T3.setEditable(false);
        getContentPane().add(T3);
        T3.setBounds(234, 299, 164, 43);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 204));
        jLabel4.setText("FOR MONTH");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(27, 299, 203, 43);

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 204));
        jLabel11.setText("YEAR");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(27, 382, 203, 43);

        T4.setEditable(false);
        getContentPane().add(T4);
        T4.setBounds(237, 383, 164, 43);

        T5.setEditable(false);
        getContentPane().add(T5);
        T5.setBounds(237, 463, 164, 43);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 204));
        jLabel5.setText("CL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(27, 463, 203, 43);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 204));
        jLabel6.setText("LWP");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 390, 86, 43);

        T6.setEditable(false);
        getContentPane().add(T6);
        T6.setBounds(660, 390, 164, 43);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 204));
        jLabel7.setText("PL");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 230, 107, 43);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 204));
        jLabel8.setText("ML");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(530, 310, 122, 43);

        T8.setEditable(false);
        getContentPane().add(T8);
        T8.setBounds(660, 310, 164, 43);

        T7.setEditable(false);
        getContentPane().add(T7);
        T7.setBounds(660, 230, 164, 43);

        b2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        b2.setText("LOAD DATA");
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(330, 140, 183, 47);

        b1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        b1.setText("UPDATE");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.setVisible(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(493, 464, 133, 47);

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(686, 464, 75, 47);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 204));
        jLabel3.setText("Employee no.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(22, 214, 203, 43);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 200, 850, 10);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("UPDATE ATTENDANCE RECORD");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 20, 620, 50);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0f01a11a52e008fc39a29235d0fdd3b0.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-560, 0, 1410, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salarymanagement","root","");
            String empno,sql="";
            empno=T1.getText();
            if(empno.equals(""))
            {
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE EMPLOYEE_ID");
                T1.requestFocus();
            }
            else
            sql="Select * from attendance where Empno="+empno;
            System.out.println(sql);
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(!rs.next()){
                JOptionPane.showMessageDialog(null,"..Entered Employee Number DOES NOT EXIST....");
                T1.requestFocus();
            }
            else{b1.setVisible(true);
                T1.setEditable(true);
                T2.setEditable(true);
                T3.setEditable(true);
                T4.setEditable(true);
                T5.setEditable(true);
                T6.setEditable(true);
                T7.setEditable(true);
                
                b2.setEnabled(false);

                T2.setText(rs.getString("empno"));
                T3.setText(rs.getString("for_month"));
                T4.setText(rs.getString("year"));
                T5.setText(rs.getString("cl"));
                T6.setText(rs.getString("pl"));
                T7.setText(rs.getString("ml"));
                T8.setText(rs.getString("lwp"));
                JOptionPane.showMessageDialog(null,"..Employee DETAILS LOADED....");
                JOptionPane.showMessageDialog(null,"**PLAESE UPDATE THE DETAILS**");

            }}
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"ERROR:"+e.getMessage());
            }    // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try{
            String empno,month,year,cl,pl,ml,lwp,sql;
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/salarymanagement","root","");
            empno=T2.getText();
            month=T3.getText();
            year=T4.getText();
            cl=T5.getText();
            pl=T6.getText();
            ml=T7.getText();
            lwp=T8.getText();
           if(empno.equals("") || month.equals("") || year.equals("") || cl.equals("") || pl.equals("") || ml.equals("") || lwp.equals(""))
{
JOptionPane.showMessageDialog(null,"PLEASE RECHECK THE ENTRIES");
}
            else
            {

                sql="UPDATE attendance SET Empno="+ empno+",for_month='"+month+"',year='"+year+"',cl='"+cl+"',pl='"+pl+"',ml='"+ml+"',lwp='"+lwp+"' where Empno="+empno;
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                System.out.println(sql);
                JOptionPane.showMessageDialog(null,"..DATA HAVE BEEN UPDATED..");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        input_screen s = new input_screen();
        s.setVisible(true);     
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UPDATE_ATTENDANCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UPDATE_ATTENDANCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UPDATE_ATTENDANCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UPDATE_ATTENDANCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UPDATE_ATTENDANCE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
