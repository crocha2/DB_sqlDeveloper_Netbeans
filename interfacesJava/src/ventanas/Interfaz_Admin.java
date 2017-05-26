/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author CPU_SYS
 */
import clasesPrincipales.usuarios;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

public class Interfaz_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz_Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("CPU System Service S.A.S");

    }


    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/CPU_new_2.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(51, 153, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(51, 153, 255));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, 30));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_3.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, 190));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 290, 10));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 140, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new_1.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        Bienvenida obj = new Bienvenida();
        obj.setVisible(true);
        dispose();

// TODO add you  r handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
 
        usuarios usu = new usuarios();
        usu.setNombre(this.txtNombreUsuario.getText());
        usu.setPassword(this.txtPassword.getText());
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://69.73.129.251:3306/cpusysc1_cpudb", "cpusysc1_root", "c8020123496");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("Select id_tipo_usu From Usuarios Where nombre_usu = '" + usu.getNombre() + "' And password_usu  = '" + usu.getPassword() + "'");
            //ResultSet rs = st.executeQuery("insert into USUARIOS (NOMBRE_USUARIO, PASSWORD_USUARIO, TIPO_USUARIOS_ID_TIPO_USUARIO) VALUES ('fserrano1', '1234', 3)");   
            if (rs.next()) {

                int tipo = rs.getInt("id_tipo_usu");
                if (tipo == 1) {

                    new Principal_Admin().setVisible(true);
                    dispose();
                    this.setVisible(false);
                    
                }

                if (tipo == 2) {

                    new Principal_Oper().setVisible(true);
                    dispose();
                    this.setVisible(false);
                }

            } else {

                JOptionPane.showMessageDialog(null, "No existe usuario, por favor revise sus datos");
            }
            cn.close();
        } catch (SQLException | HeadlessException e) {
            //JOptionPane.showMessageDialog(null, "Error " + e);
            System.out.println(e);
        }

        /*
        
         Cusuario usu=new Cusuario();

      //Cencriptación encrip=new Cencriptación();
       usu.setUsuario(this.txtusuario.getText());
       // this.txtcontraseña.setText(encrip.Encriptar(this.txtcontraseña.getText(),3));
       usu.setContraseña(this.txtcontraseña.getText());

        frm_Principal frm=new frm_Principal();

        if(usu.ValidarUsuario()>0)
        {

              frm.setVisible(true);
             this.setVisible(false);
              if(usu.TipoUsuario()==2)
        {

             frm.getJMenuBar().getMenu(2).setVisible(false);
        }
        }

      else
        {

            this.lblusuario.setText("Usuario o Contraseña Incorrecta!");

        }


        
         */
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
