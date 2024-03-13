package controller;

import model.CitaMedica;
import model.ConsultorioEspecializado;

import java.util.ArrayList;
import java.util.List;

public class ControladorConsultorios {

    private List<ConsultorioEspecializado> consultorios = new ArrayList<>();

    public void insertarConsultorio(ConsultorioEspecializado consultorio) {
        consultorios.add(consultorio);

    }
    public void eliminarConsultorio(ConsultorioEspecializado consultorio) {
        consultorios.remove(consultorio);

    }
    public ConsultorioEspecializado buscarPornumeroConsultorio(String id) {
        for (ConsultorioEspecializado consultorioEspecializado : consultorios) {
            if (consultorioEspecializado.getNumeroConsultorio().equals(id)) {
                return consultorioEspecializado;
            }
        }
        return null;
    }

    public boolean idExistente(String numeroConsultorio) {
        for (ConsultorioEspecializado consultorioEspecializado : consultorios) {
            if (consultorioEspecializado.getNumeroConsultorio().equals(numeroConsultorio)) {
                return true;
            }
        }
        return false;
    }
    public String mostrarNumero(){
        ConsultorioEspecializado consultorioEspecializado = new ConsultorioEspecializado();
        String numero = consultorioEspecializado.getNumeroConsultorio();
        return numero;
    }

    public void modificarCita(ConsultorioEspecializado consultorioModificado) {
        for (int i = 0; i < consultorios.size(); i++) {
            if (consultorios.get(i).getNumeroConsultorio().equals(consultorioModificado.getNumeroConsultorio())) {
                consultorios.set(i, consultorioModificado);
                break;
            }
        }
    }

}
