/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControladorCitas;
import controller.ControladorConsultorios;
import interfaz.Observador;
import model.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.List;



/**
 *
 * @author alejandrosanmiguel
 */
public class vistaListaPacientes extends JFrame implements Observador {

    public void agregarObservadorEliminar(vistaEliminar vistaEliminar) {
        vistaEliminar.agregarObservador(this);
    }
    @Override
    public void update() {
        // Actualiza la tabla de citas
        actualizarTablaCitas();
    }

    private ControladorCitas controlador;

    private ControladorConsultorios controladorConsultorios;
    /**
     * Creates new form vistaListaPacientes
     */
    public vistaListaPacientes(ControladorCitas controlador, ControladorConsultorios controladorConsultorios) {
        this.controladorConsultorios = controladorConsultorios;
        this.controlador = controlador;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        actualizarTablaCitas();
        controlador.agregarObservador(this);

        tablaListaPacientes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int filaSeleccionada = tablaListaPacientes.getSelectedRow();
                    if (filaSeleccionada != -1) {
                        DefaultTableModel modelo = (DefaultTableModel) tablaListaPacientes.getModel();
                        Object[] filaDatos = new Object[modelo.getColumnCount()];
                        for (int i = 0; i < modelo.getColumnCount(); i++) {
                            filaDatos[i] = modelo.getValueAt(filaSeleccionada, i);
                        }
                        mostrarInformacionCita(filaDatos);
                    }
                }
            }
        });
    }
    private void mostrarInformacionCita(Object[] filaDatos) {
        String idCita = (String) filaDatos[0];
        CitaMedica cita = controlador.buscarCitaPorId(idCita);
        if (cita != null) {
            Hospital hospital = Hospital.getHospital();
            String mensaje = "<html><b>Información sobre la cita seleccionada:</b><br><br>";
            mensaje += "<b>Número de Identificación: </b>" + cita.getNumeroIdentificacion() + "<br>";
            mensaje += "<b>Nombre del Paciente: </b>" + cita.getNombrePaciente() + "<br>";
            mensaje += "<b>Fecha: </b>" + cita.getFecha() + "<br>";
            mensaje += "<b>Tipo de cita: </b>" + cita.getTipoCita() + "<br>";
            mensaje += "<b>Costo de la cita: </b>" + cita.getCosto() + "<br>";

            if (cita instanceof CitaGeneral) {
                CitaGeneral citaGeneral = (CitaGeneral) cita;
                mensaje += "<b>Nombre Generalista: </b>" + citaGeneral.getNombreGeneralista() + "<br>";
                mensaje += "<b>Observaciones: </b>" + citaGeneral.getObservacion() + "<br>";
            } else if (cita instanceof CitaEspecialista) {
                CitaEspecialista citaEspecialista = (CitaEspecialista) cita;
                mensaje += "<b>Especialidad: </b>" + citaEspecialista.getEspecialidad() + "<br>";
                mensaje += "<b>Nombre Especialista: </b>" + citaEspecialista.getNombreEspecialista() + "<br>";
            }

            // Agregar la información del hospital
            mensaje += "<b>Nombre del Hospital: </b>" + hospital.getNombre() + "<br>";
            mensaje += "<b>NIT del Hospital: </b>" + hospital.getNit() + "<br>";

            mensaje += "</html>";
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna cita con el ID especificado.");
        }
    }

    private static String filaDatosToString(Object[] filaDatos) {
        StringBuilder sb = new StringBuilder();
        for (Object dato : filaDatos) {
            sb.append(dato).append("\n");
        }
        return sb.toString();
    }

    public DefaultTableModel getModeloTabla() {
        return (DefaultTableModel) tablaListaPacientes.getModel();
    }
    public void actualizarTablaCitas() {

        // Obtener las citas del controlador
        List<CitaMedica> citas = controlador.listarCitas();
        // Limpiar la tabla
        DefaultTableModel modelo = (DefaultTableModel) tablaListaPacientes.getModel();
        modelo.setRowCount(0);
        // Llenar la tabla con las nuevas citas
        for (CitaMedica cita : citas) {
            Object[] fila = new Object[5];
            fila[0] = cita.getNumeroIdentificacion();
            fila[1] = cita.getNombrePaciente();
            fila[2] = cita.getFecha();
            fila[3] = cita.getTipoCita();
            fila[4] = cita.getCosto();
            modelo.addRow(fila);

        }

    }

    public void agregarObservadorModificar(vistaModificar vistaModificar) {
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {
        String id = txtNumeroIdentificacion.getText();

        // Verificar si el ID existe en la tabla
        boolean idExiste = controlador.idExistente(id);
        CitaGeneral citaGeneral = new CitaGeneral();
        CitaEspecialista citaEspecialista = new CitaEspecialista();
        ConsultorioEspecializado consultorioEspecializado = new ConsultorioEspecializado();

        if (idExiste) {
            // Buscar la cita correspondiente al ID
            CitaMedica citaSeleccionada = controlador.buscarCitaPorId(id);

            // Verificar si se encontró la cita
            if (citaSeleccionada != null) {
                Hospital hospital = Hospital.getHospital();
                String mensaje = "<html><b>   Información sobre la cita seleccionada    </b><br>";
                mensaje += "<br>";
                mensaje += "<b>Número de Identificación: </b>" + citaSeleccionada.getNumeroIdentificacion() + "<br>";
                mensaje += "<b>Nombre del Paciente: </b>" + citaSeleccionada.getNombrePaciente() + "<br>";
                mensaje += "<b>Fecha: </b>" + citaSeleccionada.getFecha() + "<br>";
                mensaje += "<b>Tipo de cita: </b>" + citaSeleccionada.getTipoCita() + "<br>";
                mensaje += "<b>Costo de la cita: </b>" + citaSeleccionada.getCosto() + "<br>";

                if (citaSeleccionada instanceof CitaGeneral) {
                    citaGeneral = (CitaGeneral) citaSeleccionada;

                    mensaje += "<b>Nombre Generalista: </b>" + citaGeneral.getNombreGeneralista() + "<br>";
                    mensaje += "<b>Observaciones: </b>" + citaGeneral.getObservacion() + "<br>";
                    mensaje += "<b>Consultorio asignado: </b>" + citaGeneral.asignarConsultorio()  + "<br>";
                } else if (citaSeleccionada instanceof CitaEspecialista) {
                    citaEspecialista = (CitaEspecialista) citaSeleccionada;
                    mensaje += "<b>Especialidad: </b>" + citaEspecialista.getEspecialidad() + "<br>";
                    mensaje += "<b>Nombre Especialista: </b> " + citaEspecialista.getNombreEspecialista() + "<br>";
                    mensaje += "<b>Número de Consultorio: </b>" + consultorioEspecializado.getNumeroConsultorio() + "<br>";
                    mensaje += "<b>Sección: </b>" + consultorioEspecializado.getSeccion() + "<br>";

                }

                // Agregar la información del hospital
                mensaje += "<b>Nombre del Hospital: </b>" + hospital.getNombre() + "<br>";
                mensaje += "<b>NIT del Hospital: </b>" + hospital.getNit() + "<br>";



                mensaje += "</html>";

                // Mostrar los datos en un mensaje
                JOptionPane.showMessageDialog(null, mensaje);
                txtNumeroIdentificacion.setText("");
            } else {
                // Mostrar un mensaje de error si no se encontró la cita
                JOptionPane.showMessageDialog(null, "No se encontró ninguna cita con el ID especificado.");
                txtNumeroIdentificacion.setText("");
            }
        } else {
            // Mostrar un mensaje de error si el ID no existe en la tabla
            JOptionPane.showMessageDialog(null, "El ID no existe en la tabla.");
            txtNumeroIdentificacion.setText("");
        }
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalListaPacientes = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        labelTitulo = new JLabel();
        jScrollPane1 = new JScrollPane();
        tablaListaPacientes = new JTable();
        txtNumeroIdentificacion = new JTextField();
        btnAceptar = new JButton();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(248, 245, 230));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/view/img/iconListaPacientes.jpeg"))); // NOI18N

        labelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        labelTitulo.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setText("Lista de Pacientes");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTitulo)
                                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(labelTitulo)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaListaPacientes.setBackground(new java.awt.Color(255, 255, 255));
        tablaListaPacientes.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Id", "Nombre", "Fecha", "Tipo de cita", "Costo"
                }
        ));
        jScrollPane1.setViewportView(tablaListaPacientes);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel2.setText("Digita el numero de indentificación: ");

        GroupLayout panelPrincipalListaPacientesLayout = new GroupLayout(panelPrincipalListaPacientes);
        panelPrincipalListaPacientes.setLayout(panelPrincipalListaPacientesLayout);
        panelPrincipalListaPacientesLayout.setHorizontalGroup(
                panelPrincipalListaPacientesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelPrincipalListaPacientesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(panelPrincipalListaPacientesLayout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(panelPrincipalListaPacientesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(panelPrincipalListaPacientesLayout.createSequentialGroup()
                                                .addComponent(txtNumeroIdentificacion, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addComponent(btnAceptar)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalListaPacientesLayout.setVerticalGroup(
                panelPrincipalListaPacientesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalListaPacientesLayout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalListaPacientesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNumeroIdentificacion, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAceptar))
                                .addGap(43, 43, 43))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipalListaPacientes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipalListaPacientes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(vistaListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crear una instancia de ControladorCitas
                ControladorCitas controlador = new ControladorCitas();
                ControladorConsultorios controladorConsultorios = new ControladorConsultorios();

                // Crear una instancia de vistaListaPacientes y pasar el controlador al constructor
                vistaListaPacientes listaPacientesFrame = new vistaListaPacientes(controlador, controladorConsultorios);

                // Crear una instancia de vistaEliminar
                vistaEliminar vistaEliminarFrame = new vistaEliminar(listaPacientesFrame);

                // Hacer visible el frame de vistaListaPacientes
                listaPacientesFrame.setVisible(true);

                listaPacientesFrame.agregarObservadorEliminar(vistaEliminarFrame);

            }
        });

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAceptar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JLabel labelTitulo;
    private JPanel panelPrincipalListaPacientes;
    public JTable tablaListaPacientes;
    private JTextField txtNumeroIdentificacion;


    // End of variables declaration//GEN-END:variables
}