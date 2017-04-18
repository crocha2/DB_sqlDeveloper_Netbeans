/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clasesPrincipales.clientes;
import conexionSQLDB.DataBaseConexion;
import conexionSQLDB.clienteDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CPU_SYS
 */
public class Tabla_Clientes_Admin extends javax.swing.JFrame {

    ArrayList<clientes> cliente;
    clienteDB db = new clienteDB();

    /**
     * Creates new form Tabla_Clientes
     */
    public Tabla_Clientes_Admin() {
        initComponents();
        ListarDatos();
        LimpirTabla();
        this.setLocationRelativeTo(null);
        this.setTitle("CPU System Service S.A.S - TABLA DE CLIENTES");
        CargarCmbCliente();
    }

    // METODOS::::::::::::::::::::
    public void ListarDatos() {
        cliente = db.ListClientes();
        DefaultTableModel tb = (DefaultTableModel) tabla_clientes.getModel();
        for (clientes cl : cliente) {
            tb.addRow(new Object[]{cl.getId_cliente(),cl.getNit_cliente(), cl.getNombre_cliente(), cl.getTelefono_cliente(), cl.getDireccion_cliente(), cl.getCiudad_cliente(), cl.getCorreo_cliente(), cl.getNombre_contacto()});
        }
    }

    public void LimpirTabla() {
        DefaultTableModel tb = (DefaultTableModel) tabla_clientes.getModel();
        for (int i = tb.getRowCount() - 1; i >= 0; i--) {
            tb.removeRow(i);
        }
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/CPU_new_2.png"));
        return retValue;
    }

    public void CargarCmbCliente() {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NOMBRECLIENTE FROM CLIENTES ORDER BY NOMBRECLIENTE ASC");
            while (rs.next()) {
                this.cmbClientes.addItem(rs.getString("nombrecliente"));
            }
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir1 = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox();
        brnListar1 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBusca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabla de cientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 300, 10));

        btnSalir1.setBackground(new java.awt.Color(51, 153, 255));
        btnSalir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, -1));

        btnVolver1.setBackground(new java.awt.Color(51, 153, 255));
        btnVolver1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Nombre del cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        getContentPane().add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 330, 30));

        brnListar1.setBackground(new java.awt.Color(255, 255, 255));
        brnListar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        brnListar1.setForeground(new java.awt.Color(255, 255, 255));
        brnListar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list.png"))); // NOI18N
        brnListar1.setBorder(null);
        brnListar1.setBorderPainted(false);
        brnListar1.setContentAreaFilled(false);
        brnListar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        brnListar1.setIconTextGap(-1);
        brnListar1.setLabel("Listar");
        brnListar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        brnListar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        brnListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnListar1ActionPerformed(evt);
            }
        });
        getContentPane().add(brnListar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 40, 50));

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.setIconTextGap(-1);
        btnEdit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 40, 50));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setIconTextGap(-1);
        btnDelete.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 50, 50));

        btnBusca.setBackground(new java.awt.Color(255, 255, 255));
        btnBusca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa2.png"))); // NOI18N
        btnBusca.setBorder(null);
        btnBusca.setBorderPainted(false);
        btnBusca.setContentAreaFilled(false);
        btnBusca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBusca.setIconTextGap(-1);
        btnBusca.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBusca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 40, 40));

        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NIT", "CLIENTE", "TELEFONO", "DIRECCION", "CIUDAD", "CORREO", "CONTACTO"
            }
        ));
        tabla_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_clientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1020, 300));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/amp-mas.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        Bienvenida obj = new Bienvenida();
        obj.setVisible(true);
        dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed

        Principal_Admin obj = new Principal_Admin();
        obj.setVisible(true);
        dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void brnListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnListar1ActionPerformed

        LimpirTabla();
        ListarDatos();

        // TODO add your handling code here:
    }//GEN-LAST:event_brnListar1ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        Editar_Cliente obj = new Editar_Cliente();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        Eliminar_Cliente obj = new Eliminar_Cliente();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

        try {

            String guardar = cmbClientes.getSelectedItem().toString();
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            PreparedStatement pst = cnx.prepareStatement("Select * from Clientes where NOMBRECLIENTE = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            LimpirTabla();
            if (rs.next()) {

                clientes cl = new clientes();
                cl.setNit_cliente(rs.getString("NITCLIENTE"));
                cl.setNombre_cliente(rs.getString("NOMBRECLIENTE"));
                cl.setTelefono_cliente(rs.getString("TELEFONOCLIENTE"));
                cl.setDireccion_cliente(rs.getString("DIRECCIONCLIENTE"));
                cl.setCiudad_cliente(rs.getString("CIUDADCLIENTE"));
                cl.setCorreo_cliente(rs.getString("CORREOCLIENTE"));
                cl.setNombre_contacto(rs.getString("NOMBRECONTACTO"));
                cliente.add(cl);
                DefaultTableModel tb = (DefaultTableModel) tabla_clientes.getModel();
                tb.addRow(new Object[]{cl.getNit_cliente(), cl.getNombre_cliente(), cl.getTelefono_cliente(), cl.getDireccion_cliente(), cl.getCiudad_cliente(), cl.getCorreo_cliente(), cl.getNombre_contacto()});

            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void tabla_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clientesMouseClicked

        int seleccion = tabla_clientes.getSelectedRow();
        tabla_clientes.getSelectedColumn();

        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_clientesMouseClicked

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
            java.util.logging.Logger.getLogger(Tabla_Clientes_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_Clientes_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_Clientes_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_Clientes_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Tabla_Clientes_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnListar1;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox cmbClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_clientes;
    // End of variables declaration//GEN-END:variables
}
