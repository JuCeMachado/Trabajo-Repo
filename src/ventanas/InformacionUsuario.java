package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
        

public class InformacionUsuario extends javax.swing.JFrame {

    String user = "", user_update = "";
    int ID;
    
    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_update;
        setLocationRelativeTo(null);
        setSize(650, 460);
        setResizable(false);
        setTitle("Información del usuario " + user_update + " - Sesión de " + user);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        lblTitulo.setText("Información del usuario " + user_update);
        
        try{
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "Select * from usuarios where username = '" + user_update + "'");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                ID =  rs.getInt("id_usuario");
                
                txtNombre.setText(rs.getString("nombre_usuario"));
                txtCorreo.setText(rs.getString("email"));
                txtTel.setText(rs.getString("telefono"));
                txtUserName.setText(rs.getString("username"));
                txtRegistradoPor.setText(rs.getString("registrado_por"));
                cmbNiveles.setSelectedItem(rs.getString("tipo_nivel"));
                cmbEstatus.setSelectedItem(rs.getString("estatus"));
            }
            cn.close();
        }
        catch(SQLException e){
            System.err.println("Error en cargar usuario " + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al cargar!!, contacte al administrador.");
        }
        
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
        txtRegistradoPor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblPass = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtTel = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        cmbEstatus = new javax.swing.JComboBox<>();
        lblUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblCorreo1 = new javax.swing.JLabel();
        lblCorreo2 = new javax.swing.JLabel();
        cmbNiveles = new javax.swing.JComboBox<>();
        lblUsuario1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        ActualizarPanel = new clases.PanelRound();
        btnActualizarTxt = new javax.swing.JLabel();
        RestaurarPanel = new clases.PanelRound();
        btnRestaurarTxt = new javax.swing.JLabel();
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
        lblTitulo.setText("Información de Usuario");
        jPanel2.add(lblTitulo);
        lblTitulo.setBounds(60, 0, 340, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        txtRegistradoPor.setBackground(new java.awt.Color(255, 255, 255));
        txtRegistradoPor.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtRegistradoPor.setBorder(null);
        txtRegistradoPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistradoPorActionPerformed(evt);
            }
        });
        jPanel1.add(txtRegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 210, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 220, 10));

        lblPass.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblPass.setForeground(new java.awt.Color(0, 0, 0));
        lblPass.setText("Estatus:");
        jPanel1.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

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

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtTel.setBorder(null);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 220, 10));

        cmbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmbEstatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstatusActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 120, -1));

        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Registrado Por:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblTel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblTel.setForeground(new java.awt.Color(0, 0, 0));
        lblTel.setText("Teléfono:");
        jPanel1.add(lblTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, 10));

        lblCorreo1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo1.setText("Em@il:");
        jPanel1.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblCorreo2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo2.setText("Permisos De:");
        jPanel1.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, -1));

        cmbNiveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Secretario", "Tecnico" }));
        cmbNiveles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));

        lblUsuario1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario1.setText("Username:");
        jPanel1.add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        txtUserName.setBackground(new java.awt.Color(255, 255, 255));
        txtUserName.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUserName.setBorder(null);
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 210, -1));

        ActualizarPanel.setBackground(new java.awt.Color(0, 228, 163));
        ActualizarPanel.setRoundBottomLeft(25);
        ActualizarPanel.setRoundBottomRight(25);
        ActualizarPanel.setRoundTopLeft(25);
        ActualizarPanel.setRoundTopRight(25);

        btnActualizarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnActualizarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizarTxt.setText("Actualizar");
        btnActualizarTxt.setToolTipText("Actualizar datos del usuario ");
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ActualizarPanelLayout.setVerticalGroup(
            ActualizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(ActualizarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 160, 30));

        RestaurarPanel.setBackground(new java.awt.Color(0, 228, 163));
        RestaurarPanel.setRoundBottomLeft(25);
        RestaurarPanel.setRoundBottomRight(25);
        RestaurarPanel.setRoundTopLeft(25);
        RestaurarPanel.setRoundTopRight(25);

        btnRestaurarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRestaurarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnRestaurarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRestaurarTxt.setText("Restaurar");
        btnRestaurarTxt.setToolTipText("Restaurar contraseña del usuario");
        btnRestaurarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestaurarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestaurarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestaurarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestaurarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RestaurarPanelLayout = new javax.swing.GroupLayout(RestaurarPanel);
        RestaurarPanel.setLayout(RestaurarPanelLayout);
        RestaurarPanelLayout.setHorizontalGroup(
            RestaurarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RestaurarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRestaurarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RestaurarPanelLayout.setVerticalGroup(
            RestaurarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RestaurarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRestaurarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(RestaurarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 160, 30));

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

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegistradoPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistradoPorActionPerformed
       
    }//GEN-LAST:event_txtRegistradoPorActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtTel.requestFocus();
        }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtTelActionPerformed

    private void cmbEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstatusActionPerformed
       
    }//GEN-LAST:event_cmbEstatusActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            cmbNiveles.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void cmbNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelesActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtUserName.requestFocus();
        }
    }//GEN-LAST:event_cmbNivelesActionPerformed

    private void btnActualizarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseClicked
        
        int permisos_cmb, estatus_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, permisos_string = "", estatus_string = "";
        
        mail = txtCorreo.getText().trim();        
        nombre = txtNombre.getText().trim();  
        telefono = txtTel.getText().trim();
        username = txtUserName.getText().trim();
        permisos_cmb = cmbNiveles.getSelectedIndex() + 1;
        estatus_cmb = cmbEstatus.getSelectedIndex() + 1;
        
        if(nombre.equals("")){
            txtNombre.setBackground(Color.red);
            validacion++;
        }
        if(telefono.equals("")){
            txtTel.setBackground(Color.red);
            validacion++;
        }
        if(mail.equals("")){
            txtCorreo.setBackground(Color.red);
            validacion++;
        }
        if(username.equals("")){
            txtUserName.setBackground(Color.red);
            validacion++;
        }
        if (validacion == 0) {
            if (permisos_cmb == 1) {
                permisos_string = "Administrador";
            } else if (permisos_cmb == 2) {
                permisos_string = "Secretario";
            } else if (permisos_cmb == 3) {
                permisos_string = "Tecnico";
            }
            
            if (estatus_cmb == 1) {
                estatus_string = "Activo";
            } else if (estatus_cmb == 2) {
                estatus_string = "Inactivo";
            }
            
            try{
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "Select username from usuarios where username = '" + username +"' "
                                + "and not id_usuario = '" + ID + "'");
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    txtUserName.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible.");
                    cn.close();
                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "Update usuarios set nombre_usuario=?, email=?, telefono=?, username=?, tipo_nivel=?,estatus=? "
                                    + "where id_usuario = '" + ID + "'");
                    
                    pst2.setString(1, nombre );
                    pst2.setString(2, mail );
                    pst2.setString(3, telefono);
                    pst2.setString(4, username);
                    pst2.setString(5, permisos_string);
                    pst2.setString(6, estatus_string);
                    
                    pst2.executeUpdate();
                    cn2.close();
                    JOptionPane.showMessageDialog(null,"Modificación Correcta.");
                }
                
            }
            catch(SQLException e){
                System.err.println("Error al actualizar." + e);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        try{
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnActualizarTxtMouseClicked

    private void btnActualizarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseEntered
         ActualizarPanel.setBackground(new Color (0, 228,223));
        btnActualizarTxt.setForeground(Color.white);                                          
    }//GEN-LAST:event_btnActualizarTxtMouseEntered

    private void btnActualizarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseExited
         ActualizarPanel.setBackground(new Color(0,228,163));
        btnActualizarTxt.setForeground(new Color(0,51,102));
    }//GEN-LAST:event_btnActualizarTxtMouseExited

    private void btnRestaurarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaurarTxtMouseClicked
        RestaurarPassword restaurar = new RestaurarPassword();
        restaurar.setVisible(true);
    }//GEN-LAST:event_btnRestaurarTxtMouseClicked

    private void btnRestaurarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaurarTxtMouseEntered
       RestaurarPanel.setBackground(new Color (0, 228,223));
        btnRestaurarTxt.setForeground(Color.white);
    }//GEN-LAST:event_btnRestaurarTxtMouseEntered

    private void btnRestaurarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaurarTxtMouseExited
         RestaurarPanel.setBackground(new Color(0,228,163));
        btnRestaurarTxt.setForeground(new Color(0,51,102));
    }//GEN-LAST:event_btnRestaurarTxtMouseExited

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
         if (evt.getActionCommand().equals("\n"));
        {
            cmbEstatus.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound ActualizarPanel;
    private clases.PanelRound RestaurarPanel;
    private javax.swing.JLabel btnActualizarTxt;
    private javax.swing.JLabel btnRestaurarTxt;
    private javax.swing.JComboBox<String> cmbEstatus;
    private javax.swing.JComboBox<String> cmbNiveles;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private clases.PanelRound panelRound4;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRegistradoPor;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
