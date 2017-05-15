/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clasesPrincipales.Salidas;
import conMySql.GenerarNumeros;
import conMySql.salidaMySql;
import conexionSQLDB.DataBaseConexion;
import conexionSQLDB.salidaDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CPU_SYS
 */
public class Salidass extends javax.swing.JFrame {

    ArrayList<Salidass> salida;
    //salidaDB db = new salidaDB();
    salidaMySql db = new salidaMySql();

    /**
     * Creates new form Entrada
     */
    public Salidass() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CPU System Service S.A.S - SALIDA");
        CargarCmbCliente();
        CargarCmbEntadas();
        numeros();
        txtSec.setEnabled(false);
        //CargarCmbFacturas();
    }

    public void CargarCmbCliente() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre_cli FROM clientes ORDER BY nombre_cli ASC");
            while (rs.next()) {
                this.cmbClientes.addItem(rs.getString("nombre_cli"));
            }
            cn.close();
        } catch (Exception e) {
        }
    }
    public void CargarCmbEntadas() {
        try {
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT numero FROM entradas ORDER BY numero DESC");
            while (rs.next()) {
                this.cmbEntradas.addItem(rs.getString("numero"));
            }
        } catch (Exception e) {
        }
    }

    public void limpiar() {
        txtEmpresa.setText("");
        txtCiudad.setText("");
        txtDireccion.setText("");
        txtContacto.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        areaComentario.setText("");
        txtEquipo.setText("");
        txtModel.setText("");
        txtSerie.setText("");
        txtFecha.setDateFormatString("");
        this.cmbClientes.removeAllItems();
        CargarCmbCliente();
        txtEmpresa.requestFocus();
    }
    public void limpiar2() {
        areaComentario.setText("");
        txtEquipo.setText("");
        txtModel.setText("");
        txtSerie.setText("");
        this.cmbClientes.removeAllItems();
        CargarCmbCliente();
        txtEmpresa.requestFocus();
    }

    void numeros() {
        int j;
        String c = "";
        String SQL = "SELECT MAX(numero) AS numero FROM salidas";
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString("numero");
            }
            System.out.println(c);
            if (c == null) {
                txtSec.setText("NS000000001");
                System.out.println(c);
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                char r8 = c.charAt(9);
                char r9 = c.charAt(10);

                System.out.println("" + r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 + r9);
                String juntar = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 + r9;
                int var = Integer.parseInt(juntar);

                System.out.println("\n lo que vale: " + var);
                GenerarNumeros gen = new GenerarNumeros();
                gen.generarSalidas(var);

                txtSec.setDisabledTextColor(java.awt.Color.BLUE);
                txtSec.setText(gen.serie());
            }
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(Salidass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     public void CargarCmbFacturas() {
     try {
     Connection cnx = DataBaseConexion.getConnection();
     Statement st = cnx.createStatement();
     ResultSet rs = st.executeQuery("SELECT ID_ENTRADA FROM ENTRADAS ORDER BY ID_ENTRADA DESC");
     while (rs.next()) {
     this.cmbFacturas.addItem(rs.getString("ID_ENTRADA"));
     }
     } catch (Exception e) {
     }
     }
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtCiudad = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        txtEquipo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComentario = new javax.swing.JTextArea();
        jSeparator9 = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        btnGuarda = new javax.swing.JButton();
        btnDescartar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtSec = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        cmbEntradas = new javax.swing.JComboBox();
        btnBusca3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnGuarda1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir1.setBackground(new java.awt.Color(51, 153, 255));
        btnSalir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORMATOS DE SALIDA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 280, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 220, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("CLIENTES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 20));

        getContentPane().add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 130, 10));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ciudad");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 255, 153));
        jLabel16.setText("DATOS DEL CONTACTO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 150, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 650, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 10));
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 200, -1));
        getContentPane().add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Dirección");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));
        getContentPane().add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 140, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 110, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Correo");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 40, 20));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 180, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Telefono");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 50, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 270, 10));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 255, 153));
        jLabel22.setText("DATOS DEL EQUIPO");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));
        getContentPane().add(txtEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 130, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 255, 153));
        jLabel25.setText("FECHA");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 40, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Equipo");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 40, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Comentario");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 330, 10));

        areaComentario.setColumns(20);
        areaComentario.setRows(5);
        jScrollPane1.setViewportView(areaComentario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 450, 140));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 230, 10));

        btnVolver.setBackground(new java.awt.Color(51, 153, 255));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Modelo");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 50, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Serie");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 40, 20));
        getContentPane().add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 150, -1));

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
        getContentPane().add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 40, -1));

        btnGuarda.setBackground(new java.awt.Color(255, 255, 255));
        btnGuarda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuarda.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar_1.png"))); // NOI18N
        btnGuarda.setText("Guardar");
        btnGuarda.setBorder(null);
        btnGuarda.setBorderPainted(false);
        btnGuarda.setContentAreaFilled(false);
        btnGuarda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuarda.setIconTextGap(-1);
        btnGuarda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuarda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 50, -1));

        btnDescartar1.setBackground(new java.awt.Color(255, 255, 255));
        btnDescartar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDescartar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar2.png"))); // NOI18N
        btnDescartar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescartar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 40, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Empresa");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));
        getContentPane().add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 160, -1));

        txtSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecActionPerformed(evt);
            }
        });
        getContentPane().add(txtSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 160, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 100, 10));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 255, 153));
        jLabel26.setText("No. REM");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 60, 20));

        txtFecha.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 170, -1));

        cmbEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEntradasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 160, -1));

        btnBusca3.setBackground(new java.awt.Color(255, 255, 255));
        btnBusca3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBusca3.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa2.png"))); // NOI18N
        btnBusca3.setBorder(null);
        btnBusca3.setBorderPainted(false);
        btnBusca3.setContentAreaFilled(false);
        btnBusca3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBusca3.setIconTextGap(-1);
        btnBusca3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBusca3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBusca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusca3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 40, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 153));
        jLabel8.setText("ENTRADAS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 70, 20));

        btnGuarda1.setBackground(new java.awt.Color(255, 255, 255));
        btnGuarda1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuarda1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/generarr.png"))); // NOI18N
        btnGuarda1.setText("Go");
        btnGuarda1.setBorder(null);
        btnGuarda1.setBorderPainted(false);
        btnGuarda1.setContentAreaFilled(false);
        btnGuarda1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuarda1.setIconTextGap(-1);
        btnGuarda1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuarda1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuarda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarda1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuarda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 50, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ima2.2_ampliada.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        Bienvenida obj = new Bienvenida();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        Formatos_Admin obj = new Formatos_Admin();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

        //limpiar2();
        try {

            String guardar = cmbClientes.getSelectedItem().toString();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            Statement st = cn.createStatement();
            PreparedStatement pst = cn.prepareStatement("Select * from Clientes where nombre_cli = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                txtEmpresa.setText(rs.getString("nombre_cli").trim());
                txtCiudad.setText(rs.getString("ciudad_cli").trim());
                txtDireccion.setText(rs.getString("direccion_cli").trim());
                txtContacto.setText(rs.getString("contacto_cli").trim());
                txtTelefono.setText(rs.getString("telefono_cli").trim());
                txtCorreo.setText(rs.getString("correo_cli").trim());

                //pst.setString(1, CMBID.getName());
                //String guardar = txtBuscar.getText();
                limpiar2();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaActionPerformed
 
            try {
                Salidas sal = new Salidas();
                String formato = txtFecha.getDateFormatString();
                Date date = txtFecha.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                String dato = String.valueOf(sdf.format(date));
                sal.setFecha(dato);
                sal.setNumero(txtSec.getText());
                sal.setEmpresa(txtEmpresa.getText().toUpperCase());
                sal.setCiudad(txtCiudad.getText().toUpperCase());
                sal.setDireccion(txtDireccion.getText().toUpperCase());
                sal.setContacto(txtContacto.getText().toUpperCase());
                sal.setTelefono(txtTelefono.getText().toUpperCase());
                sal.setCorreo(txtCorreo.getText().toUpperCase());
                sal.setEquipo(txtEquipo.getText().toUpperCase());
                sal.setModelo(txtModel.getText().toUpperCase());
                sal.setSerie(txtSerie.getText().toUpperCase());
                sal.setComentario(areaComentario.getText().toUpperCase());
                db.insertarSalida(sal);
                JOptionPane.showMessageDialog(this, "Factura guardada exitosamente", "", JOptionPane.INFORMATION_MESSAGE);
                numeros();
                limpiar();
            } catch (Exception e) {
                System.err.println("error" + e);
            }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardaActionPerformed

    private void btnDescartar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartar1ActionPerformed

        txtEmpresa.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCiudad.setText("");
        txtCorreo.setText("");
        txtContacto.setText("");
        txtEquipo.setText("");
        areaComentario.setText("");
        txtModel.setText("");
        txtSerie.setText("");
        txtEmpresa.requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescartar1ActionPerformed

    private void txtSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecActionPerformed

    private void cmbEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEntradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEntradasActionPerformed

    private void btnBusca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusca3ActionPerformed

        //(FECHA, ELEMENTO, POTENCIA, MARCA, MODELO, SERIE, EMPRESA, NIT, PERSONA_REMITE, CIUDAD, DIRECCION, NOMBRE_CONTACTO, TELEFONO_CONTACTO, CORREO, MOTIVO, TARJETA_RED, PARRILLA, BASES_PLASTICAS, CONECTOR_ORIGI, GARANTIA, ESTADO_CARCASA, OBSERVACIONES)
        try {

            String guardar = cmbEntradas.getSelectedItem().toString();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            Statement st = cn.createStatement();
            PreparedStatement pst = cn.prepareStatement("Select * from entradas where numero = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                txtEmpresa.setText(rs.getString("empresa").trim());
                txtCiudad.setText(rs.getString("ciudad").trim());
                txtDireccion.setText(rs.getString("direccion").trim());
                txtContacto.setText(rs.getString("contacto").trim());
                txtTelefono.setText(rs.getString("telefono").trim());
                txtCorreo.setText(rs.getString("correo").trim());
                txtEquipo.setText(rs.getString("elemento"));
                txtModel.setText(rs.getString("modelo"));
                txtSerie.setText(rs.getString("serie").trim());
                areaComentario.setText(rs.getString("observaciones").trim());

                //pst.setString(1, CMBID.getName());
                //String guardar = txtBuscar.getText();
            } else {
                JOptionPane.showMessageDialog(null, "No existe la factura");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBusca3ActionPerformed

    private void btnGuarda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarda1ActionPerformed

        Facturas_Salida obj = new Facturas_Salida();
        obj.setVisible(true);
        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuarda1ActionPerformed

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
            java.util.logging.Logger.getLogger(Salidass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salidass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salidass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salidass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salidass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaComentario;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnBusca3;
    private javax.swing.JButton btnDescartar1;
    private javax.swing.JButton btnGuarda;
    private javax.swing.JButton btnGuarda1;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cmbClientes;
    private javax.swing.JComboBox cmbEntradas;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEquipo;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSec;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
