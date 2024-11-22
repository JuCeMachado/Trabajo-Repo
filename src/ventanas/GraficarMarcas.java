package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class GraficarMarcas extends javax.swing.JFrame {

    String user;
    int[] vector_marcas_cantidad = new int[11];
    String[] vector_marcas_nombre = new String[11];
    int hp, lenovo, dell, acer, apple, toshiba, brother, samsung, asus, alienware, xerox;

    public GraficarMarcas() {
        initComponents();
        user = Login.user;

        setSize(585, 455);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Técnico - Sesión de " + user);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select marca, count(marca) as Marcas from equipos group by marca");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int posicion = 0;

                do {
                    vector_marcas_nombre[posicion] = rs.getString(1);
                    vector_marcas_cantidad[posicion] = rs.getInt(2);

                    if (vector_marcas_nombre[posicion].equalsIgnoreCase("Acer")) {
                        acer = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Alienware")) {
                        alienware = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Apple")) {
                        apple = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Asus")) {
                        asus = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Brother")) {
                        brother = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Dell")) {
                        dell = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("HP")) {
                        hp = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Lenovo")) {
                        lenovo = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Samsung")) {
                        samsung = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Toshiba")) {
                        toshiba = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Xerox")) {
                        xerox = vector_marcas_cantidad[posicion];
                    }
                    posicion++;
                } while (rs.next());
            }

        } catch (SQLException e) {
            System.err.println("Error en la consulta " + e);
            JOptionPane.showMessageDialog(null, "Error en consultar datos. Contacte al administrador.");
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
        jLabel1.setText("Gráfica de marcas");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 0, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HexagonoVioleta.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 24, 24);

        panel_Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        panelRound1.setBackground(new java.awt.Color(102, 102, 102));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundTopLeft(25);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        panel_Background.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 330));

        panelRound2.setBackground(new java.awt.Color(120, 120, 120));
        panelRound2.setRoundBottomRight(25);
        panelRound2.setRoundTopRight(25);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        panel_Background.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 260, 330));

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

        panel_Background.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 90, 20));

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
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarMarcas().setVisible(true);
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
@Override
    public void paint(Graphics g) {
        super.paint(g);
        int total_marcas = hp + lenovo + dell + acer + apple + toshiba + brother + samsung + asus + alienware + xerox;

        if (total_marcas == 0) {
            return; // Evitar división por cero
        }

        // Cálculo de los grados correspondientes a cada marca
        int grados_acer = acer * 360 / total_marcas;
        int grados_alienware = alienware * 360 / total_marcas;
        int grados_apple = apple * 360 / total_marcas;
        int grados_asus = asus * 360 / total_marcas;
        int grados_brother = brother * 360 / total_marcas;
        int grados_dell = dell * 360 / total_marcas;
        int grados_hp = hp * 360 / total_marcas;
        int grados_lenovo = lenovo * 360 / total_marcas;
        int grados_samsung = samsung * 360 / total_marcas;
        int grados_toshiba = toshiba * 360 / total_marcas;
        int grados_xerox = xerox * 360 / total_marcas;

        int inicio_angulo = 0;
        //linea vertical negra
        g.setColor(Color.BLACK);
        g.drawLine(306, 81, 306, 410);
        // Dibujo del gráfico para cada marca

        // Marca Acer
        g.setColor(new Color(175, 122, 197)); // Morado
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_acer);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_acer);
        g.setColor(new Color(175, 122, 197)); // El rect del mismo color
        g.fillRect(330, 120, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(acer + " de Acer", 360, 135);
        inicio_angulo += grados_acer;

        // Marca Alienware
        g.setColor(new Color(0, 255, 0)); // Verde
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_alienware);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_alienware);
        g.setColor(new Color(0, 255, 0)); // El rect del mismo color
        g.fillRect(330, 150, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(alienware + " de Alienware", 360, 165);
        inicio_angulo += grados_alienware;

        // Marca Apple
        g.setColor(new Color(0, 255, 255)); // Verde Agua
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_apple);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_apple);
        g.setColor(new Color(0, 255, 255)); // El rect del mismo color
        g.fillRect(330, 180, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(apple + " de Apple", 360, 195);
        inicio_angulo += grados_apple;

        // Marca Asus
        g.setColor(new Color(55, 0, 255)); // Azul
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_asus);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_asus);
        g.setColor(new Color(55, 0, 255)); // El rect del mismo color
        g.fillRect(330, 210, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(asus + " de Asus", 360, 225);
        inicio_angulo += grados_asus;

        // Marca Brother
        g.setColor(new Color(0, 0, 0)); // Negro
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_brother);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_brother);
        g.setColor(new Color(0, 0, 0)); // El rect del mismo color
        g.fillRect(330, 240, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(brother + " de Brother", 360, 255);
        inicio_angulo += grados_brother;

        // Marca Dell
        g.setColor(new Color(247, 220, 110)); // Amarillo
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_dell);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_dell);
        g.setColor(new Color(247, 220, 110)); // El rect del mismo color
        g.fillRect(330, 270, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(dell + " de Dell", 360, 285);
        inicio_angulo += grados_dell;

        // Marca HP
        g.setColor(new Color(21, 42, 160)); // Azul Marino
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_hp);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_hp);
        g.setColor(new Color(21, 42, 160)); // El rect del mismo color
        g.fillRect(330, 300, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(hp + " de HP", 360, 315);
        inicio_angulo += grados_hp;

        // Marca Lenovo
        g.setColor(new Color(215, 96, 0)); // Naranja
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_lenovo);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_lenovo);
        g.setColor(new Color(215, 96, 0)); // El rect del mismo color
        g.fillRect(330, 330, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(lenovo + " de Lenovo", 360, 345);
        inicio_angulo += grados_lenovo;

        // Marca Samsung
        g.setColor(new Color(215, 96, 140)); // Rosa
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_samsung);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_samsung);
        g.setColor(new Color(215, 96, 140)); // El rect del mismo color
        g.fillRect(450, 120, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(samsung + " de Samsung", 480, 135);
        inicio_angulo += grados_samsung;

        // Marca Toshiba
        g.setColor(new Color(215, 196, 25)); // Amarillo Canario
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_toshiba);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_toshiba);
        g.setColor(new Color(215, 196, 25)); // El rect del mismo color
        g.fillRect(450, 150, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(toshiba + " de Toshiba", 480, 165);
        inicio_angulo += grados_toshiba;

        // Marca Xerox
        g.setColor(new Color(93, 173, 226)); // Azul Celeste
        g.fillArc(25, 100, 270, 270, inicio_angulo, grados_xerox);
        g.setColor(Color.BLACK);
        g.drawArc(25, 100, 270, 270, inicio_angulo, grados_xerox);
        g.setColor(new Color(93, 173, 226)); // El rect del mismo color
        g.fillRect(450, 180, 20, 20);
        g.setColor(Color.BLACK); // Letra negra
        g.drawString(xerox + " de Xerox", 480, 195);

        // Texto final
        g.setColor(Color.BLACK);
        g.drawString("Marcas más reparadas", 105, 400); // Añadir título al gráfico

    }

