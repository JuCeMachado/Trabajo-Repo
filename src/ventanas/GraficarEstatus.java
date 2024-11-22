package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class GraficarEstatus extends javax.swing.JFrame {

    String user;
    int NuevoIngreso, NoReparado, EnRevision, Reparado, Entregado;

    String[] vector_estatus_nombre = new String[5];
    int[] vector_estatus_cantidad = new int[5];

    public GraficarEstatus() {
        initComponents();
        user = Login.user;

        setSize(560, 440);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Técnico - Sesión de " + user);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select estatus, count(estatus) as Cantidad from  equipos group by estatus");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int posicion = 0;
                do {
                    vector_estatus_nombre[posicion] = rs.getString(1);
                    vector_estatus_cantidad[posicion] = rs.getInt(2);

                    if (vector_estatus_nombre[posicion].equalsIgnoreCase("En revision")) {
                        EnRevision = vector_estatus_cantidad[posicion];
                    } else if (vector_estatus_nombre[posicion].equalsIgnoreCase("Entregado")) {
                        Entregado = vector_estatus_cantidad[posicion];
                    } else if (vector_estatus_nombre[posicion].equalsIgnoreCase("No reparado")) {
                        NoReparado = vector_estatus_cantidad[posicion];
                    } else if (vector_estatus_nombre[posicion].equalsIgnoreCase("Nuevo Ingreso")) {
                        NuevoIngreso = vector_estatus_cantidad[posicion];
                    } else if (vector_estatus_nombre[posicion].equalsIgnoreCase("Reparado")) {
                        Reparado = vector_estatus_cantidad[posicion];
                    }
                } while (rs.next());
            }

        } catch (SQLException e) {
            System.err.println("Error en conectar con la base de datos." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error!!, contacte al administrador.");
        }

        repaint();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/sistema.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new clases.PanelRound();
        panelRound2 = new clases.PanelRound();
        panelRound4 = new clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        panel_Background.setBackground(new java.awt.Color(255, 255, 255));
        panel_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gráfica de estatus");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 0, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        panel_Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        panelRound1.setBackground(new java.awt.Color(153, 153, 153));
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopRight(25);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        panel_Background.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 420, 300));

        panelRound2.setBackground(new java.awt.Color(102, 102, 102));
        panelRound2.setRoundBottomLeft(25);
        panelRound2.setRoundTopLeft(25);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        panel_Background.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 300));

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

        panel_Background.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarEstatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private clases.PanelRound panelRound1;
    private clases.PanelRound panelRound2;
    private clases.PanelRound panelRound4;
    private javax.swing.JPanel panel_Background;
    // End of variables declaration//GEN-END:variables

    public int EstatusMasRepetido(int NuevoIngreso, int NoReparado, int EnRevision, int Reparado, int Entregado) {
        if (NuevoIngreso > NoReparado && NuevoIngreso > EnRevision && NuevoIngreso > Reparado && NuevoIngreso > Entregado) {
            return NuevoIngreso;
        } else if (NoReparado > EnRevision && NoReparado > Reparado && NoReparado > Entregado) {
            return NoReparado;
        } else if (EnRevision > Reparado && EnRevision > Entregado) {
            return EnRevision;
        } else if (Reparado > Entregado) {
            return Reparado;
        } else {
            return Reparado;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int Estatus_Mas_Repetido = EstatusMasRepetido(NuevoIngreso, NoReparado, EnRevision, Reparado, Entregado);

        int largo_NuevoIngreso = NuevoIngreso * 400 / Estatus_Mas_Repetido;
        int largo_NoReparado = NoReparado * 400 / Estatus_Mas_Repetido;
        int largo_EnRevision = EnRevision * 400 / Estatus_Mas_Repetido;
        int largo_Reparado = Reparado * 400 / Estatus_Mas_Repetido;
        int largo_Entregado = Entregado * 400 / Estatus_Mas_Repetido;

        g.setColor(new Color(255, 0, 255));//celeste
        g.fillRect(130, 100, largo_NuevoIngreso, 40);
        g.setColor(new Color(204, 204, 204));
        g.setFont(new Font("Roboto", Font.BOLD, 12));
        g.drawString("Nuevo Ingreso ", 35, 118);
        g.drawString("Cantidad " + NuevoIngreso, 35, 133);
        //Lineas del grafico de barras
        g.setColor(Color.BLACK);
        g.drawLine(125, 100, 125, 355);
        g.setColor(Color.BLACK);
        g.drawLine(120, 350, 520, 350);

        g.setColor(new Color(255, 0, 0));//rojo
        g.fillRect(130, 150, largo_NoReparado, 40);
        g.setColor(new Color(204, 204, 204));
        g.setFont(new Font("Roboto", Font.BOLD, 12));
        g.drawString("No Reparado ", 35, 168);
        g.drawString("Cantidad " + NoReparado, 35, 183);
        
        

        g.setColor(new Color(0, 0, 0));//negro 
        g.fillRect(130, 200, largo_EnRevision, 40);
        g.setColor(new Color(204, 204, 204));
        g.setFont(new Font("Roboto", Font.BOLD, 12));
        g.drawString("En Revisión ", 35, 218);
        g.drawString("Cantidad " + EnRevision, 35, 233);
        

        g.setColor(new Color(0, 0, 255));//azul
        g.fillRect(130, 250, largo_Reparado, 40);
        g.setColor(new Color(204, 204, 204));
        g.setFont(new Font("Roboto", Font.BOLD, 12));
        g.drawString("Reparado ", 35, 268);
        g.drawString("Cantidad " + Reparado, 35, 283);

        g.setColor(new Color(0, 100, 0));//verde
        g.fillRect(130, 300, largo_Entregado, 40);
        g.setColor(new Color(204, 204, 204));
        g.setFont(new Font("Roboto", Font.BOLD, 12));
        g.drawString("Entregado ", 35, 318);
        g.drawString("Cantidad " + Entregado, 35, 333);

    }
}
