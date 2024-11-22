package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static ventanas.Administrador.sesion_usuario;
import ventanas.Creatividad;

public class Administrador extends javax.swing.JFrame {

    String user, nombre_usuario;
    public static int sesion_usuario;
    private boolean maximizada = false;

    public Administrador() {
        initComponents();
        Creatividad creatividad = new Creatividad();
        user = Login.user;
        sesion_usuario = 1;
        int nuevasNotas = Creatividad.ultimo_numero;
        setSize(790, 550);
        setResizable(false);
        lblTitle.setText("Administrador - Sesión de " + user);
        //setTitle("Administrador- Sesión de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        if (nuevasNotas != 0) {
            lblAnotaciones.setText("Anotaciones (" + nuevasNotas + ")");
        } else {
            lblAnotaciones.setText("Anotaciones");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = '" + user + "'");

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombre_usuario = rs.getString("nombre_usuario");
                lbl_NombreUsuario.setText("Bienvenido " + nombre_usuario);
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
        panelRound1 = new clases.PanelRound();
        panelRound2 = new clases.PanelRound();
        panelRound3 = new clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnGestionar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCreatividad = new javax.swing.JButton();
        lblAnotaciones = new javax.swing.JLabel();
        btnCapturista = new javax.swing.JButton();
        btnTecnico = new javax.swing.JButton();
        btnAcercaDe = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnMinimizarPanel = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        btnMaximizarPanel = new javax.swing.JPanel();
        btnMaximizar = new javax.swing.JLabel();
        btnCerrarPanel = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnCambiarSesion = new javax.swing.JLabel();
        lbl_NombreUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(538, 20));
        jPanel1.setLayout(new java.awt.BorderLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setPreferredSize(new java.awt.Dimension(350, 20));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound1, java.awt.BorderLayout.WEST);

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setPreferredSize(new java.awt.Dimension(350, 20));
        panelRound2.setRoundBottomLeft(25);
        panelRound2.setRoundBottomRight(25);
        panelRound2.setRoundTopLeft(25);
        panelRound2.setRoundTopRight(25);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound2, java.awt.BorderLayout.EAST);

        panelRound3.setBackground(new java.awt.Color(51, 51, 51));
        panelRound3.setPreferredSize(new java.awt.Dimension(50, 20));
        panelRound3.setRoundBottomLeft(25);
        panelRound3.setRoundBottomRight(25);
        panelRound3.setRoundTopLeft(25);
        panelRound3.setRoundTopRight(25);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("JuceCorp®");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(panelRound3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Agregar.png"))); // NOI18N
        btnAgregar.setToolTipText("Agregar nuevos usuarios");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Agregar Usuarios");

        btnGestionar.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Identificacion.png"))); // NOI18N
        btnGestionar.setToolTipText("Ver usuarios registrados");
        btnGestionar.setBorder(null);
        btnGestionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Gestionar Usuarios");

        btnCreatividad.setBackground(new java.awt.Color(255, 255, 255));
        btnCreatividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Solucion (2).png"))); // NOI18N
        btnCreatividad.setToolTipText("Haz tu primera nota del dia");
        btnCreatividad.setBorder(null);
        btnCreatividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreatividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatividadActionPerformed(evt);
            }
        });

        lblAnotaciones.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblAnotaciones.setForeground(new java.awt.Color(0, 51, 102));
        lblAnotaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAnotaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campanita.png"))); // NOI18N
        lblAnotaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnCapturista.setBackground(new java.awt.Color(255, 255, 255));
        btnCapturista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro.png"))); // NOI18N
        btnCapturista.setToolTipText("Registrar nuevos clientes");
        btnCapturista.setBorder(null);
        btnCapturista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturistaActionPerformed(evt);
            }
        });

        btnTecnico.setBackground(new java.awt.Color(255, 255, 255));
        btnTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mantenimiento.png"))); // NOI18N
        btnTecnico.setToolTipText("Ir a ventana técnico");
        btnTecnico.setBorder(null);
        btnTecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnicoActionPerformed(evt);
            }
        });

        btnAcercaDe.setBackground(new java.awt.Color(255, 255, 255));
        btnAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Acerca de.png"))); // NOI18N
        btnAcercaDe.setToolTipText("Acerca del software y desarrollador");
        btnAcercaDe.setBorder(null);
        btnAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Registro clientes");

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Técnico");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Acerca de");

        jSeparator3.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(0, 48, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(btnCapturista, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(93, 93, 93)
                            .addComponent(btnTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(91, 91, 91)
                            .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel6)
                            .addGap(181, 181, 181)
                            .addComponent(jLabel8)
                            .addGap(209, 209, 209)
                            .addComponent(jLabel2))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(92, 92, 92)
                                    .addComponent(btnGestionar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel3)
                                    .addGap(145, 145, 145)
                                    .addComponent(jLabel4)))
                            .addGap(88, 88, 88)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblAnotaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreatividad, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                    .addGap(0, 48, Short.MAX_VALUE)))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGestionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCreatividad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAnotaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(39, 39, 39)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCapturista, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2))))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel13, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(0, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(40, 80));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(0, 208, 163));
        jPanel9.setPreferredSize(new java.awt.Dimension(790, 40));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(0, 208, 163));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hexagonal.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hexagonal (1).png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel9))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel9.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel10.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        btnMinimizarPanel.setBackground(new java.awt.Color(0, 208, 163));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(0, 0, 0));
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar-signo.png"))); // NOI18N
        btnMinimizar.setToolTipText("Minimizar");
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

        jPanel10.add(btnMinimizarPanel);

        btnMaximizarPanel.setBackground(new java.awt.Color(0, 208, 163));

        btnMaximizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMaximizar.setForeground(new java.awt.Color(0, 0, 0));
        btnMaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ventana.png"))); // NOI18N
        btnMaximizar.setToolTipText("Maximizar");
        btnMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaximizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaximizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMaximizarPanelLayout = new javax.swing.GroupLayout(btnMaximizarPanel);
        btnMaximizarPanel.setLayout(btnMaximizarPanelLayout);
        btnMaximizarPanelLayout.setHorizontalGroup(
            btnMaximizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaximizarPanelLayout.createSequentialGroup()
                .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnMaximizarPanelLayout.setVerticalGroup(
            btnMaximizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMaximizarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.add(btnMaximizarPanel);

        btnCerrarPanel.setBackground(new java.awt.Color(0, 208, 163));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruzar.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
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

        jPanel10.add(btnCerrarPanel);

        jPanel9.add(jPanel10, java.awt.BorderLayout.LINE_END);

        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("jLabel2");
        jPanel9.add(lblTitle, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(790, 40));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        btnCambiarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCambiarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Avatar.png"))); // NOI18N
        btnCambiarSesion.setToolTipText("Cambiar perfil");
        btnCambiarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarSesion.setPreferredSize(new java.awt.Dimension(20, 24));
        btnCambiarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarSesionMouseClicked(evt);
            }
        });
        jPanel11.add(btnCambiarSesion);

        jPanel4.add(jPanel11, java.awt.BorderLayout.LINE_END);

        lbl_NombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbl_NombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_NombreUsuario.setText("lbl1");
        lbl_NombreUsuario.setPreferredSize(new java.awt.Dimension(50, 160));
        jPanel4.add(lbl_NombreUsuario, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel8, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizarPanel.setBackground(new Color(0, 124, 120));
        btnMinimizar.setForeground(Color.white);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizarPanel.setBackground(new Color(0, 208, 163));
        btnMinimizar.setForeground(Color.black);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseClicked
        if (maximizada) {
            setSize(790, 516);
            setLocationRelativeTo(null);
            maximizada = false;
        } else {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            maximizada = true;
        }
        revalidate(); // Revalidar el JFrame
        repaint(); // Repaint del JFrame
    }//GEN-LAST:event_btnMaximizarMouseClicked

    private void btnMaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseEntered
        btnMaximizarPanel.setBackground(new Color(0, 124, 120));
        btnMinimizar.setForeground(Color.white);
    }//GEN-LAST:event_btnMaximizarMouseEntered

    private void btnMaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseExited
        btnMaximizarPanel.setBackground(new Color(0, 208, 163));
        btnMinimizar.setForeground(Color.black);
    }//GEN-LAST:event_btnMaximizarMouseExited

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrarPanel.setBackground(Color.red);
        btnCerrar.setForeground(Color.white);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrarPanel.setBackground(new Color(0, 208, 163));
        btnCerrar.setForeground(Color.black);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        RegistarUsuarios registrar = new RegistarUsuarios();
        registrar.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        GestionarUsuarios gestionar = new GestionarUsuarios();
        gestionar.setVisible(true);
    }//GEN-LAST:event_btnGestionarActionPerformed

    private void btnCapturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturistaActionPerformed
        Capturista cp = new Capturista();
        cp.setVisible(true);
    }//GEN-LAST:event_btnCapturistaActionPerformed

    private void btnTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnicoActionPerformed
        Tecnico tecnico = new Tecnico();
        tecnico.setVisible(true);
    }//GEN-LAST:event_btnTecnicoActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        AcercaDe acercade = new AcercaDe();
        acercade.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    private void btnCambiarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarSesionMouseClicked
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
    }//GEN-LAST:event_btnCambiarSesionMouseClicked

    private void btnCreatividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatividadActionPerformed
        Creatividad creatividad = new Creatividad();
        creatividad.setVisible(true);
    }//GEN-LAST:event_btnCreatividadActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel btnCambiarSesion;
    private javax.swing.JButton btnCapturista;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JPanel btnCerrarPanel;
    private javax.swing.JButton btnCreatividad;
    private javax.swing.JButton btnGestionar;
    private javax.swing.JLabel btnMaximizar;
    private javax.swing.JPanel btnMaximizarPanel;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JPanel btnMinimizarPanel;
    private javax.swing.JButton btnTecnico;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAnotaciones;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbl_NombreUsuario;
    private clases.PanelRound panelRound1;
    private clases.PanelRound panelRound2;
    private clases.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables

}
