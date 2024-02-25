package controller;

import model.CitaMedica;

import java.util.*;

public class ControladorCitas {

    private List<CitaMedica> citas = new ArrayList<>();

    public void insertarCita(CitaMedica cita) {
        citas.add(cita);
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
