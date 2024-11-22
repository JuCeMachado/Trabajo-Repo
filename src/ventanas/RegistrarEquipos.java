
package ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import clases.Conexion;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class RegistrarEquipos extends javax.swing.JFrame {

    int IDcliente_update = 0;
    String user = "", nom_cliente = "";
    /**
     * Creates new form RegistrarEquipos
     */
    public RegistrarEquipos() {
        initComponents();
        
        user = Login.user;
        IDcliente_update = GestionarClientes.IDcliente_update;
        
        try{
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_cliente from clientes where id_cliente = '" + IDcliente_update + "'");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                nom_cliente = rs.getString("nombre_cliente");
            }
            
        }
        catch(SQLException e){
            System.out.println("Error al consultar el nombre del cliente.");
        }
        
        
        setTitle("Registrar nuevo equipo para " + nom_cliente);
        txtNombreCliente.setText(nom_cliente);
        setSize(630,450);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlbl_titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblNombre1 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        cmb_tipoequipo = new javax.swing.JComboBox<>();
        lblNombre5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_observaciones = new javax.swing.JTextPane();
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

        jlbl_titulo.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_titulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_titulo.setText("Registro de equipo");
        jPanel2.add(jlbl_titulo);
        jlbl_titulo.setBounds(60, 0, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtNombreCliente.setBorder(null);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 10));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre del cliente:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtModelo.setBorder(null);
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 210, 10));

        lblNombre1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre1.setText("Daño reportado y observaciones:");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        txtNumSerie.setBackground(new java.awt.Color(255, 255, 255));
        txtNumSerie.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtNumSerie.setBorder(null);
        txtNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSerieActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 210, 10));

        lblNombre2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre2.setText("N° de serie:");
        jPanel1.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lblNombre3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre3.setText("Modelo:");
        jPanel1.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lblNombre4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre4.setText("Marca:");
        jPanel1.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HP", "Lenovo", "Dell", "Acer", "Apple ", "Toshiba ", "Brother", "Samsung", "Asus", "Alienware", "Xerox" }));
        cmbMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, -1));

        cmb_tipoequipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Impresora", "Multifuncional" }));
        cmb_tipoequipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_tipoequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoequipoActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_tipoequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, -1));

        lblNombre5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre5.setText("Tipo de equipo:");
        jPanel1.add(lblNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jScrollPane2.setViewportView(jTextPane_observaciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 350, 230));

        RegistrarPanel.setBackground(new java.awt.Color(0, 228, 163));
        RegistrarPanel.setRoundBottomLeft(25);
        RegistrarPanel.setRoundBottomRight(25);
        RegistrarPanel.setRoundTopLeft(25);
        RegistrarPanel.setRoundTopRight(25);

        btnRegistrarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegistrarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnRegistrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarTxt.setText("Registar equipo");
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
            .addComponent(btnRegistrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        RegistrarPanelLayout.setVerticalGroup(
            RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(RegistrarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 120, 30));

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

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            cmb_tipoequipo.requestFocus();
        }
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtNumSerie.requestFocus();
        }
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSerieActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            jScrollPane2.requestFocus();
        }
    }//GEN-LAST:event_txtNumSerieActionPerformed

    private void btnRegistrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseClicked
        
        int IDequipo, validacion = 0;
        String tipo_equipo, marca, modelo, num_serie, dia_ingreso, mes_ingreso, annio_ingreso, 
            estatus, observaciones = "";
        
        tipo_equipo = cmb_tipoequipo.getSelectedItem().toString();
        marca = cmbMarca.getSelectedItem().toString();
        modelo = txtModelo.getText().trim();
        num_serie = txtNumSerie.getText().trim();
        observaciones = jTextPane_observaciones.getText().trim();
        estatus = "Nuevo Ingreso";
        
        Calendar calendar = Calendar.getInstance();
        dia_ingreso = Integer.toString(calendar.get(Calendar.DATE));
        mes_ingreso = Integer.toString(calendar.get(Calendar.MONTH));
        annio_ingreso = Integer.toString(calendar.get(Calendar.YEAR));
        
        if(modelo.equals("")){
            txtModelo.setBackground(Color.red);
            validacion++;
        } 
        if(num_serie.equals("")) {
             txtNumSerie.setBackground(Color.red);
             validacion++;
        }
        if(observaciones.equals("")){
            jTextPane_observaciones.setText("Sin observaciones.");
            validacion++;
        }
       
        if(validacion == 0){
            
         try{
             Connection cn = Conexion.conectar();
             PreparedStatement pst = cn.prepareStatement(
                     "Insert into equipos values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
             pst.setInt(1, 0);
             pst.setInt(2, IDcliente_update);
             pst.setString(3, tipo_equipo);
             pst.setString(4, marca);
             pst.setString(5, modelo);
             pst.setString(6, num_serie);
             pst.setString(7, dia_ingreso);
             pst.setString(8, mes_ingreso);
             pst.setString(9, annio_ingreso);
             pst.setString(10, observaciones);
             pst.setString(11, estatus);
             pst.setString(12, user);
             pst.setString(13, "");
             pst.setString(14, "");
             
             pst.executeUpdate();
             cn.close();

             
             
             txtNombreCliente.setBackground(Color.green);
             txtModelo.setBackground(Color.green);
             txtNumSerie.setBackground(Color.green);
             
             JOptionPane.showMessageDialog(null, "Registro Exitoso.");
             this.dispose();
             
         }   
         catch(SQLException e){
             System.err.println("Error en registrar equipo. " + e);
              JOptionPane.showMessageDialog(null, "Error al registrar equipo!!, contacte al administrador."); 
         }
        }else{  
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");   
        }
    }//GEN-LAST:event_btnRegistrarTxtMouseClicked

    private void btnRegistrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseEntered
        RegistrarPanel.setBackground(new Color (0, 228,223));
        btnRegistrarTxt.setForeground(Color.white);
    }//GEN-LAST:event_btnRegistrarTxtMouseEntered

    private void btnRegistrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseExited
        RegistrarPanel.setBackground(new Color(0,228,163));
        btnRegistrarTxt.setForeground(new Color(0,51,102));
    }//GEN-LAST:event_btnRegistrarTxtMouseExited

    private void cmb_tipoequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoequipoActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
           cmbMarca.requestFocus();
        }
    }//GEN-LAST:event_cmb_tipoequipoActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtModelo.requestFocus();
        }
    }//GEN-LAST:event_cmbMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound RegistrarPanel;
    private javax.swing.JLabel btnRegistrarTxt;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmb_tipoequipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextPane jTextPane_observaciones;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private clases.PanelRound panelRound4;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables
}
