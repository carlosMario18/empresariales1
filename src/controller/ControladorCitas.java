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

    public void eliminarCita(CitaMedica cita) {
        citas.remove(cita);
    }

    // Buscar cita médica por su id
    public CitaMedica buscarCitaPorId(String id) {
        for (CitaMedica cita : citas) {
            if (cita.getNumeroIdentificacion().equals(id)) {
                return cita;
            }
        }
        return null;
    }

    public List<CitaMedica> listarCitas() {
        return citas;
    }

    public double calcularCostoTotal() {
        double total = 0;
        for (CitaMedica cita : citas) {
            total = total + cita.calcularCosto();
        }
        return total;
    }

    public void modificarCita(CitaMedica citaModificada) {
        // Buscar la cita original en la lista y reemplazarla con la cita modificada
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getNumeroIdentificacion().equals(citaModificada.getNumeroIdentificacion())) {
                citas.set(i, citaModificada);
                break;
            }
        }
    }

}

