
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        DefaultTableModel model=(DefaultTableModel)t1.getModel();
try{
    Class.forName("java.sql.DriverManager");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salarymanagement","root","");
    Statement st=con.createStatement();
    String sql="Select * from Employee";
    ResultSet rs = st.executeQuery(sql);
    int row = model.getRowCount();
    if(row>0){
        for(int i=0;i<row;i++){
            model.removeRow(0);
        }
        while(rs.next()){
            String empno,ename="",sex="",address="",city="",dob="",doj="",job="",department="";
            empno=rs.getString("empno");
ename=rs.getString("ename");
sex=rs.getString("sex");
address=rs.getString("address");
city=rs.getString("city");
dob=rs.getString("DOB");
doj=rs.getString("DOJ");
job=rs.getString("Job");
department=rs.getString("Department");
            model.addRow(new Object[]{empno,ename,sex,address,city,dob,doj,job,department});
        }
    }if(row==0)
    {
                
        JOptionPane.showMessageDialog(this,"No Record Found");
        rs.close();
        st.close();
        con.close();
        
    }
}
catch(Exception e)
{
    
    JOptionPane.showMessageDialog(this,"Error :"+e);
    JOptionPane.showMessageDialog(null,"INCORRECT USER_ID AND PIN PLEASE CROSS-CHECK");
    
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

        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee_no.", "Employee Name", "Sex", "Address", "City", "Date-of-Birth", "Date-of-Joining", "Job", "Department"
            }
        ));
        t1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                t1MouseDragged(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 93, 946, 181);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setText("EMPLOYEE DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 0, 642, 64);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(391, 344, 116, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/121437.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 950, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int a=JOptionPane.showConfirmDialog(this,"Are you sure You want To exit");
if(a==JOptionPane.YES_OPTION)
{
    dispose();
input_screen s = new input_screen();
s.setVisible(true); 
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed

    }//GEN-LAST:event_t1KeyPressed

    private void t1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseDragged

       
    }//GEN-LAST:event_t1MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new view().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
