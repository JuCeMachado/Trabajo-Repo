package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.WindowConstants;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Creatividad extends javax.swing.JFrame {

    int sesion_usuario = 0;
    public static int ultimo_numero ; // Variable para el último número de nota
    String user = "";
    String nombre_usuario = "";
    private final String nombreArchivo = "tareas.txt"; // Archivo para guardar las tareas

    public Creatividad() {
        initComponents();
        cargarTareas(); // Cargar notas al abrir la ventana
        user = Login.user;
        sesion_usuario = Administrador.sesion_usuario;
        setTitle("Sesión de " + user);
        setSize(730, 450);
        setResizable(false);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
         // Añadir WindowListener para guardar las notas al cerrar la ventana
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
               guardarTareas(); // Guardar notas al cerrar
                super.windowClosing(e);
            }
        });
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = '" + user + "'");

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombre_usuario = rs.getString("nombre_usuario");

            }
        } catch (SQLException e) {
            System.err.println("Error en conexión desde la interfaz Administrador.");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new clases.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaNota = new javax.swing.JTextArea();
        AgregarPanel = new clases.PanelRound();
        txtAgregarPanel = new javax.swing.JLabel();
        panelRound3 = new clases.PanelRound();
        txtAnotar = new javax.swing.JTextField();
        LimpiarPanel = new clases.PanelRound();
        txtLimpiarPanel = new javax.swing.JLabel();
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
        jLabel9.setBounds(20, 10, 30, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Anotaciones del día");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 0, 180, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        panelRound1.setBackground(new java.awt.Color(0, 208, 163));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        txtAreaNota.setBackground(new java.awt.Color(0, 180, 163));
        txtAreaNota.setColumns(20);
        txtAreaNota.setRows(5);
        jScrollPane1.setViewportView(txtAreaNota);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 690, 270));

        AgregarPanel.setBackground(new java.awt.Color(0, 208, 163));
        AgregarPanel.setRoundBottomLeft(100);
        AgregarPanel.setRoundBottomRight(100);
        AgregarPanel.setRoundTopLeft(100);
        AgregarPanel.setRoundTopRight(100);

        txtAgregarPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregarPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/massss.png"))); // NOI18N
        txtAgregarPanel.setToolTipText("Agregar nota");
        txtAgregarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgregarPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAgregarPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgregarPanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarPanelLayout = new javax.swing.GroupLayout(AgregarPanel);
        AgregarPanel.setLayout(AgregarPanelLayout);
        AgregarPanelLayout.setHorizontalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtAgregarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AgregarPanelLayout.setVerticalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtAgregarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(AgregarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 30, 30));

        panelRound3.setBackground(new java.awt.Color(0, 180, 163));
        panelRound3.setRoundBottomLeft(25);
        panelRound3.setRoundBottomRight(25);
        panelRound3.setRoundTopLeft(25);
        panelRound3.setRoundTopRight(25);

        txtAnotar.setBackground(new java.awt.Color(0, 180, 163));
        txtAnotar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtAnotar.setForeground(new java.awt.Color(204, 204, 204));
        txtAnotar.setText("Anota algo...");
        txtAnotar.setBorder(null);
        txtAnotar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAnotarMousePressed(evt);
            }
        });
        txtAnotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtAnotar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAnotar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, 30));

        LimpiarPanel.setBackground(new java.awt.Color(0, 208, 163));
        LimpiarPanel.setRoundBottomLeft(100);
        LimpiarPanel.setRoundBottomRight(100);
        LimpiarPanel.setRoundTopLeft(100);
        LimpiarPanel.setRoundTopRight(100);

        txtLimpiarPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLimpiarPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vaciar.png"))); // NOI18N
        txtLimpiarPanel.setToolTipText("Vaciar registro de notas(Administrador)");
        txtLimpiarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLimpiarPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLimpiarPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLimpiarPanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LimpiarPanelLayout = new javax.swing.GroupLayout(LimpiarPanel);
        LimpiarPanel.setLayout(LimpiarPanelLayout);
        LimpiarPanelLayout.setHorizontalGroup(
            LimpiarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LimpiarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtLimpiarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LimpiarPanelLayout.setVerticalGroup(
            LimpiarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LimpiarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtLimpiarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(LimpiarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 30, 30));

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

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnotarActionPerformed
        if (evt.getActionCommand().equals("\n"));
        {
            txtAgregarPanelMouseClicked(null);
        }
    }//GEN-LAST:event_txtAnotarActionPerformed

    private void txtAnotarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnotarMousePressed
        txtAnotar.setForeground(Color.GRAY);
        if (txtAnotar.getText().equals("Anota algo...")) {
            txtAnotar.setText("");
            txtAnotar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAnotarMousePressed

    private void txtLimpiarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLimpiarPanelMouseClicked
        if (sesion_usuario == 1) {

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas vaciar todas las notas?", "Confirmar", JOptionPane.YES_NO_OPTION);

            // Si el usuario selecciona "Sí"
            if (respuesta == JOptionPane.YES_OPTION) {
                txtAreaNota.setText("");  // Limpia el área de texto
                JOptionPane.showMessageDialog(null, "Las notas han sido vaciadas.");  // Muestra un mensaje de confirmación
                ultimo_numero = 0;
                System.out.println("Último número de notas: " + ultimo_numero);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Solo el administrador puede limpiar el anotador.");
        }
    }//GEN-LAST:event_txtLimpiarPanelMouseClicked

    private void txtLimpiarPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLimpiarPanelMouseEntered
        LimpiarPanel.setBackground(new Color(0, 228, 223));
        txtLimpiarPanel.setForeground(Color.white);
    }//GEN-LAST:event_txtLimpiarPanelMouseEntered

    private void txtLimpiarPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLimpiarPanelMouseExited
        LimpiarPanel.setBackground(new Color(0, 228, 163));
        txtLimpiarPanel.setForeground(new Color(0, 51, 102));
    }//GEN-LAST:event_txtLimpiarPanelMouseExited

    private void txtAgregarPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPanelMouseExited
        AgregarPanel.setBackground(new Color(0, 228, 163));
        txtAgregarPanel.setForeground(new Color(0, 51, 102));
    }//GEN-LAST:event_txtAgregarPanelMouseExited

    private void txtAgregarPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPanelMouseEntered
        AgregarPanel.setBackground(new Color(0, 228, 223));
        txtAgregarPanel.setForeground(Color.white);
    }//GEN-LAST:event_txtAgregarPanelMouseEntered

    private void txtAgregarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPanelMouseClicked
        
        String nota = txtAnotar.getText().trim();
        if (!nota.equals("") && !nota.equals("Anota algo...")) {
            // Incrementar el último número de nota
            ultimo_numero ++;

            // Obtener la fecha y hora actual
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String fechaHora = now.format(formatter);

            // Concatenar la nota con la fecha y el usuario
            txtAreaNota.append(ultimo_numero + "- " + nota + " (nota de: " + nombre_usuario + ") " + fechaHora + "  \n");
            txtAnotar.setText("Anota algo...");
            txtAnotar.setForeground(Color.gray);
            System.out.println("Último número de notas: " + ultimo_numero);
        } else {
            JOptionPane.showMessageDialog(null, "El campo de tarea está vacío.");
            
        }
    }//GEN-LAST:event_txtAgregarPanelMouseClicked

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
            java.util.logging.Logger.getLogger(Creatividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creatividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creatividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creatividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creatividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound AgregarPanel;
    private clases.PanelRound LimpiarPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private clases.PanelRound panelRound1;
    private clases.PanelRound panelRound3;
    private clases.PanelRound panelRound4;
    private javax.swing.JLabel txtAgregarPanel;
    private javax.swing.JTextField txtAnotar;
    private javax.swing.JTextArea txtAreaNota;
    private javax.swing.JLabel txtLimpiarPanel;
    // End of variables declaration//GEN-END:variables

// Método para cargar las tareas desde un archivo
    public void cargarTareas() {
        // Cargar el último número de nota desde un archivo
        try (BufferedReader reader = new BufferedReader(new FileReader("ultimo_numero.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                ultimo_numero = Integer.parseInt(line);
            }
        } catch (IOException e) {
            ultimo_numero = 0; // Comenzar desde cero si no se encuentra el archivo
        }
        // Cargar las tareas
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                txtAreaNota.append(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo de tareas.");
        }
    }
    public void guardarTareas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(txtAreaNota.getText());
        } catch (IOException e) {
            System.out.println("No se pudo guardar el archivo de tareas.");
        }
        // Guardar el último número de nota
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ultimo_numero.txt"))) {
            writer.write(String.valueOf(ultimo_numero));
        } catch (IOException e) {
            System.out.println("No se pudo guardar el último número.");
        }
    }   
}