//   @Override
//public void paint(Graphics g) {
//    super.paint(g);
//    int total_marcas = hp + lenovo + dell + acer + apple + toshiba + brother + samsung + asus + alienware + xerox;
//
//    int grados_acer = acer * 360 / total_marcas;
//    int grados_alienware = alienware * 360 / total_marcas;
//    int grados_apple = apple * 360 / total_marcas;
//    int grados_asus = asus * 360 / total_marcas;
//    int grados_brother = brother * 360 / total_marcas;
//    int grados_dell = dell * 360 / total_marcas;
//    int grados_hp = hp * 360 / total_marcas;
//    int grados_lenovo = lenovo * 360 / total_marcas;
//    int grados_samsung = samsung * 360 / total_marcas;
//    int grados_toshiba = toshiba * 360 / total_marcas;
//    int grados_xerox = xerox * 360 / total_marcas;
//
//    int inicio_angulo = 0;
//
//    // marca acer 
//    g.setColor(new Color(175, 122, 197)); // morado
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_acer);
//    g.fillRect(310, 120, 20, 20);
//    g.drawString(acer + " de Acer", 340, 135);
//
//    // marca alienware
//    inicio_angulo += grados_acer;
//    g.setColor(new Color(0, 255, 0)); // verde
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_alienware);
//    g.fillRect(310, 150, 20, 20);
//    g.drawString(alienware + " de Alienware", 340, 165);
//
//    // marca apple
//    inicio_angulo += grados_alienware;
//    g.setColor(new Color(0, 255, 255)); // verde agua
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_apple);
//    g.fillRect(310, 180, 20, 20);
//    g.drawString(apple + " de Apple", 340, 195);
//
//    // marca asus
//    inicio_angulo += grados_apple;
//    g.setColor(new Color(55, 0, 255)); // azul
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_asus);
//    g.fillRect(310, 210, 20, 20);
//    g.drawString(asus + " de Asus", 340, 225);
//
//    // marca brother
//    inicio_angulo += grados_asus;
//    g.setColor(new Color(0, 0, 0)); // negro
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_brother);
//    g.fillRect(310, 240, 20, 20);
//    g.drawString(brother + " de Brother", 340, 255);
//
//    // marca dell
//    inicio_angulo += grados_brother;
//    g.setColor(new Color(247, 220, 110)); // amarillo
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_dell);
//    g.fillRect(310, 270, 20, 20);
//    g.drawString(dell + " de Dell", 340, 285);
//
//    // marca hp
//    inicio_angulo += grados_dell;
//    g.setColor(new Color(21, 42, 160)); // azul marino
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_hp);
//    g.fillRect(310, 300, 20, 20);
//    g.drawString(hp + " de HP", 340, 315);
//
//    // marca lenovo
//    inicio_angulo += grados_hp;
//    g.setColor(new Color(215, 96, 0)); // naranja
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_lenovo);
//    g.fillRect(310, 330, 20, 20);
//    g.drawString(lenovo + " de Lenovo", 340, 345);
//
//    // marca samsung
//    inicio_angulo += grados_lenovo;
//    g.setColor(new Color(215, 96, 140)); // rosa
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_samsung);
//    g.fillRect(430, 120, 20, 20);
//    g.drawString(samsung + " de Samsung", 460, 135);
//
//    // marca toshiba
//    inicio_angulo += grados_samsung;
//    g.setColor(new Color(215, 196, 25)); // amarillo canario
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_toshiba);
//    g.fillRect(430, 150, 20, 20);
//    g.drawString(toshiba + " de Toshiba", 460, 165);
//
//    // marca xerox
//    inicio_angulo += grados_toshiba;
//    g.setColor(new Color(93, 173, 226)); // azul celeste
//    g.fillArc(25, 100, 270, 270, inicio_angulo, grados_xerox);
//    g.fillRect(430, 180, 20, 20);
//    g.drawString(xerox + " de Xerox", 460, 195);
//}
}
