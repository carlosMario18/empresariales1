package controller;

import model.CitaMedica;
import view.vistaListaPacientes;

import java.util.ArrayList;
import java.util.List;

public class ControladorCitas {

    private List<CitaMedica> citas = new ArrayList<>();
    private List<vistaListaPacientes> observadores = new ArrayList<>();


    public void insertarCita(CitaMedica cita) {
        citas.add(cita);
        notificarObservadores();

    }

    public void eliminarCita(CitaMedica cita) {
        citas.remove(cita);
        notificarObservadores();

    }
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
        double costoTotal =0;
        for (CitaMedica cita : citas) {
            costoTotal += cita.calcularCosto();
        }
        return costoTotal;
    }
    public double calcularCostoTotalPorTipo(String tipoCita) {
        double costoTotal = 0;
        for (CitaMedica cita : citas) {
            if (cita.getTipoCita().equals(tipoCita)) {
                costoTotal += cita.calcularCosto();
            }
        }
        return costoTotal;
    }
    public boolean idExistente(String numeroIdentificacion) {
        for (CitaMedica cita : citas) {
            if (cita.getNumeroIdentificacion().equals(numeroIdentificacion)) {
                return true;
            }
        }
        return false;
    }
    public void agregarObservador(vistaListaPacientes observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(vistaListaPacientes observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (vistaListaPacientes observador : observadores) {
            observador.update();
        }
    }
    public void modificarCita(CitaMedica citaModificada) {
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getNumeroIdentificacion().equals(citaModificada.getNumeroIdentificacion())) {
                citas.set(i, citaModificada);
                break;
            }
        }
        notificarObservadores();
    }
    public List<CitaMedica> getCitas() {
        return citas;
    }


}