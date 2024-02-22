package vista;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        centerWindow();
        setTitle("Citas Médicas"); // Establecer el título de la ventana
    }

    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 300); // Aumentar el tamaño de la ventana a 500x300 píxeles
        setResizable(true);

        jMenu1.setText("Menú");

        jMenuItem1.setText("Añadir");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Editar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Listar");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Consultar");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Acerca de:");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        jLabel1.setText("");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setText("Desarrollado por: Carlos Bernal, Luis Alejandro Sanmiguel, Mario Orozco");
    }

    private void centerWindow() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y); // Establecer la ubicación para que la ventana aparezca centrada
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}


