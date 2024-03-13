/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.toedter.calendar.JDateChooser;
import controller.ControladorConsultorios;
import model.CitaEspecialista;
import model.CitaGeneral;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.ControladorCitas;
import model.CitaMedica;
import model.ConsultorioEspecializado;

/**
 * @author alejandrosanmiguel
 */
public class vistaIngreso extends JFrame {

    private ControladorCitas controlador;
    private vistaListaPacientes listaPacientesFrame;
    private  CitaMedica citaMedica;
    private ControladorConsultorios controladorConsultorio;
    /**
     * Creates new form vistaIngreso
     */
    public vistaIngreso() {

        controlador = new ControladorCitas();
        citaMedica = new CitaGeneral();
        controladorConsultorio = new ControladorConsultorios();
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
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
        panelCabeza = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnListaPacientes = new javax.swing.JButton();
        btnCostoTotal = new javax.swing.JButton();
        btnAcercaDe = new javax.swing.JButton();
        btnCitaGeneral = new javax.swing.JButton();
        btnCitaEspecialista = new javax.swing.JButton();
        btnConsultorioEspecializado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipalVistaIngreso.setBackground(new java.awt.Color(255, 255, 255));

        panelCabeza.setBackground(new java.awt.Color(248, 245, 230));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/iconHospital.jpeg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hospital de Ibagué");

        javax.swing.GroupLayout panelCabezaLayout = new javax.swing.GroupLayout(panelCabeza);
        panelCabeza.setLayout(panelCabezaLayout);
        panelCabezaLayout.setHorizontalGroup(
                panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCabezaLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(logo)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabezaLayout.setVerticalGroup(
                panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabezaLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35))
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

        btnCostoTotal.setText("Costos Total");
        btnCostoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoTotalActionPerformed(evt);
            }
        });

        btnAcercaDe.setText("Acerca de");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        btnCitaGeneral.setText("Cita General");
        btnCitaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaGeneralActionPerformed(evt);
            }
        });

        btnCitaEspecialista.setText("Cita Especialista");
        btnCitaEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaEspecialistaActionPerformed(evt);
            }
        });

        btnConsultorioEspecializado.setText("Con.Especializado");
        btnConsultorioEspecializado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultorioEspecializadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCitaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCostoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultorioEspecializado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCitaEspecialista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnAcercaDe)
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnListaPacientes)
                                        .addComponent(btnCostoTotal)
                                        .addComponent(btnModificar)
                                        .addComponent(btnEliminar)
                                        .addComponent(btnAcercaDe))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCitaGeneral)
                                        .addComponent(btnCitaEspecialista)
                                        .addComponent(btnConsultorioEspecializado))
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalVistaIngresoLayout = new javax.swing.GroupLayout(panelPrincipalVistaIngreso);
        panelPrincipalVistaIngreso.setLayout(panelPrincipalVistaIngresoLayout);
        panelPrincipalVistaIngresoLayout.setHorizontalGroup(
                panelPrincipalVistaIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalVistaIngresoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalVistaIngresoLayout.setVerticalGroup(
                panelPrincipalVistaIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalVistaIngresoLayout.createSequentialGroup()
                                .addComponent(panelCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipalVistaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipalVistaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultorioEspecializadoActionPerformed(ActionEvent evt) {
        vistaConsultorioEspecializado vistaConsultorioEspecializado = new vistaConsultorioEspecializado(controladorConsultorio);
        vistaConsultorioEspecializado.setVisible(true);
    }

    private void btnCitaEspecialistaActionPerformed(ActionEvent evt) {
        vistaCitaEspecialista vistaCitaEspecialista = new vistaCitaEspecialista(controlador, controladorConsultorio);
        vistaCitaEspecialista.setVisible(true);
    }

    private void btnCitaGeneralActionPerformed(ActionEvent evt) {
        vistaCitaGeneral vistaCitaGeneral = new vistaCitaGeneral(controlador);
        vistaCitaGeneral.setVisible(true);
    }



    public void setListaPacientesFrame(vistaListaPacientes listaPacientesFrame) {
        this.listaPacientesFrame = listaPacientesFrame;
    }

    public void setControlador(ControladorCitas controlador) {
        this.controlador = controlador;
    }


    private void btnCostoTotalActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed

        vistaCostoTotal vistaCostoTotal = new vistaCostoTotal(controlador);
        vistaCostoTotal.setVisible(true);



    }//GEN-LAST:event_btnHistorialActionPerformed



    private void btnListaPacientesActionPerformed(ActionEvent evt) {
        // Crear una instancia de vistaListaPacientes y pasar el controlador al constructor
        vistaListaPacientes vistaListaPacientes = new vistaListaPacientes(controlador, controladorConsultorio);

        // Hacer visible el frame de vistaListaPacientes
        vistaListaPacientes.setVisible(true);
    }

    private void btnModificarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        vistaBuscaPorTipo vistaBuscaPorTipo = new vistaBuscaPorTipo(controlador, controladorConsultorio);
        vistaBuscaPorTipo.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed
    private void btnAcercaDeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed

        vistaAcercaDe vistaAcerca = new vistaAcercaDe();
        vistaAcerca.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    private void btnEliminarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        vistaBuscarPorTipoEliminar vistaBuscarPorTipoEliminar = new vistaBuscarPorTipoEliminar(controlador);
        vistaBuscarPorTipoEliminar.setVisible(true);
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vistaIngreso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(vistaIngreso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(vistaIngreso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(vistaIngreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnCitaEspecialista;
    private javax.swing.JButton btnCitaGeneral;
    private javax.swing.JButton btnConsultorioEspecializado;
    private javax.swing.JButton btnCostoTotal;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListaPacientes;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelCabeza;
    private javax.swing.JPanel panelPrincipalVistaIngreso;

    // End of variables declaration//GEN-END:variables
}