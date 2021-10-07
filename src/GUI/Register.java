/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.DBConnection;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Chiesaafandy
 */
public class Register extends javax.swing.JFrame {
    static Connection conn;
    static Statement st;
    static String sql;
    PreparedStatement ps;
    Register register;

    /**
     * Creates new form Register
     */
    public Register() {
        conn = new DBConnection().setConnection();
        initComponents();
        setLocationRelativeTo(this);
        setSize(800,600);
        setLocation(200,100);

        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_bg = new javax.swing.JPanel();
        pnl_logo = new javax.swing.JLabel();
        pbl_register = new javax.swing.JPanel();
        lb_RegisterAccount = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        lb_pass = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        tf_passConfirm = new javax.swing.JPasswordField();
        btn_create = new javax.swing.JButton();
        lb_passConfirm = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        lb_email = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lb_phone = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_bg.setBackground(new java.awt.Color(200, 217, 237));
        pnl_bg.setToolTipText("");
        pnl_bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/CARSEEKER/CarSeekerLogo.jpeg")).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        pnl_logo.setIcon(imageIcon);
        pnl_bg.add(pnl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 300, 300));

        pbl_register.setBackground(new java.awt.Color(255, 255, 255));
        pbl_register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_RegisterAccount.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lb_RegisterAccount.setText("Daftar Akun");
        pbl_register.add(lb_RegisterAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lb_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_name.setText("Name");
        pbl_register.add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 149, -1));

        lb_pass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb_pass.setText("Password");
        pbl_register.add(lb_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        pbl_register.add(tf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 410, 35));
        pbl_register.add(tf_passConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 200, 35));

        btn_create.setBackground(new java.awt.Color(153, 204, 255));
        btn_create.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_create.setText("BUAT AKUN BARU");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        pbl_register.add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 410, 35));

        lb_passConfirm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb_passConfirm.setText("Konfirmasi Password");
        pbl_register.add(lb_passConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));
        pbl_register.add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 410, 35));

        lb_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_email.setText("Email");
        pbl_register.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 149, -1));
        pbl_register.add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 410, 35));

        lb_phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_phone.setText("Nomer Telepon");
        pbl_register.add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 149, -1));
        pbl_register.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, 35));

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Masuk");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        pbl_register.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        pnl_bg.add(pbl_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 450, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        Pattern MypatternEmail = Pattern.compile("^([\\w-]+(?:\\.[\\w-]+)*)@((?:[\\w-]+\\.)*\\w[\\w-]{0,66})\\.([a-z]{2,6}(?:\\.[a-z]{2})?)$");
        Matcher MymatcherEmail = MypatternEmail.matcher(tf_email.getText());
        Boolean MybooleanEmail = MymatcherEmail.matches();
        Pattern MypatternPass = Pattern.compile("^((?=\\S*?[A-Z])(?=\\S*?[a-z])(?=\\S*?[0-9]).{6,})\\S$");
        Matcher MymatcherPass = MypatternPass.matcher(tf_password.getText());
        Boolean MybooleanPass = MymatcherPass.matches();
        
        String email = tf_email.getText();
        String name = tf_name.getText();
        String phone = tf_phone.getText();
        String pass = tf_password.getText();
        String confirm = tf_passConfirm.getText();
        
        if(pass.equals(confirm)){
            if(MybooleanEmail == true){
                if(MybooleanPass == true){
                    try {
            sql = "INSERT INTO dataakun VALUES( ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement (sql);
            ps.setInt(1, 0);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, pass);
            ps.setString(5, phone);
            
            int rt = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registrasi Akun Berhasil!", "Informasi", JOptionPane.INFORMATION_MESSAGE); 
            Login log = new Login();
            log.setVisible(true);
            this.dispose();
            
            }catch (Exception e){
            System.out.println("Error" +e.getMessage());
            JOptionPane.showMessageDialog(null, "Email Sudah Digunakan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Password Wajib Memiliki Lebih Dari 6 Character \n"
                            + "Sedikitnya 1 Huruf Besar, 1 Huruf Kecil, dan 1 Angka", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Perikas Kembali Email Anda", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        else{
        
            JOptionPane.showMessageDialog(null, "Konfirmasi Password Tidak Cocok", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        
        }
    }//GEN-LAST:event_btn_createActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lb_RegisterAccount;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_pass;
    private javax.swing.JLabel lb_passConfirm;
    private javax.swing.JLabel lb_phone;
    private javax.swing.JPanel pbl_register;
    private javax.swing.JPanel pnl_bg;
    private javax.swing.JLabel pnl_logo;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_name;
    private javax.swing.JPasswordField tf_passConfirm;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_phone;
    // End of variables declaration//GEN-END:variables
}