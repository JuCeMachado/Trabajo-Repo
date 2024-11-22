package ventanas;

import java.awt.Color;

import java.sql.*;
import clases.Conexion;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class InformacionCliente extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    int IDcliente_update = 0;
    public static int IDequipo = 0;
    String user = "";

    public InformacionCliente() {
        initComponents();
        user = Login.user;
        IDcliente_update = GestionarClientes.IDcliente_update;

        setSize(630, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from clientes where id_cliente = '" + IDcliente_update + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                setTitle("Información del cliente " + rs.getString("nombre_cliente") + " - Sesión de " + user);
                jlbl_titulo.setText("Información de " + rs.getString("nombre_cliente"));

                txtNombre.setText(rs.getString("nombre_cliente"));
                txtCorreo.setText(rs.getString("correo"));
                txtTel.setText(rs.getString("tel_cliente"));
                txtDir.setText(rs.getString("dir_cliente"));
                txtUltima_modificacion.setText(rs.getString("ultima_modificacion"));

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al cargar!!, contacte al administrador.");
        }
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_equipo, tipo_equipo, marca, estatus from equipos where id_cliente = '"
                    + IDcliente_update + "'");
            ResultSet rs = pst.executeQuery();

            dg_Equipos = new JTable(model);
            JScroll_equipos.setViewportView(dg_Equipos);

            model.addColumn("ID equipo");
            model.addColumn("Tipo de equipo");
            model.addColumn("Marca");
            model.addColumn("Estatus");

            while (rs.next()) {
                Object[] fila = new Object[4];

                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);

            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al cargar la tabla.");
        }

        dg_Equipos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = dg_Equipos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    IDequipo = (int) model.getValueAt(fila_point, columna_point);
                    InformacionEquipo infoEquipo = new InformacionEquipo();
                    infoEquipo.setVisible(true);
                }
            }
        });

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
        jlbl_titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JScroll_equipos = new javax.swing.JScrollPane();
        dg_Equipos = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblNombre1 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombre2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblNombre3 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        txtUltima_modificacion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombre4 = new javax.swing.JLabel();
        RegistrarPanel = new clases.PanelRound();
        btnRegistrarTxt = new javax.swing.JLabel();
        ActualizarPanel1 = new clases.PanelRound();
        btnActualizarTxt = new javax.swing.JLabel();
        ImprimirPanel = new clases.PanelRound();
        btnImprimir = new javax.swing.JLabel();

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
        jPanel2.add(jlbl_titulo);
        jlbl_titulo.setBounds(50, 0, 370, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        dg_Equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JScroll_equipos.setViewportView(dg_Equipos);

        jPanel1.add(JScroll_equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 600, 150));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 10));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, 10));

        lblNombre1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre1.setText("Em@il:");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

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

        lblNombre2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre2.setText("Teléfono:");
        jPanel1.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 210, 10));

        lblNombre3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre3.setText("Ultima Modificación:");
        jPanel1.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        txtDir.setBackground(new java.awt.Color(255, 255, 255));
        txtDir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtDir.setBorder(null);
        txtDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirActionPerformed(evt);
            }
        });
        jPanel1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 210, -1));

        txtUltima_modificacion.setEditable(false);
        txtUltima_modificacion.setBackground(new java.awt.Color(255, 255, 255));
        txtUltima_modificacion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUltima_modificacion.setBorder(null);
        txtUltima_modificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUltima_modificacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtUltima_modificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 210, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 210, 10));

        lblNombre4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre4.setText("Dirección:");
        jPanel1.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        RegistrarPanel.setBackground(new java.awt.Color(0, 228, 163));
        RegistrarPanel.setRoundBottomLeft(25);
        RegistrarPanel.setRoundBottomRight(25);
        RegistrarPanel.setRoundTopLeft(25);
        RegistrarPanel.setRoundTopRight(25);

        btnRegistrarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegistrarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnRegistrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarTxt.setText("Registar equipo");
        btnRegistrarTxt.setToolTipText("Registrar un equipo al cliente");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RegistrarPanelLayout.setVerticalGroup(
            RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(RegistrarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 130, 30));

        ActualizarPanel1.setBackground(new java.awt.Color(0, 228, 163));
        ActualizarPanel1.setRoundBottomLeft(25);
        ActualizarPanel1.setRoundBottomRight(25);
        ActualizarPanel1.setRoundTopLeft(25);
        ActualizarPanel1.setRoundTopRight(25);

        btnActualizarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizarTxt.setForeground(new java.awt.Color(0, 51, 102));
        btnActualizarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizarTxt.setText("Actualizar Datos");
        btnActualizarTxt.setToolTipText("Actualizar datos del cliente");
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

        javax.swing.GroupLayout ActualizarPanel1Layout = new javax.swing.GroupLayout(ActualizarPanel1);
        ActualizarPanel1.setLayout(ActualizarPanel1Layout);
        ActualizarPanel1Layout.setHorizontalGroup(
            ActualizarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizarPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ActualizarPanel1Layout.setVerticalGroup(
            ActualizarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizarPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(ActualizarPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 130, 30));

        ImprimirPanel.setBackground(new java.awt.Color(0, 228, 163));
        ImprimirPanel.setRoundBottomLeft(25);
        ImprimirPanel.setRoundBottomRight(25);
        ImprimirPanel.setRoundTopLeft(25);
        ImprimirPanel.setRoundTopRight(25);

        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir (32).png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir datos del cliente");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ImprimirPanelLayout = new javax.swing.GroupLayout(ImprimirPanel);
        ImprimirPanel.setLayout(ImprimirPanelLayout);
        ImprimirPanelLayout.setHorizontalGroup(
            ImprimirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImprimirPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ImprimirPanelLayout.setVerticalGroup(
            ImprimirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImprimirPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(ImprimirPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 50, 40));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirActionPerformed

    private void btnActualizarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseClicked
        int validacion = 0;
        String nombre, mail, telefono, direccion = "";

        nombre = txtNombre.getText().trim();
        mail = txtCorreo.getText().trim();
        telefono = txtTel.getText().trim();
        direccion = txtDir.getText().trim();

        if (nombre.equals("")) {
            txtNombre.setBackground(Color.red);
            validacion++;
        }
        if (mail.equals("")) {
            txtCorreo.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txtTel.setBackground(Color.red);
            validacion++;
        }
        if (direccion.equals("")) {
            txtDir.setBackground(Color.red);
            validacion++;
        }

        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "Update clientes set nombre_cliente = ?, correo = ?, tel_cliente = ?, dir_cliente=?, ultima_modificacion=? "
                        + "where id_cliente = '" + IDcliente_update + "'");

                pst.setString(1, nombre);
                pst.setString(2, mail);
                pst.setString(3, telefono);
                pst.setString(4, direccion);
                pst.setString(5, user);

                pst.executeUpdate();
                cn.close();

                Limpiar();

                txtNombre.setBackground(Color.green);
                txtTel.setBackground(Color.green);
                txtCorreo.setBackground(Color.green);
                txtDir.setBackground(Color.green);

                JOptionPane.showMessageDialog(null, "Actualización correcta.");
                this.dispose();

            } catch (SQLException e) {
                System.err.println("Error en actualizar cliente." + e);
                JOptionPane.showMessageDialog(null, "¡¡Error al actualizar cliente!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
        }

    }//GEN-LAST:event_btnActualizarTxtMouseClicked

    private void btnActualizarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseEntered
        
    }//GEN-LAST:event_btnActualizarTxtMouseEntered

    private void btnActualizarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseExited
        
    }//GEN-LAST:event_btnActualizarTxtMouseExited

    private void btnRegistrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseClicked
        RegistrarEquipos rs = new RegistrarEquipos();
        rs.setVisible(true);
    }//GEN-LAST:event_btnRegistrarTxtMouseClicked

    private void btnRegistrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseEntered
        RegistrarPanel.setBackground(new Color(0, 228, 223));
        btnRegistrarTxt.setForeground(Color.white);
    }//GEN-LAST:event_btnRegistrarTxtMouseEntered

    private void btnRegistrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTxtMouseExited
        RegistrarPanel.setBackground(new Color(0, 228, 163));
        btnRegistrarTxt.setForeground(new Color(0, 51, 102));
    }//GEN-LAST:event_btnRegistrarTxtMouseExited

    private void txtUltima_modificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUltima_modificacionActionPerformed

    }//GEN-LAST:event_txtUltima_modificacionActionPerformed

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
         Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/onedrive/Escritorio/" + txtNombre.getText().trim() + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/images/Headerexa.jpeg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Información del cliente. \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tablaCliente = new PdfPTable(5);
            tablaCliente.addCell("ID");
            tablaCliente.addCell("Nombre");
            tablaCliente.addCell("email");
            tablaCliente.addCell("Télefono");
            tablaCliente.addCell("Dirección");

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "Select * from clientes where id_cliente = '" + IDcliente_update + "'");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tablaCliente.addCell(rs.getString(1));
                        tablaCliente.addCell(rs.getString(2));
                        tablaCliente.addCell(rs.getString(3));
                        tablaCliente.addCell(rs.getString(4));
                        tablaCliente.addCell(rs.getString(5));
                    } while (rs.next());

                    documento.add(tablaCliente);
                }
                
                Paragraph parrafo2 = new Paragraph();
                parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo2.add("\n \n Equipos registrados. \n \n");
                parrafo2.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
                
                documento.add(parrafo2);
                PdfPTable tablaEquipos = new PdfPTable(4);
                tablaEquipos.addCell("ID equipo");
                tablaEquipos.addCell("Tipo");
                tablaEquipos.addCell("Marca");
                tablaEquipos.addCell("Estatus");
                
                try{
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "Select id_equipo, tipo_equipo, marca, estatus from equipos where id_cliente = '" + IDcliente_update + "'");
                    ResultSet rs2 = pst2.executeQuery();
                if (rs2.next()) {
                    do {
                        tablaEquipos.addCell(rs2.getString(1));
                        tablaEquipos.addCell(rs2.getString(2));
                        tablaEquipos.addCell(rs2.getString(3));
                        tablaEquipos.addCell(rs2.getString(4));
                    } while (rs2.next());

                    documento.add(tablaEquipos);
                }
                }catch(SQLException e){
                    System.out.println("Error al cargar equipos" + e);
                }
          
            }catch(SQLException e){
                System.err.println("Error al obtener datos de cliente.");
            }       
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado correctamente.");
            
        } catch (DocumentException | IOException e) {
            System.err.println("Error en PDF. " + e);
            JOptionPane.showMessageDialog(null, "Error al generar PDF, contacte al administrador.");
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        ImprimirPanel.setBackground(new Color(0, 228, 223));
        
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        ImprimirPanel.setBackground(new Color(0, 228, 163));
        
    }//GEN-LAST:event_btnImprimirMouseExited

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
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound ActualizarPanel1;
    private clases.PanelRound ImprimirPanel;
    private javax.swing.JScrollPane JScroll_equipos;
    private clases.PanelRound RegistrarPanel;
    private javax.swing.JLabel btnActualizarTxt;
    private javax.swing.JLabel btnImprimir;
    private javax.swing.JLabel btnRegistrarTxt;
    private javax.swing.JTable dg_Equipos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUltima_modificacion;
    // End of variables declaration//GEN-END:variables
    private void Limpiar() {
        txtNombre.setText("");
        txtTel.setText("");
        txtDir.setText("");
        txtCorreo.setText("");
    }
}
