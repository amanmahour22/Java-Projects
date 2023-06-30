/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Register.java
 *
 * Created on 27 Jun, 2013, 9:41:02 PM
 */
/**
 *
 * @author arjunsk
 */

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame {

    /** Creates new form Register */
    public Register() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        grey = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();
        iphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 10));

        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 10));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, -1));

        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 10));

        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 10));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, -1));

        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 10));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 90, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 90, 40));

        red.setBackground(new java.awt.Color(181, 181, 181));
        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.jpg"))); // NOI18N
        red.setOpaque(true);
        getContentPane().add(red, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 20, -1));

        green.setBackground(new java.awt.Color(181, 181, 181));
        green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maximise.jpg"))); // NOI18N
        green.setOpaque(true);
        getContentPane().add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, -1));

        grey.setBackground(new java.awt.Color(181, 181, 181));
        grey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimise.jpg"))); // NOI18N
        grey.setOpaque(true);
        getContentPane().add(grey, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 20, -1));

        screen.setBackground(new java.awt.Color(255, 255, 255));
        screen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        screen.setOpaque(true);
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 340));

        iphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iphone4_white1.png"))); // NOI18N
        getContentPane().add(iphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 390, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked


 String name,username,password,confirmpass,email;        
        
name=jTextField2.getText();
username=jTextField1.getText();
password=jPasswordField2.getText();
confirmpass=jPasswordField1.getText();
email=jTextField5.getText();

if (name.isEmpty() || username.isEmpty() || password.isEmpty() || confirmpass.isEmpty() || email.isEmpty())
{
    JOptionPane.showMessageDialog(this,"Complete All The Fields");
}

else if(!(confirmpass.equals(password)))
{
JOptionPane.showMessageDialog(this,"Passwords mismathced");
}   
else{    
try{
Class.forName("java.sql.DriverManager");
// the part to edit 
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/chat", "roo", "");



Statement stmt2=(Statement) con.createStatement();
String query2="SELECT userid FROM registration WHERE username='"+username+"';";
ResultSet rs2=stmt2.executeQuery(query2);

if (rs2.next()){
    
 JOptionPane.showMessageDialog(this,"User Already Exist");   
}

else{


Statement stmt1=(Statement) con.createStatement();
String query1="INSERT INTO registration VALUES( 0,'"+username+"',md5('"+password+"'),123,'"+email+"','"+name+"','123',1,123);";
stmt1.executeUpdate(query1);


Statement stmt4=(Statement) con.createStatement();
String query4="SELECT userid  FROM registration  where  username= '"+username+"';";
ResultSet rs4=stmt4.executeQuery(query4);

if (rs4.next()){ 
int userid = rs4.getInt("userid");      
Statement stmt3=(Statement) con.createStatement();
String query3="INSERT INTO onlinebud VALUES( 0,'"+userid+"','"+username+"',curtime(),0,0);";
stmt3.executeUpdate(query3);    
}





JOptionPane.showMessageDialog(this,"Registration Completed");

this.setVisible(false);
new loginpage().setVisible(true);
 
}
con.close();
}


catch(Exception e){
JOptionPane.showMessageDialog(this,e.getMessage());
}// catch

}// else

    
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
 this.setVisible(false);       
 new loginpage().setVisible(true);  
 
 // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel green;
    private javax.swing.JLabel grey;
    private javax.swing.JLabel iphone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel red;
    private javax.swing.JLabel screen;
    // End of variables declaration//GEN-END:variables
}