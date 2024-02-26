/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

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
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import controller.ControladorCitas;
import model.CitaMedica;

/**
 * @author alejandrosanmiguel
 */
public class vistaIngreso extends JFrame {

    private ControladorCitas controlador;
    private vistaListaPacientes listaPacientesFrame;
    /**
     * Creates new form vistaIngreso
     */
    public vistaIngreso() {

        controlador = new ControladorCitas();
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

        panelPrincipalVistaIngreso = new JPanel();
        panelCuerpo = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        txtNumeroIdentificacion = new JTextArea();
        textNombre = new JTextArea();
        txtCosto = new JTextArea();
        jLabel5 = new JLabel();
        boxTipoCita = new JComboBox<>();
        jLabel6 = new JLabel();
        btnGuardar = new JButton();
        btnHistorial = new JButton();
        btnAcercaDe = new JButton();
        btnCancelar = new JButton();
        txtFecha = new JTextArea();
        panelCabeza = new JPanel();
        logo = new JLabel();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        btnEliminar = new JButton();
        btnModificar = new JButton();
        btnListaPacientes = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelPrincipalVistaIngreso.setBackground(new Color(255, 255, 255));

        panelCuerpo.setBackground(new Color(255, 255, 255));
        panelCuerpo.setBorder(BorderFactory.createTitledBorder(null, "Datos del Paciente", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.TOP, new Font("Liberation Sans", 0, 18), new Color(0, 0, 0))); // NOI18N
        panelCuerpo.setForeground(new Color(255, 255, 255));

        jLabel2.setText("Numero de Identificación: ");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Fecha: ");

        txtNumeroIdentificacion.setColumns(20);
        txtNumeroIdentificacion.setRows(5);

        textNombre.setColumns(20);
        textNombre.setRows(5);

        txtCosto.setColumns(20);
        txtCosto.setRows(5);

        jLabel5.setText("Tipo de cita:");

        boxTipoCita.setModel(new DefaultComboBoxModel<>(new String[]{"Medico General", "Medico Especialista", "Odontologia"}));
        boxTipoCita.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                boxTipoCitaItemStateChanged(evt);
            }
        });
        boxTipoCita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                boxTipoCitaActionPerformed(evt);
            }
        });

        jLabel6.setText("Costo: ");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnAcercaDe.setText("Acerca de");
        btnAcercaDe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtFecha.setColumns(20);
        txtFecha.setRows(5);

        GroupLayout panelCuerpoLayout = new GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(panelCuerpoLayout.createSequentialGroup().addGap(27, 27, 27).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(btnAcercaDe, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(panelCuerpoLayout.createSequentialGroup().addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6)).addGap(71, 71, 71).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(txtCosto, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE).addComponent(txtNumeroIdentificacion, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE).addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE).addComponent(boxTipoCita, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(txtFecha, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))).addGroup(panelCuerpoLayout.createSequentialGroup().addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE).addGap(47, 47, 47).addComponent(btnHistorial, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE).addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))).addContainerGap(43, Short.MAX_VALUE)));
        panelCuerpoLayout.setVerticalGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(panelCuerpoLayout.createSequentialGroup().addGap(19, 19, 19).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(panelCuerpoLayout.createSequentialGroup().addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addComponent(txtNumeroIdentificacion, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jLabel3)).addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel4).addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)).addGap(22, 22, 22).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel5).addComponent(boxTipoCita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(panelCuerpoLayout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel6)).addGroup(panelCuerpoLayout.createSequentialGroup().addGap(18, 18, 18).addComponent(txtCosto, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))).addGap(58, 58, 58).addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(btnGuardar).addComponent(btnHistorial).addComponent(btnCancelar)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE).addComponent(btnAcercaDe).addGap(14, 14, 14)));

        panelCabeza.setBackground(new Color(248, 245, 230));

        logo.setIcon(new ImageIcon(getClass().getResource("/view/img/iconHospital.jpeg"))); // NOI18N

        jLabel1.setFont(new Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setText("Hospital de Ibagué");

        GroupLayout panelCabezaLayout = new GroupLayout(panelCabeza);
        panelCabeza.setLayout(panelCabezaLayout);
        panelCabezaLayout.setHorizontalGroup(panelCabezaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(panelCabezaLayout.createSequentialGroup().addGap(93, 93, 93).addComponent(logo, GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE).addGap(37, 37, 37).addComponent(jLabel1).addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        panelCabezaLayout.setVerticalGroup(panelCabezaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(logo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.TRAILING, panelCabezaLayout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1).addGap(34, 34, 34)));

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Apartado Clinico", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.TOP, new Font("Liberation Sans", 0, 18), new Color(0, 0, 0))); // NOI18N

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnListaPacientes.setText("Lista de pacientes");
        btnListaPacientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnListaPacientesActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(btnListaPacientes, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE).addGap(31, 31, 31).addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE).addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE).addGap(34, 34, 34)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(15, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(btnModificar).addComponent(btnListaPacientes).addComponent(btnEliminar)).addGap(37, 37, 37)));

        GroupLayout panelPrincipalVistaIngresoLayout = new GroupLayout(panelPrincipalVistaIngreso);
        panelPrincipalVistaIngreso.setLayout(panelPrincipalVistaIngresoLayout);
        panelPrincipalVistaIngresoLayout.setHorizontalGroup(panelPrincipalVistaIngresoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panelCabeza, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(panelCuerpo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        panelPrincipalVistaIngresoLayout.setVerticalGroup(panelPrincipalVistaIngresoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(panelPrincipalVistaIngresoLayout.createSequentialGroup().addComponent(panelCabeza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(panelCuerpo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panelPrincipalVistaIngreso, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panelPrincipalVistaIngreso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      // Instancia compartida

    public void setListaPacientesFrame(vistaListaPacientes listaPacientesFrame) {
        this.listaPacientesFrame = listaPacientesFrame;
    }

    public void setControlador(ControladorCitas controlador) {
        this.controlador = controlador;
    }

    private void btnGuardarActionPerformed(ActionEvent evt) {
        String id = txtNumeroIdentificacion.getText();
        String nombre = textNombre.getText();
        String fechaTxt = txtFecha.getText();
        String tipoCita = (String) boxTipoCita.getSelectedItem();
        String costoTxt = txtCosto.getText();

        if (id.isEmpty() || nombre.isEmpty() || fechaTxt.isEmpty() || tipoCita.isEmpty() || costoTxt.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error: Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int costo;
        try {
            costo = Integer.parseInt(costoTxt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: El costo debe ser un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LocalDate fecha;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            fecha = LocalDate.parse(fechaTxt, formatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Error: Formato de fecha inválido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (controlador.idExistente(id)) {
            JOptionPane.showMessageDialog(this, "Error: El ID ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);
        }else {

            if (tipoCita.equals("Medico General")) {
                CitaMedica nuevaCita = new CitaGeneral(id, nombre, fecha, costo, tipoCita, "", "", 0);
                controlador.insertarCita(nuevaCita);
                vistaGuardarConExito exito = new vistaGuardarConExito();
                exito.setVisible(true);
                listaPacientesFrame.actualizarTablaCitas();

            } else if (tipoCita.equals("Medico Especialista")) {
                CitaGeneral nuevaCita = new CitaGeneral(id, nombre, fecha, costo, tipoCita, "", "", 0);
                controlador.insertarCita(nuevaCita);
                vistaGuardarConExito exito = new vistaGuardarConExito();
                exito.setVisible(true);
            } else {
                // Manejar otros casos
            }
        }
    }



    private void btnHistorialActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        vistaHistorialPaciente vistaHistorialPaciente = new vistaHistorialPaciente();
        vistaHistorialPaciente.setVisible(true);


    }//GEN-LAST:event_btnHistorialActionPerformed

    private void boxTipoCitaItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_boxTipoCitaItemStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_boxTipoCitaItemStateChanged

    private void boxTipoCitaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_boxTipoCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoCitaActionPerformed

    private void btnListaPacientesActionPerformed(ActionEvent evt) {
        // Crear una instancia de vistaListaPacientes y pasar el controlador al constructor
        vistaListaPacientes vistaListaPacientes = new vistaListaPacientes(controlador);

        // Hacer visible el frame de vistaListaPacientes
        vistaListaPacientes.setVisible(true);
    }



    private void btnModificarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        vistaBuscar vistaBuscar = new vistaBuscar(controlador);
        vistaBuscar.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAcercaDeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed

        vistaAcercaDe vistaAcerca = new vistaAcercaDe();
        vistaAcerca.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    private void btnEliminarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        vistaEliminar vistaEliminar = new vistaEliminar(controlador);
        vistaEliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        txtNumeroIdentificacion.setText("");
        textNombre.setText("");
        txtFecha.setText("");
        txtCosto.setText("");
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
    private JComboBox<String> boxTipoCita;
    private JButton btnAcercaDe;
    private JButton btnCancelar;
    private JButton btnEliminar;
    private JButton btnGuardar;
    private JButton btnHistorial;
    private JButton btnListaPacientes;
    private JButton btnModificar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JLabel logo;
    private JPanel panelCabeza;
    private JPanel panelCuerpo;
    private JPanel panelPrincipalVistaIngreso;
    private JTextArea textNombre;
    private JTextArea txtCosto;
    private JTextArea txtFecha;
    private JTextArea txtNumeroIdentificacion;
    // End of variables declaration//GEN-END:variables
}
