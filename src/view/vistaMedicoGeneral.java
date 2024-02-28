/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.*;

/**
 *
 * @author C.M Bernal Cuellar
 */
public class vistaMedicoGeneral extends JFrame {

    /**
     * Creates new form vistaMedicoGeneral
     */
    public vistaMedicoGeneral() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalVistaMedicoGeneral = new JPanel();
        panelCabeza3 = new JPanel();
        logo3 = new JLabel();
        jLabel4 = new JLabel();
        panelCuerpo = new JPanel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        txtGeneralista = new JTextArea();
        txtObservacion = new JTextArea();
        btnGuardar = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelCabeza3.setBackground(new java.awt.Color(248, 245, 230));

        logo3.setIcon(new ImageIcon(getClass().getResource("/view/img/iconDoctor.jpg"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel4.setText("Cita Médico general");

        GroupLayout panelCabeza3Layout = new GroupLayout(panelCabeza3);
        panelCabeza3.setLayout(panelCabeza3Layout);
        panelCabeza3Layout.setHorizontalGroup(
            panelCabeza3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeza3Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(logo3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(81, 81, 81))
        );
        panelCabeza3Layout.setVerticalGroup(
            panelCabeza3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeza3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, panelCabeza3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
        );

        panelCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        panelCuerpo.setBorder(BorderFactory.createTitledBorder(null, "Datos del paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 18))); // NOI18N

        jLabel5.setText("GeneralistaAsignado:");

        jLabel6.setText("Observación:");

        txtGeneralista.setColumns(20);
        txtGeneralista.setRows(5);

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);

        btnGuardar.setText("Guardar");

        GroupLayout panelCuerpoLayout = new GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtGeneralista, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservacion, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, panelCuerpoLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(52, 52, 52))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addComponent(txtGeneralista, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacion, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(btnGuardar))
        );

        GroupLayout panelPrincipalVistaMedicoGeneralLayout = new GroupLayout(panelPrincipalVistaMedicoGeneral);
        panelPrincipalVistaMedicoGeneral.setLayout(panelPrincipalVistaMedicoGeneralLayout);
        panelPrincipalVistaMedicoGeneralLayout.setHorizontalGroup(
            panelPrincipalVistaMedicoGeneralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCabeza3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalVistaMedicoGeneralLayout.setVerticalGroup(
            panelPrincipalVistaMedicoGeneralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalVistaMedicoGeneralLayout.createSequentialGroup()
                .addComponent(panelCabeza3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalVistaMedicoGeneral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalVistaMedicoGeneral, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaMedicoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMedicoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMedicoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMedicoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMedicoGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnGuardar;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel logo3;
    private JPanel panelCabeza3;
    private JPanel panelCuerpo;
    private JPanel panelPrincipalVistaMedicoGeneral;
    private JTextArea txtGeneralista;
    private JTextArea txtObservacion;
    // End of variables declaration//GEN-END:variables
}
