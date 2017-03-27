/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clasesPrincipales.clientes;
import conexionSQLDB.clienteDB;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CPU_SYS
 */
public class Nuevo_Cliente extends javax.swing.JFrame {

    ArrayList<clientes> cliente;
    clienteDB db = new clienteDB();
    
    /**
     * Creates new form Registro_Clientes
     */
    public Nuevo_Cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CPU System Service S.A.S - NUEVO CLIENTE");      
        
        
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
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        txtContactoCliente = new javax.swing.JTextField();
        txtNitCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtCiudadCliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();
        btnDescartar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 350, 10));

        btnSalir2.setBackground(new java.awt.Color(51, 153, 255));
        btnSalir2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir2.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contacto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ciudad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Direccion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIT");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));
        getContentPane().add(txtCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 150, -1));
        getContentPane().add(txtContactoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, -1));
        getContentPane().add(txtNitCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, -1));
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 150, -1));
        getContentPane().add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 150, -1));
        getContentPane().add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, -1));
        getContentPane().add(txtCiudadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 10, 220));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 10));

        btnVolver.setBackground(new java.awt.Color(51, 153, 255));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        btnDescartar.setBackground(new java.awt.Color(153, 204, 255));
        btnDescartar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDescartar.setText("DESCARTAR");
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, 30));

        btnGuardar1.setBackground(new java.awt.Color(153, 204, 255));
        btnGuardar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar1.setText("GUARDAR");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ima2.2.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed

        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        Principal_Admin obj = new Principal_Admin();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed

        clientes cl = new clientes();
        cl.setNit_cliente(txtNitCliente.getText().toUpperCase());
        cl.setNombre_cliente(txtNombreCliente.getText().toUpperCase());
        cl.setTelefono_cliente(txtTelefonoCliente.getText().toUpperCase());
        cl.setDireccion_cliente(txtDireccionCliente.getText().toUpperCase());
        cl.setCiudad_cliente(txtCiudadCliente.getText().toUpperCase());
        cl.setCorreo_cliente(txtCorreoCliente.getText().toUpperCase());
        cl.setNombre_contacto(txtContactoCliente.getText().toUpperCase());
        if (txtNitCliente.getText().equals("") || txtNombreCliente.getText().equals("") || txtTelefonoCliente.getText().equals("") || txtDireccionCliente.getText().equals("") || txtCiudadCliente.getText().equals("") || txtCorreoCliente.getText().equals("") || txtContactoCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            db.insertarClientes(cl);
            JOptionPane.showMessageDialog(this, "Datos ingresados exitosamente", "", JOptionPane.INFORMATION_MESSAGE);
            txtNitCliente.setText("");
            txtNombreCliente.setText("");
            txtTelefonoCliente.setText("");
            txtDireccionCliente.setText("");
            txtCiudadCliente.setText("");
            txtCorreoCliente.setText("");
            txtContactoCliente.setText("");
            txtNitCliente.requestFocus();          
            
        }
    
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed

            txtNitCliente.setText("");
            txtNombreCliente.setText("");
            txtTelefonoCliente.setText("");
            txtDireccionCliente.setText("");
            txtCiudadCliente.setText("");
            txtCorreoCliente.setText("");
            txtContactoCliente.setText("");
            txtNitCliente.requestFocus();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescartarActionPerformed

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
            java.util.logging.Logger.getLogger(Nuevo_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevo_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCiudadCliente;
    private javax.swing.JTextField txtContactoCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtNitCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
