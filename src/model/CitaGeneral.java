package model;

import java.time.LocalDate;

public class CitaGeneral extends CitaMedica {

    private String sintomas;
    private String diagnostico;
    private int edadPaciente;

    public CitaGeneral(int id, LocalDate fecha, double costo, String sintomas, String diagnostico, int edadPaciente) {
        super(id, fecha, costo);
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

    @Override
    public String toString() {
        return "CitaGeneral{" +
                super.toString() + " " +
                "sintomas='" + sintomas + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", edadPaciente=" + edadPaciente +
                '}';
    }
}
