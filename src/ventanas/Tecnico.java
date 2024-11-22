package ventanas;

import javax.swing.WindowConstants;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
//import ventanas.Creatividad;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Tecnico extends javax.swing.JFrame {

    String user, nombre_usuario;
    int sesion_usuario;

    public Tecnico() {
        initComponents();
        user = Login.user;
        sesion_usuario = Administrador.sesion_usuario;
        Creatividad creatividad = new Creatividad();
        int nuevasNotas = Creatividad.ultimo_numero;
        
         if (nuevasNotas != 0) {
            lblAnotaciones.setText("(" + nuevasNotas + " notas nuevas)");
        } else {
            lblAnotaciones.setText("");
        }

        setSize(570, 320);
        setResizable(false);
        setLocationRelativeTo(null);
        lblTitle.setText("Técnico - Sesión de " + user);

        
         if (sesion_usuario == 1) {  
             creatividad.dispose();
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } else {
            creatividad.dispose();
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
         // Llama al método para obtener y mostrar el nombre de usuario
        obtenerNombreUsuario();

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
        btnGraficaMarcas = new javax.swing.JButton();
        btnGestionarEquipo = new javax.swing.JButton();
        btnGraficaEstatus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnCerrarPanel = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizarPanel = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblNombreUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CreatividadPanel = new clases.PanelRound();
        btnCreatividad = new javax.swing.JLabel();
        panelRound4 = new clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        lblAnotaciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGraficaMarcas.setBackground(new java.awt.Color(255, 255, 255));
        btnGraficaMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Torta.png"))); // NOI18N
        btnGraficaMarcas.setToolTipText("Grafico de las diferentes marcas");
        btnGraficaMarcas.setBorder(null);
        btnGraficaMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGraficaMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaMarcasActionPerformed(evt);
            }
        });
        jPanel1.add(btnGraficaMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 130, 100));

        btnGestionarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApoyoTecnico.png"))); // NOI18N
        btnGestionarEquipo.setToolTipText("Ver equipos registrados");
        btnGestionarEquipo.setBorder(null);
        btnGestionarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 100));

        btnGraficaEstatus.setBackground(new java.awt.Color(255, 255, 255));
        btnGraficaEstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Estadisitica.png"))); // NOI18N
        btnGraficaEstatus.setToolTipText("Ver grafico de estados de equipos");
        btnGraficaEstatus.setBorder(null);
        btnGraficaEstatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGraficaEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaEstatusActionPerformed(evt);
            }
        });
        jPanel1.add(btnGraficaEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, 100));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Gestión de equipo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Gráfica de estatus");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Gráfica de marcas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

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

        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("jLabel2");
        jPanel2.add(lblTitle);
        lblTitle.setBounds(60, 0, 170, 40);

        btnCerrarPanel.setBackground(new java.awt.Color(0, 208, 163));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruzar.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCerrarPanelLayout = new javax.swing.GroupLayout(btnCerrarPanel);
        btnCerrarPanel.setLayout(btnCerrarPanelLayout);
        btnCerrarPanelLayout.setHorizontalGroup(
            btnCerrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCerrarPanelLayout.setVerticalGroup(
            btnCerrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnCerrarPanel);
        btnCerrarPanel.setBounds(530, 0, 40, 40);

        btnMinimizarPanel.setBackground(new java.awt.Color(0, 208, 163));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(0, 0, 0));
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar-signo.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMinimizarPanelLayout = new javax.swing.GroupLayout(btnMinimizarPanel);
        btnMinimizarPanel.setLayout(btnMinimizarPanelLayout);
        btnMinimizarPanelLayout.setHorizontalGroup(
            btnMinimizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMinimizarPanelLayout.createSequentialGroup()
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnMinimizarPanelLayout.setVerticalGroup(
            btnMinimizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMinimizarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnMinimizarPanel);
        btnMinimizarPanel.setBounds(490, 0, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 520, 10));

        lblNombreUsuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreUsuario.setText("jLabel1");
        jPanel1.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 150, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Avatar.png"))); // NOI18N
        jLabel1.setToolTipText("Cambiar perfil");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 40, 40));

        CreatividadPanel.setBackground(new java.awt.Color(0, 208, 163));
        CreatividadPanel.setRoundBottomLeft(100);
        CreatividadPanel.setRoundBottomRight(100);
        CreatividadPanel.setRoundTopLeft(100);
        CreatividadPanel.setRoundTopRight(100);

        btnCreatividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCreatividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ocurrencia.png"))); // NOI18N
        btnCreatividad.setToolTipText("Agregar una nota");
        btnCreatividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreatividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreatividadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreatividadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreatividadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CreatividadPanelLayout = new javax.swing.GroupLayout(CreatividadPanel);
        CreatividadPanel.setLayout(CreatividadPanelLayout);
        CreatividadPanelLayout.setHorizontalGroup(
            CreatividadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreatividadPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreatividad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CreatividadPanelLayout.setVerticalGroup(
            CreatividadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreatividadPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreatividad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(CreatividadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 30, 30));

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

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 90, 20));

        lblAnotaciones.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAnotaciones.setForeground(new java.awt.Color(0, 51, 153));
        lblAnotaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAnotaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campanita.png"))); // NOI18N
        lblAnotaciones.setToolTipText("");
        lblAnotaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblAnotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 40));

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

    private void btnGraficaMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaMarcasActionPerformed
        GraficarMarcas gm = new GraficarMarcas();
        gm.setVisible(true);
    }//GEN-LAST:event_btnGraficaMarcasActionPerformed

    private void btnGestionarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarEquipoActionPerformed
        GestionarEquipos gestionarequipos = new GestionarEquipos();
        gestionarequipos.setVisible(true);
    }//GEN-LAST:event_btnGestionarEquipoActionPerformed

    private void btnGraficaEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaEstatusActionPerformed
        GraficarEstatus graficaestatus = new GraficarEstatus();
        graficaestatus.setVisible(true);
    }//GEN-LAST:event_btnGraficaEstatusActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        //obtenerNombreUsuario();
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrarPanel.setBackground(Color.red);
        btnCerrar.setForeground(Color.white);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrarPanel.setBackground(new Color(0,208,163));
        btnCerrar.setForeground(Color.black);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizarPanel.setBackground(new Color(0,124,120));
        btnMinimizar.setForeground(Color.white);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizarPanel.setBackground(new Color(0, 208,163));
        btnMinimizar.setForeground(Color.black);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnCreatividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatividadMouseClicked
        Creatividad creativity = new Creatividad();
        creativity.setVisible(true);
    }//GEN-LAST:event_btnCreatividadMouseClicked

    private void btnCreatividadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatividadMouseEntered
        CreatividadPanel.setBackground(new Color(0, 228, 223));
        btnCreatividad.setForeground(Color.white);
    }//GEN-LAST:event_btnCreatividadMouseEntered

    private void btnCreatividadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatividadMouseExited
        CreatividadPanel.setBackground(new Color(0, 228, 163));
        btnCreatividad.setForeground(new Color(0, 51, 102));
    }//GEN-LAST:event_btnCreatividadMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea cambiar de sesión?", "Confirmación", JOptionPane.YES_NO_OPTION);
    if (opcion == JOptionPane.YES_OPTION) {
        // Establece la variable sesion_usuario en 0 antes de cambiar la ventana
        sesion_usuario = 0;

        // Abre la ventana de inicio de sesión y cierra la actual
        Login lgn = new Login();
        lgn.setVisible(true);
        this.dispose();

        // Imprime el valor de sesion_usuario en la consola para verificar el cambio
        System.out.println("sesion_usuario después de cerrar sesión: " + sesion_usuario);
    }
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clases.PanelRound CreatividadPanel;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JPanel btnCerrarPanel;
    private javax.swing.JLabel btnCreatividad;
    private javax.swing.JButton btnGestionarEquipo;
    private javax.swing.JButton btnGraficaEstatus;
    private javax.swing.JButton btnGraficaMarcas;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JPanel btnMinimizarPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAnotaciones;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblTitle;
    private clases.PanelRound panelRound4;
    // End of variables declaration//GEN-END:variables
    private void obtenerNombreUsuario() {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = ?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombre_usuario = rs.getString("nombre_usuario");
                lblNombreUsuario.setText("Bienvenido " + nombre_usuario);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en consultar nombre de técnico: " + e.getMessage());
        }
    }
}
