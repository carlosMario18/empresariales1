/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.toedter.calendar.JDateChooser;
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
    /**
     * Creates new form vistaIngreso
     */
    public vistaIngreso() {

        controlador = new ControladorCitas();
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        desactivarCampos();
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
        panelCabeza = new JPanel();
        logo = new JLabel();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        btnEliminar = new JButton();
        btnModificar = new JButton();
        btnListaPacientes = new JButton();
        btnCostoTotal = new JButton();
        btnAcercaDe = new JButton();
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
        btnCancelar = new JButton();
        labelNomGeneralista = new JLabel();
        txtNomGeneralista = new JTextArea();
        labelObservaciones = new JLabel();
        txtObservaciones = new JTextArea();
        labelEspecialidad = new JLabel();
        txtEspecialidad = new JTextArea();
        txtNomEspecialidad = new JTextArea();
        labelNomEspecialista = new JLabel();
        jDateChooser1 = new JDateChooser();
        btnGuardar = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelPrincipalVistaIngreso.setBackground(new Color(255, 255, 255));

        panelCabeza.setBackground(new Color(248, 245, 230));

        logo.setIcon(new ImageIcon(getClass().getResource("/view/img/iconHospital.jpeg"))); // NOI18N

        jLabel1.setFont(new Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setText("Hospital de Ibagué");

        GroupLayout panelCabezaLayout = new GroupLayout(panelCabeza);
        panelCabeza.setLayout(panelCabezaLayout);
        panelCabezaLayout.setHorizontalGroup(
                panelCabezaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelCabezaLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(logo)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabezaLayout.setVerticalGroup(
                panelCabezaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(logo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelCabezaLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35))
        );

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

        btnCostoTotal.setText("Costos Total");
        btnCostoTotal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCostoTotalActionPerformed(evt);
            }
        });

        btnAcercaDe.setText("Acerca de");
        btnAcercaDe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnListaPacientes, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCostoTotal, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAcercaDe)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnListaPacientes)
                                        .addComponent(btnCostoTotal)
                                        .addComponent(btnModificar)
                                        .addComponent(btnEliminar)
                                        .addComponent(btnAcercaDe))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelCuerpo.setBackground(new Color(255, 255, 255));
        panelCuerpo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(""), "Datos del Paciente", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.TOP, new Font("Liberation Sans", 0, 18), new Color(0, 0, 0))); // NOI18N
        panelCuerpo.setForeground(new Color(255, 255, 255));

        jLabel2.setText("No.Identificación: ");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Fecha: ");

        txtNumeroIdentificacion.setColumns(20);
        txtNumeroIdentificacion.setRows(5);

        textNombre.setColumns(20);
        textNombre.setRows(5);

        txtCosto.setColumns(20);
        txtCosto.setRows(5);

        jLabel5.setText("Tipo de cita:");

        boxTipoCita.setModel(new DefaultComboBoxModel<>(new String[] {"Seleccione una opción","Medico General", "Medico Especialista" }));
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

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelNomGeneralista.setText("Nom.Generalista:");

        txtNomGeneralista.setColumns(20);
        txtNomGeneralista.setRows(5);

        labelObservaciones.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);

        labelEspecialidad.setText("Especialidad:");

        txtEspecialidad.setColumns(20);
        txtEspecialidad.setRows(5);

        txtNomEspecialidad.setColumns(20);
        txtNomEspecialidad.setRows(5);

        labelNomEspecialista.setText("Nom. Especialista:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        GroupLayout panelCuerpoLayout = new GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
                panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel4, GroupLayout.Alignment.LEADING)
                                                                        .addComponent(labelNomGeneralista)
                                                                        .addComponent(jLabel5, GroupLayout.Alignment.LEADING))
                                                                .addComponent(labelEspecialidad))
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNomGeneralista, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(boxTipoCita, GroupLayout.Alignment.TRAILING, 0, 187, Short.MAX_VALUE)
                                                        .addComponent(jDateChooser1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtNumeroIdentificacion, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(txtEspecialidad, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelCuerpoLayout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addGap(80, 80, 80)))
                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                                                                .addGap(37, 37, 37)
                                                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel6))
                                                                                .addGap(26, 26, 26))
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelCuerpoLayout.createSequentialGroup()
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(labelObservaciones)
                                                                                .addGap(18, 18, 18)))
                                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtCosto, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                                                        .addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                        .addComponent(txtObservaciones, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(labelNomEspecialista)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtNomEspecialidad, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 62, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelCuerpoLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addGap(148, 148, 148))))
        );
        panelCuerpoLayout.setVerticalGroup(
                panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNumeroIdentificacion, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtCosto, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                                .addGap(57, 57, 57)
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelObservaciones)
                                                        .addComponent(txtObservaciones, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                                .addGap(138, 138, 138)
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnGuardar)
                                                        .addComponent(btnCancelar))
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(boxTipoCita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(labelNomGeneralista)
                                                        .addComponent(txtNomGeneralista, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                                .addGap(95, 95, 95)
                                                .addGroup(panelCuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelEspecialidad)
                                                        .addComponent(txtEspecialidad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelNomEspecialista)
                                                        .addComponent(txtNomEspecialidad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                                .addGap(173, 173, 173))))
        );

        GroupLayout panelPrincipalVistaIngresoLayout = new GroupLayout(panelPrincipalVistaIngreso);
        panelPrincipalVistaIngreso.setLayout(panelPrincipalVistaIngresoLayout);
        panelPrincipalVistaIngresoLayout.setHorizontalGroup(
                panelPrincipalVistaIngresoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelCabeza, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalVistaIngresoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelPrincipalVistaIngresoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(panelCuerpo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalVistaIngresoLayout.setVerticalGroup(
                panelPrincipalVistaIngresoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalVistaIngresoLayout.createSequentialGroup()
                                .addComponent(panelCabeza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelCuerpo, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipalVistaIngreso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipalVistaIngreso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

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
        // Leer datos ingresados por el usuario
        String id = txtNumeroIdentificacion.getText();
        String nombre = textNombre.getText();
        String tipoCita = (String) boxTipoCita.getSelectedItem();
        String costoTxt = txtCosto.getText();

        // Validar campos obligatorios
        if (id.isEmpty() || nombre.isEmpty() || tipoCita.isEmpty() || costoTxt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convertir el costo a entero
        int costo;
        try {
            costo = Integer.parseInt(costoTxt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: El costo debe ser un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener la fecha seleccionada por el usuario
        LocalDate fecha;
        try {
            fecha = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Formato de fecha inválido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si el ID ya está registrado
        if (controlador.idExistente(id)) {
            JOptionPane.showMessageDialog(this, "Error: El ID ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear una instancia de ConsultorioEspecializado
        String numeroConsultorio = "A302";
        String seccion = "Norte";
        ConsultorioEspecializado consultorio = new ConsultorioEspecializado(numeroConsultorio, seccion);

        // Crear una nueva cita médica según el tipo de cita seleccionada
        if (tipoCita.equals("Medico General")) {
            String nomGeneralista = txtNomGeneralista.getText();
            String observacion = txtObservaciones.getText();
            CitaMedica nuevaCita = new CitaGeneral(id, nombre, fecha, costo, tipoCita, nomGeneralista, observacion);
            controlador.insertarCita(nuevaCita);
        } else if (tipoCita.equals("Medico Especialista")) {
            String especialidad = txtEspecialidad.getText();
            String nomEspecialista = txtNomEspecialidad.getText();
            CitaMedica nuevaCita = new CitaEspecialista(id, nombre, fecha, costo, tipoCita, especialidad, nomEspecialista, consultorio);
            controlador.insertarCita(nuevaCita);
        } else {
            // Lógica para otro tipo de cita, si es necesario
        }

        // Mostrar un mensaje de éxito y limpiar campos
        vistaGuardarConExito exito = new vistaGuardarConExito();
        exito.setVisible(true);
        limpiarCampos();
    }


    private void limpiarCampos() {
        txtNumeroIdentificacion.setText("");
        textNombre.setText("");
        jDateChooser1.setDate(null);
        txtCosto.setText("");
        txtNomEspecialidad.setText("");
        txtEspecialidad.setText("");
        txtNomGeneralista.setText("");
        txtObservaciones.setText("");
    }

    private void btnCostoTotalActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed

        vistaCostoTotal vistaCostoTotal = new vistaCostoTotal(controlador);
        vistaCostoTotal.setVisible(true);



    }//GEN-LAST:event_btnHistorialActionPerformed

    private void boxTipoCitaItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_boxTipoCitaItemStateChanged

    }//GEN-LAST:event_boxTipoCitaItemStateChanged

    private void desactivarCampos() {
        labelNomGeneralista.setEnabled(false);
        labelObservaciones.setEnabled(false);
        labelEspecialidad.setEnabled(false);
        labelNomEspecialista.setEnabled(false);
        txtNomGeneralista.setEnabled(false);
        txtObservaciones.setEnabled(false);
        txtEspecialidad.setEnabled(false);
        txtNomEspecialidad.setEnabled(false);
    }
    private void boxTipoCitaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_boxTipoCitaActionPerformed


        String seleccion = (String) boxTipoCita.getSelectedItem();
        if (seleccion.equals("Medico General")) {
            labelNomGeneralista.setEnabled(true);
            labelObservaciones.setEnabled(true);
            labelEspecialidad.setEnabled(false);
            labelNomEspecialista.setEnabled(false);
            txtNomGeneralista.setEnabled(true);
            txtObservaciones.setEnabled(true);
            txtEspecialidad.setEnabled(false);
            txtNomEspecialidad.setEnabled(false);
        } else if (seleccion.equals("Medico Especialista")) {
            labelNomGeneralista.setEnabled(false);
            labelObservaciones.setEnabled(false);
            labelEspecialidad.setEnabled(true);
            labelNomEspecialista.setEnabled(true);
            txtNomGeneralista.setEnabled(false);
            txtObservaciones.setEnabled(false);
            txtEspecialidad.setEnabled(true);
            txtNomEspecialidad.setEnabled(true);
        }else if (seleccion.equals("Seleccione una opción")){
            desactivarCampos();
        }
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

    private void btnCancelarActionPerformed(ActionEvent evt) {

        limpiarCampos();
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
    private JButton btnCostoTotal;
    private JButton btnEliminar;
    private JButton btnGuardar;
    private JButton btnListaPacientes;
    private JButton btnModificar;
    private JDateChooser jDateChooser1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JLabel labelEspecialidad;
    private JLabel labelNomEspecialista;
    private JLabel labelNomGeneralista;
    private JLabel labelObservaciones;
    private JLabel logo;
    private JPanel panelCabeza;
    private JPanel panelCuerpo;
    private JPanel panelPrincipalVistaIngreso;
    private JTextArea textNombre;
    private JTextArea txtCosto;
    private JTextArea txtEspecialidad;
    private JTextArea txtNomEspecialidad;
    private JTextArea txtNomGeneralista;
    private JTextArea txtNumeroIdentificacion;
    private JTextArea txtObservaciones;

    // End of variables declaration//GEN-END:variables
}
