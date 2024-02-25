/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import vista.*;
import javax.swing.JFrame;

/**
 *
 * @author alejandrosanmiguel
 */
public class vistaIngreso extends javax.swing.JFrame {

    /**
     * Creates new form vistaIngreso
     */
    public vistaIngreso() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalVistaIngreso = new javax.swing.JPanel();
        panelCuerpo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroIdentificacion = new javax.swing.JTextArea();
        textNombre = new javax.swing.JTextArea();
        txtFecha = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        boxTipoCita = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnAcercaDe = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelCabeza = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnListaPacientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipalVistaIngreso.setBackground(new java.awt.Color(255, 255, 255));

        panelCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        panelCuerpo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        panelCuerpo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Numero de Identificación: ");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Fecha: ");

        txtNumeroIdentificacion.setColumns(20);
        txtNumeroIdentificacion.setRows(5);

        textNombre.setColumns(20);
        textNombre.setRows(5);

        txtFecha.setColumns(20);
        txtFecha.setRows(5);

        jLabel5.setText("Tipo de cita:");

        boxTipoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico General", "Medico Especialista", "Odontologia" }));
        boxTipoCita.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTipoCitaItemStateChanged(evt);
            }
        });
        boxTipoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoCitaActionPerformed(evt);
            }
        });

        jLabel6.setText("Motivo: ");

        txtMotivo.setColumns(20);
        txtMotivo.setRows(5);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnAcercaDe.setText("Acerca de");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                            .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(71, 71, 71)
                            .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(txtNumeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(boxTipoCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(boxTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnHistorial)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnAcercaDe)
                .addGap(14, 14, 14))
        );

        panelCabeza.setBackground(new java.awt.Color(248, 245, 230));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/iconHospital.jpeg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hospital de Ibagué");

        javax.swing.GroupLayout panelCabezaLayout = new javax.swing.GroupLayout(panelCabeza);
        panelCabeza.setLayout(panelCabezaLayout);
        panelCabezaLayout.setHorizontalGroup(
            panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezaLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabezaLayout.setVerticalGroup(
            panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabezaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apartado Clinico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnListaPacientes.setText("Lista de pacientes");
        btnListaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPacientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnListaPacientes)
                    .addComponent(btnEliminar))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout panelPrincipalVistaIngresoLayout = new javax.swing.GroupLayout(panelPrincipalVistaIngreso);
        panelPrincipalVistaIngreso.setLayout(panelPrincipalVistaIngresoLayout);
        panelPrincipalVistaIngresoLayout.setHorizontalGroup(
            panelPrincipalVistaIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalVistaIngresoLayout.setVerticalGroup(
            panelPrincipalVistaIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalVistaIngresoLayout.createSequentialGroup()
                .addComponent(panelCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalVistaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalVistaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        vistaHistorialPaciente vistaHistorialPaciente = new vistaHistorialPaciente();
        vistaHistorialPaciente.setVisible(true);
      

    }//GEN-LAST:event_btnHistorialActionPerformed

    private void boxTipoCitaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTipoCitaItemStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_boxTipoCitaItemStateChanged

    private void boxTipoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoCitaActionPerformed

    private void btnListaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPacientesActionPerformed
        vistaListaPacientes vistaListaPacientes = new vistaListaPacientes();
        vistaListaPacientes.setVisible(true);
    }//GEN-LAST:event_btnListaPacientesActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        vistaModificar vistaModificar = new vistaModificar();
        vistaModificar.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed

        vistaAcercaDe vistaAcerca = new vistaAcercaDe();
        vistaAcerca.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        vistaEliminar vistaEliminar = new vistaEliminar();
        vistaEliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(vistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoCita;
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnListaPacientes;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelCabeza;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelPrincipalVistaIngreso;
    private javax.swing.JTextArea textNombre;
    private javax.swing.JTextArea txtFecha;
    private javax.swing.JTextArea txtMotivo;
    private javax.swing.JTextArea txtNumeroIdentificacion;
    // End of variables declaration//GEN-END:variables
}
