import controller.ControladorCitas;
import view.vistaIngreso;
import view.vistaListaPacientes;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        // Crear una instancia de ControladorCitas
        ControladorCitas controlador = new ControladorCitas();

        // Crear una instancia de vistaListaPacientes y pasar el controlador al constructor
        vistaListaPacientes listaPacientesFrame = new vistaListaPacientes(controlador);

        // Crear una instancia de vistaIngreso
        vistaIngreso ingresoFrame = new vistaIngreso();

        // Establecer la instancia de vistaListaPacientes en vistaIngreso
        ingresoFrame.setListaPacientesFrame(listaPacientesFrame);

        // Hacer visible el frame de vistaIngreso
        ingresoFrame.setVisible(true);
    }
}


