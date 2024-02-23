package vista;

public class GUIinicial extends javax.swing.JFrame{

    public GUIinicial() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuAcerca = new javax.swing.JMenu();
        jMenuAnadir = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenuItem();
        jMenuDelete = new javax.swing.JMenuItem();
        jMenuList = new javax.swing.JMenuItem();
        jMenuCons = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 254, Short.MAX_VALUE)
        );

        jMenuAcerca.setText("Menú");

        jMenuAnadir.setText("Añadir");
        jMenuAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnadirActionPerformed(evt);
            }
        });
        jMenuAcerca.add(jMenuAnadir);

        jMenuEdit.setText("Editar");
        jMenuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditActionPerformed(evt);
            }
        });
        jMenuAcerca.add(jMenuEdit);

        jMenuDelete.setText("Eliminar");
        jMenuAcerca.add(jMenuDelete);

        jMenuList.setText("Listar");
        jMenuAcerca.add(jMenuList);

        jMenuCons.setText("Consultar");
        jMenuAcerca.add(jMenuCons);

        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAcerca.add(jMenuItem1);

        jMenuBar2.add(jMenuAcerca);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jMenuEditActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuAnadirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        GUI gui = new GUI();
        // Hacer visible la segunda interfaz
        gui.setVisible(true);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        jMenuAcerca.setText("Desarrollado por: Carlos Bernal, Luis Alejandro Sanmiguel, Mario Orozco");
    }

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
            java.util.logging.Logger.getLogger(GUIinicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIinicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIinicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIinicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIinicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenu jMenuAcerca;
    private javax.swing.JMenuItem jMenuAnadir;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuCons;
    private javax.swing.JMenuItem jMenuDelete;
    private javax.swing.JMenuItem jMenuEdit;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
}
