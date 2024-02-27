package model;

import java.time.LocalDate;

public class CitaGeneral extends CitaMedica {

    private String sintomas;
    private String diagnostico;
    private  int edadPaciente;

    public CitaGeneral(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, double costo, String tipoCita, String sintomas, String diagnostico, int edadPaciente) {
        super(numeroIdentificacion, nombrePaciente, fecha, costo, tipoCita);
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.edadPaciente = edadPaciente;
    }
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }
    public double calcularCosto() {
        return getCosto();
    }

    public boolean idExistente(String numeroIdentificacion) {
        return false;
    }

}
