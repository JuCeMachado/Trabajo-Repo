package ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class InformacionEquipoTecnico extends javax.swing.JFrame {

    int IDequipo = 0;
    String user = "";

    public InformacionEquipoTecnico() {
        initComponents();
        user = Login.user;
        IDequipo = GestionarEquipos.IDequipo_update;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from equipos where id_equipo = '" + IDequipo + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cmbTipoEquipo.setSelectedItem(rs.getString("tipo_equipo"));
                cmbMarca.setSelectedItem(rs.getString("marca"));
                cmbEstatus.setSelectedItem(rs.getString("estatus"));
                txtModelo.setText(rs.getString("modelo"));
                txtNumSerie.setText(rs.getString("num_serie"));
                txtUltimaModificacion.setText(rs.getString("ultima_modificacion"));

                String dia , mes , annio ;
                dia = rs.getString("dia_ingreso");
                mes = rs.getString("mes_ingreso");
                annio = rs.getString("annio_ingreso");
                txtFechaIngreso.setText(dia + " /" + mes + " /" + annio);

                jTextPane1.setText(rs.getString("observaciones"));
                jTextPane2.setText(rs.getString("comentarios_tecnicos"));
                lblRevisionTecnicaDe.setText("Comentarios y actualización del técnico " + rs.getString("revision_tecnica"));

            }
        } catch (SQLException e) {
            System.err.println("Error al consultar la información del equipo.");
        }

        setTitle("Equipos registrados con el ID " + IDequipo + " - Sesión de " + user);
        setSize(670, 580);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//cierra ventana pero no el programa.

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/sistema.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dg_background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlbl_titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtUltimaModificacion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblNombre1 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombre2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        cmbTipoEquipo = new javax.swing.JComboBox<>();
        lblNombre5 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombre6 = new javax.swing.JLabel();
        lblRevisionTecnicaDe = new javax.swing.JLabel();
        cmbEstatus = new javax.swing.JComboBox<>();
        lblNombre8 = new javax.swing.JLabel();
        lblNombre9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        ActualizarPanel = new clases.PanelRound();
        btnActualizarTxt = new javax.swing.JLabel();
        panelRound4 = new clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        dg_background.setBackground(new java.awt.Color(255, 255, 255));
        dg_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 208, 163));
        jPanel2.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hexagonal.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 10, 24, 30);

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hexagonal (1).png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 10, 138, 24);

        jlbl_titulo.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_titulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_titulo.setText("Información Equipo");
        jPanel2.add(jlbl_titulo);
        jlbl_titulo.setBounds(60, 0, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        dg_background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 40));

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtNombreCliente.setBorder(null);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        dg_background.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));
        dg_background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 10));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre del cliente:");
        dg_background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtUltimaModificacion.setEditable(false);
        txtUltimaModificacion.setBackground(new java.awt.Color(255, 255, 255));
        txtUltimaModificacion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUltimaModificacion.setBorder(null);
        txtUltimaModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUltimaModificacionActionPerformed(evt);
            }
        });
        dg_background.add(txtUltimaModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 210, -1));
        dg_background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, 10));

        lblNombre1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre1.setText("Tipo de equipo:");
        dg_background.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtNumSerie.setBackground(new java.awt.Color(255, 255, 255));
        txtNumSerie.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtNumSerie.setBorder(null);
        txtNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSerieActionPerformed(evt);
            }
        });
        dg_background.add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, -1));
        dg_background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, 10));

        lblNombre2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre2.setText("Última modificación por:");
        dg_background.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtModelo.setBorder(null);
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        dg_background.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));
        dg_background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 10));

        lblNombre3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre3.setText("Modelo:");
        dg_background.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblNombre4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre4.setText("Marca:");
        dg_background.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HP", "Lenovo", "Dell", "Acer", "Apple ", "Toshiba ", "Brother", "Samsung", "Asus", "Alienware", "Xerox" }));
        cmbMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });
        dg_background.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, -1));

        cmbTipoEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Impresora", "Multifuncional" }));
        cmbTipoEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbTipoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoEquipoActionPerformed(evt);
            }
        });
        dg_background.add(cmbTipoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        lblNombre5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre5.setText("N° de serie:");
        dg_background.add(lblNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtFechaIngreso.setEditable(false);
        txtFechaIngreso.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaIngreso.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtFechaIngreso.setBorder(null);
        txtFechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIngresoActionPerformed(evt);
            }
        });
        dg_background.add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 210, -1));
        dg_background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 210, 10));

        lblNombre6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre6.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre6.setText("Fecha de Ingreso:");
        dg_background.add(lblNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        lblRevisionTecnicaDe.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblRevisionTecnicaDe.setForeground(new java.awt.Color(0, 0, 0));
        lblRevisionTecnicaDe.setText("Comentarios y actualizaciones del técnico:");
        dg_background.add(lblRevisionTecnicaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        cmbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo Ingreso", "No reparado", "En revision", "Reparado", "Entregado" }));
        cmbEstatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstatusActionPerformed(evt);
            }
        });
        dg_background.add(cmbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, -1));

        lblNombre8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre8.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre8.setText("Estatus:");
        dg_background.add(lblNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        lblNombre9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre9.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre9.setText("Daño reportado y observaciones:");
        dg_background.add(lblNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jScrollPane2.setViewportView(jTextPane2);

        dg_background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 340, 140));

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        dg_background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 340, 140));

        ActualizarPanel.setBackground(new java.awt.Color(0, 228, 163));
        ActualizarPanel.setRoundBottomLeft(25);
        ActualizarPanel.setRoundBottomRight(25);
        ActualizarPanel.setRoundTopLeft(25);
        ActualizarPanel.setRoundTopRight(25);

        btnActualizarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnActualizarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizarTxt.setText("Actualizar");
        btnActualizarTxt.setToolTipText("Guardar actualizaciones del técnico");
        btnActualizarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ActualizarPanelLayout = new javax.swing.GroupLayout(ActualizarPanel);
        ActualizarPanel.setLayout(ActualizarPanelLayout);
        ActualizarPanelLayout.setHorizontalGroup(
            ActualizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizarPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(btnActualizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ActualizarPanelLayout.setVerticalGroup(
            ActualizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dg_background.add(ActualizarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 150, 30));

        panelRound4.setBackground(new java.awt.Color(51, 51, 51));
        panelRound4.setPreferredSize(new java.awt.Dimension(50, 20));
        panelRound4.setRoundBottomLeft(25);
        panelRound4.setRoundBottomRight(25);
        panelRound4.setRoundTopLeft(25);
        panelRound4.setRoundTopRight(25);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("JuceCorp®");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        dg_background.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dg_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dg_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtUltimaModificacion.requestFocus();
        }
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtUltimaModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUltimaModificacionActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtNumSerie.requestFocus();
        }
    }//GEN-LAST:event_txtUltimaModificacionActionPerformed

    private void txtNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSerieActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            cmbEstatus.requestFocus();
        }
    }//GEN-LAST:event_txtNumSerieActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtNumSerie.requestFocus();
        }
    }//GEN-LAST:event_txtModeloActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtModelo.requestFocus();
        }
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void cmbTipoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoEquipoActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            cmbMarca.requestFocus();
        }
    }//GEN-LAST:event_cmbTipoEquipoActionPerformed

    private void txtFechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIngresoActionPerformed

    private void cmbEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstatusActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            jScrollPane1.requestFocus();
        }
    }//GEN-LAST:event_cmbEstatusActionPerformed

    private void btnActualizarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseClicked

        String estatus, comentariosTecnicos, tecnico;

        estatus = cmbEstatus.getSelectedItem().toString();
        comentariosTecnicos = jTextPane2.getText();
        tecnico = user;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "Update equipos set estatus = ?, comentarios_tecnicos = ?, revision_tecnica = ? where id_equipo = '" + IDequipo + "'");
            
            pst.setString(1, estatus);
            pst.setString(2, comentariosTecnicos );
            pst.setString(3, tecnico);
            
            pst.executeUpdate();
            cn.close();
            
            JOptionPane.showMessageDialog(null, "Actualización exitosa.");
            this.dispose();
            
        } catch (SQLException e) {
            System.err.println("Error en actualizar equipo." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al actualizar equipo!!, contacte al administrador.");
        }

    }//GEN-LAST:event_btnActualizarTxtMouseClicked

    private void btnActualizarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseEntered
        ActualizarPanel.setBackground(new Color(0, 228, 223));
        btnActualizarTxt.setForeground(Color.white);
    }//GEN-LAST:event_btnActualizarTxtMouseEntered

    private void btnActualizarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseExited
        ActualizarPanel.setBackground(new Color(0, 228, 163));
        btnActualizarTxt.setForeground(new Color(0, 51, 102));
    }//GEN-LAST:event_btnActualizarTxtMouseExited

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
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionEquipoTecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound ActualizarPanel;
    private javax.swing.JLabel btnActualizarTxt;
    private javax.swing.JComboBox<String> cmbEstatus;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbTipoEquipo;
    private javax.swing.JPanel dg_background;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre8;
    private javax.swing.JLabel lblNombre9;
    private javax.swing.JLabel lblRevisionTecnicaDe;
    private clases.PanelRound panelRound4;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtUltimaModificacion;
    // End of variables declaration//GEN-END:variables
    public void Limpiar() {
        txtNombreCliente.setText("");
        txtFechaIngreso.setText("");
        txtModelo.setText("");
        txtNumSerie.setText("");
        jTextPane1.setText("");
    }
}
