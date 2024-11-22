package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegistrarCliente extends javax.swing.JFrame {

    String user;

    public RegistrarCliente() {
        initComponents();
        user = Login.user;

        setTitle("Registrar nuevo cliente - Sesión de " + user);
        setSize(550, 350);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/sistema.png"));
        return retValue;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtTel = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDir = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        RegistrarPanel = new clases.PanelRound();
        btnRegistrarTxt = new javax.swing.JLabel();
        panelRound4 = new clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Registro Clientes");
        jPanel2.add(lblTitulo);
        lblTitulo.setBounds(60, 0, 140, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Teléfono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("em@il:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 10));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 10));

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtTel.setBorder(null);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 10));

        txtDir.setBackground(new java.awt.Color(255, 255, 255));
        txtDir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtDir.setBorder(null);
        txtDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirActionPerformed(evt);
            }
        });
        jPanel1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 210, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 210, 10));

        RegistrarPanel.setBackground(new java.awt.Color(0, 228, 163));
        RegistrarPanel.setRoundBottomLeft(25);
        RegistrarPanel.setRoundBottomRight(25);
        RegistrarPanel.setRoundTopLeft(25);
        RegistrarPanel.setRoundTopRight(25);

        btnRegistrarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegistrarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnRegistrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarTxt.setText("Registrar");
        btnRegistrarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RegistrarPanelLayout = new javax.swing.GroupLayout(RegistrarPanel);
        RegistrarPanel.setLayout(RegistrarPanelLayout);
        RegistrarPanelLayout.setHorizontalGroup(
            RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        RegistrarPanelLayout.setVerticalGroup(
            RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(RegistrarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 110, 30));

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

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtTel.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtDir.requestFocus();
        }
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            btnRegistrarTxtMouseClicked(null);
        }
    }//GEN-LAST:event_txtDirActionPerformed

    private void btnRegistrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseClicked
        int validacion = 0;
        String nombre, correo, telefono, direccion;

        nombre = txtNombre.getText().trim();
        telefono = txtTel.getText().trim();
        correo = txtCorreo.getText().trim();
        direccion = txtDir.getText().trim();

        if (nombre.equals("")) {
            validacion++;
            txtNombre.setBackground(Color.red);
        }
        if (telefono.equals("")) {
            txtTel.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txtCorreo.setBackground(Color.red);
            validacion++;
        }
        if (correo.equals("")) {
            txtDir.setBackground(Color.red);
            validacion++;
        }

        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "Insert into clientes values (?,?,?,?,?,?)");

                pst.setInt(1, 0);
                pst.setString(2, nombre);
                pst.setString(3, telefono);
                pst.setString(4, direccion);
                pst.setString(5, correo);
                pst.setString(6, user);

                pst.executeUpdate();
                cn.close();

                Limpiar();

                txtNombre.setBackground(Color.green);
                txtTel.setBackground(Color.green);
                txtCorreo.setBackground(Color.green);
                txtDir.setBackground(Color.green);

                JOptionPane.showMessageDialog(null, "Registro Exitoso.");
                this.dispose();

            } catch (SQLException e) {
                System.out.println("Error en registrar cliente." + e);
                JOptionPane.showMessageDialog(null, "¡¡Error al registrar cliente!! Contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
        }
    }//GEN-LAST:event_btnRegistrarTxtMouseClicked

    private void btnRegistrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseEntered
        RegistrarPanel.setBackground(new Color(0, 228, 223));
        btnRegistrarTxt.setForeground(Color.white);
    }//GEN-LAST:event_btnRegistrarTxtMouseEntered

    private void btnRegistrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseExited
        RegistrarPanel.setBackground(new Color(0, 228, 163));
        btnRegistrarTxt.setForeground(new Color(0, 51, 102));
    }//GEN-LAST:event_btnRegistrarTxtMouseExited

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
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound RegistrarPanel;
    private javax.swing.JLabel btnRegistrarTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblTitulo;
    private clases.PanelRound panelRound4;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txtNombre.setText("");
        txtTel.setText("");
        txtCorreo.setText("");
        txtDir.setText("");
    }
}
