package controller;

import model.CitaGeneral;
import model.CitaMedica;

import java.time.LocalDate;
import java.util.*;

public class ControladorCitas {

    private List<CitaMedica> citas = new ArrayList<>();

    public void insertarCita(CitaMedica cita) {
        citas.add(cita);
    }

    public void guardarCita(String id, String nombre, LocalDate fecha, String tipoCita, String motivo) {
        // Validar los datos ingresados por el usuario antes de crear la cita
        if (id.isEmpty() || nombre.isEmpty() || fecha == null|| tipoCita.isEmpty() || motivo.isEmpty()) {
            System.out.println("Error: Todos los campos son obligatorios");
            return;
        }
        if (tipoCita.equals("Medico General")) {

            CitaMedica nuevaCita = new CitaGeneral(id, nombre, fecha, tipoCita, motivo);
            insertarCita(nuevaCita);
        } else if (tipoCita.equals("Medico Especialista ")) {

        } else {
            // Manejar otros casos
        }

        // Crea un nuevo objeto CitaMedica con los datos proporcionados
        CitaMedica nuevaCita = new CitaMedica(id, fecha, motivo);

        // Inserta la nueva cita en la lista de citas
        insertarCita(nuevaCita);

        System.out.println("Cita guardada exitosamente");
    }


    public void eliminarCita(CitaMedica cita) {
        citas.remove(cita);
    }

    // Buscar cita médica por su id
    public CitaMedica buscarCitaPorId(int id) {
        for (CitaMedica cita : citas) {
            if (cita.getId() == id) {
                return cita;
            }
        }
        return null;
    }

    public List<CitaMedica> listarCitas() {
        return citas;
    }

    //Costo total de las citas médicas
    public double calcularCostoTotal() {
        double total = 0;
        for (CitaMedica cita : citas) {
            total = total + cita.calcularCosto();
        }
        return total;
    }

    //Actualizar cita



}
