import controller.ControladorCitas;
import controller.ControladorConsultorios;
import view.vistaIngreso;
import view.vistaListaPacientes;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        ControladorCitas controlador = new ControladorCitas();
        ControladorConsultorios controladorConsultorios = new ControladorConsultorios();

        vistaListaPacientes listaPacientesFrame = new vistaListaPacientes(controlador, controladorConsultorios);
        listaPacientesFrame.actualizarTablaCitas(); // Llamada al método en la instancia creada

        vistaIngreso ingresoFrame = new vistaIngreso();

        ingresoFrame.setListaPacientesFrame(listaPacientesFrame);

        ingresoFrame.setVisible(true);
    }
}


