package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RestaurarPassword extends javax.swing.JFrame {

    String user = "", user_update = "";
    
   
    public RestaurarPassword() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_update;
        
        setSize(360, 280);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Cambio de contraseña " + user_update);
        
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

        dgPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        txtPass1 = new javax.swing.JPasswordField();
        txtPass2 = new javax.swing.JPasswordField();
        RestaurarPanel = new clases.PanelRound();
        btnRestaurarTxt = new javax.swing.JLabel();
        panelRound4 = new clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        dgPanel.setBackground(new java.awt.Color(255, 255, 255));
        dgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        lblTitulo.setText("Cambio de contraseña");
        jPanel2.add(lblTitulo);
        lblTitulo.setBounds(60, 0, 200, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        dgPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));
        dgPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 10));
        dgPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 10));

        lbl1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setText("Nueva Contraseña:");
        dgPanel.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lbl2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("Confirmar Contraseña:");
        dgPanel.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtPass1.setForeground(new java.awt.Color(204, 204, 204));
        txtPass1.setText("********");
        txtPass1.setBorder(null);
        txtPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPass1MousePressed(evt);
            }
        });
        txtPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass1ActionPerformed(evt);
            }
        });
        dgPanel.add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 20));

        txtPass2.setForeground(new java.awt.Color(204, 204, 204));
        txtPass2.setText("********");
        txtPass2.setBorder(null);
        txtPass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPass2MousePressed(evt);
            }
        });
        txtPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass2ActionPerformed(evt);
            }
        });
        dgPanel.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, 20));

        RestaurarPanel.setBackground(new java.awt.Color(0, 228, 163));
        RestaurarPanel.setRoundBottomLeft(25);
        RestaurarPanel.setRoundBottomRight(25);
        RestaurarPanel.setRoundTopLeft(25);
        RestaurarPanel.setRoundTopRight(25);

        btnRestaurarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRestaurarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnRestaurarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRestaurarTxt.setText("Restaurar");
        btnRestaurarTxt.setToolTipText("");
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

        dgPanel.add(RestaurarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 160, 30));

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

        dgPanel.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestaurarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaurarTxtMouseClicked
       String password, confirmar_password = "";
       
       password = txtPass1.getText().trim();
       confirmar_password = txtPass2.getText().trim();
       
       
        if (!password.equals("") && !confirmar_password.equals("")) {
            
            if (password.equals(confirmar_password)) {
                
                try{
                    Connection cn =  Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement(
                            "update usuarios set password = ? where username = '" + user_update + "'");
                    pst.setString(1, password);
                    pst.executeUpdate();
                    cn.close();
                    txtPass1.setBackground(Color.green);
                    txtPass2.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "Restauración exitosa.");
                    this.dispose();
                }
                catch(SQLException e)
                {
                    System.out.println("Error en restaurar password " + e);
                }
                
            } else {
                txtPass2.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "Las contraseñas  no coinciden.");
            }
        } else {
            txtPass1.setBackground(Color.red);
            txtPass2.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "No se admiten contraseñas vacias.");
        }

    }//GEN-LAST:event_btnRestaurarTxtMouseClicked

    private void btnRestaurarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaurarTxtMouseEntered
        RestaurarPanel.setBackground(new Color (0, 228,223));
        btnRestaurarTxt.setForeground(Color.white);
    }//GEN-LAST:event_btnRestaurarTxtMouseEntered

    private void btnRestaurarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaurarTxtMouseExited
        RestaurarPanel.setBackground(new Color(0,228,163));
        btnRestaurarTxt.setForeground(new Color(0,51,102));
    }//GEN-LAST:event_btnRestaurarTxtMouseExited

    private void txtPass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPass1MousePressed
       if (txtPass1.getText().equals("********")) {
            txtPass1.setText("");
            txtPass1.setForeground(Color.black);
        }
        if (String.valueOf(txtPass2.getPassword()).isEmpty()) {
            txtPass2.setText("********");
            txtPass2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPass1MousePressed

    private void txtPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass1ActionPerformed
         txtPass2.requestFocus();
        txtPass2.setText("");
        txtPass2.setForeground(Color.black);
    }//GEN-LAST:event_txtPass1ActionPerformed

    private void txtPass2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPass2MousePressed
       if (String.valueOf(txtPass2.getPassword()).equals("********")) {
            txtPass2.setText("");
            txtPass2.setForeground(Color.black);
        }
        if (txtPass1.getText().isEmpty()) {
            txtPass1.setText("********");
            txtPass1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPass2MousePressed

    private void txtPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass2ActionPerformed
         if (evt.getActionCommand().equals("\n"));{
            btnRestaurarTxtMouseClicked(null);   
        }
    }//GEN-LAST:event_txtPass2ActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound RestaurarPanel;
    private javax.swing.JLabel btnRestaurarTxt;
    private javax.swing.JPanel dgPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblTitulo;
    private clases.PanelRound panelRound4;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    // End of variables declaration//GEN-END:variables
}
