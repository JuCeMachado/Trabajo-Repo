package ventanas;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegistarUsuarios extends javax.swing.JFrame {

    String user;
    
    public RegistarUsuarios() {
        initComponents();
        user = Login.user;
        setTitle("Registrar nuevo usuario - Sesión de " + user);
        setSize(650, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);    
    }
     @Override 
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/sistema.png"));
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtTel = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        cmbNiveles = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AgregarPanel = new clases.PanelRound();
        btnAgregarTxt = new javax.swing.JLabel();
        panelRound4 = new clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 208, 163));
        jPanel2.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hexagonal.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 10, 24, 30);

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hexagonal (1).png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 10, 30, 24);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro de usuarios");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 0, 166, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 10, 24, 24);

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 210, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 220, 10));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 10));

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtTel.setBorder(null);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        bg.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, -1));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 10));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        bg.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, -1));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 10));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        bg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 210, 20));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 220, 10));

        cmbNiveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Secretario", "Tecnico" }));
        cmbNiveles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelesActionPerformed(evt);
            }
        });
        bg.add(cmbNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Teléfono:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Correo:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        AgregarPanel.setBackground(new java.awt.Color(0, 228, 163));
        AgregarPanel.setRoundBottomLeft(25);
        AgregarPanel.setRoundBottomRight(25);
        AgregarPanel.setRoundTopLeft(25);
        AgregarPanel.setRoundTopRight(25);

        btnAgregarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnAgregarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarTxt.setText("Agregar");
        btnAgregarTxt.setToolTipText("Agrega nuevo usuario");
        btnAgregarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarPanelLayout = new javax.swing.GroupLayout(AgregarPanel);
        AgregarPanel.setLayout(AgregarPanelLayout);
        AgregarPanelLayout.setHorizontalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AgregarPanelLayout.setVerticalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(AgregarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 110, 30));

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

        bg.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarTxtMouseClicked
        
        int permisos_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, permisos_string = "";
        
        nombre = txtNombre.getText().trim();
        telefono = txtTel.getText().trim();
        mail = txtCorreo.getText().trim();
        username = txtUsuario.getText().trim();
        pass = txtPass.getText().trim(); 
        permisos_cmb = cmbNiveles.getSelectedIndex() + 1;
        
        if (nombre.equals("")) {
            txtNombre.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txtTel.setBackground(Color.red);
            validacion++;
        }
        if (mail.equals("")) {
            txtCorreo.setBackground(Color.red);
            validacion++;
        }
        if (username.equals("")) {
            txtUsuario.setBackground(Color.red);
            validacion++;
        }
        if (pass.equals("")) {
            txtPass.setBackground(Color.red);
            validacion++;
        }
       if (permisos_cmb == 1) {
           permisos_string = "Administrador";
       } else if(permisos_cmb == 2){
           permisos_string = "Secretario";
       } else if(permisos_cmb == 3){
           permisos_string = "Tecnico";
       }
       
       try{
         Connection cn = Conexion.conectar();
         PreparedStatement pst = cn.prepareStatement(
                 "Select username from usuarios where username = '" + username + "'");
         ResultSet rs = pst.executeQuery();
         
         if(rs.next()){
             txtUsuario.setBackground(Color.red);
             JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible.");
             cn.close();
         }else{   
             
             cn.close();
             
             if(validacion == 0){
                try{
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "Insert into Usuarios values (?,?,?,?,?,?,?,?,?)");
                    pst2.setInt(1, 0);
                    pst2.setString(2, nombre );
                    pst2.setString(3, mail  );
                    pst2.setString(4, telefono);
                    pst2.setString(5, username);
                    pst2.setString(6, pass);
                    pst2.setString(7, permisos_string);
                    pst2.setString(8, "Activo");
                    pst2.setString(9, user);
                    
                    pst2.executeUpdate();
                    cn2.close();
                    
                    Limpiar();
                    
                    txtNombre.setBackground(Color.green);
                    txtTel.setBackground(Color.green);
                    txtCorreo.setBackground(Color.green);
                    txtUsuario.setBackground(Color.green);
                    txtPass.setBackground(Color.green);
                    
                        JOptionPane.showMessageDialog(null, "Registro Exitoso.");
                        this.dispose();//Este metodo nos perimite eliminar objetos y liberar resursos
                        //(hace que al registrar se cierre la ventana registro

                    } catch (SQLException e) {
                        System.err.println("Error al registrar usuario.");
                        JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar usuario!!, contacte al administrador.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en validar nombre de usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al comparar usuario!!, contacte al administrador.");
        }
    }//GEN-LAST:event_btnAgregarTxtMouseClicked

    private void btnAgregarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarTxtMouseEntered
        AgregarPanel.setBackground(new Color (0, 228,223));
        btnAgregarTxt.setForeground(Color.white);
    }//GEN-LAST:event_btnAgregarTxtMouseEntered

    private void btnAgregarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarTxtMouseExited
         AgregarPanel.setBackground(new Color(0,228,163));
        btnAgregarTxt.setForeground(new Color(0,51,102));
    }//GEN-LAST:event_btnAgregarTxtMouseExited

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
         if (evt.getActionCommand().equals("\n"));{
            txtTel.requestFocus();  
        }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
         if (evt.getActionCommand().equals("\n"));{
            txtCorreo.requestFocus();  
        }
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
         if (evt.getActionCommand().equals("\n"));{
            cmbNiveles.requestFocus();  
        }
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void cmbNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelesActionPerformed
         if (evt.getActionCommand().equals("\n"));{
            txtUsuario.requestFocus();  
        }
    }//GEN-LAST:event_cmbNivelesActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
         if (evt.getActionCommand().equals("\n"));{
            txtPass.requestFocus();  
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        if (evt.getActionCommand().equals("\n"));{
            btnAgregarTxtMouseClicked(null);   
        }
    }//GEN-LAST:event_txtPassActionPerformed

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
            java.util.logging.Logger.getLogger(RegistarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound AgregarPanel;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnAgregarTxt;
    private javax.swing.JComboBox<String> cmbNiveles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private clases.PanelRound panelRound4;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    public void Limpiar(){
        txtNombre.setText("");
        txtTel.setText("");
        txtCorreo.setText("");
        cmbNiveles.setSelectedIndex(0);
        txtUsuario.setText("");
        txtPass.setText("");    
    }
}
