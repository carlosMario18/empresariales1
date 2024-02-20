package model;

import java.time.LocalDate;

public class CitaEspecialista extends CitaMedica {

    private String especialidad;
    private int consultorio;
    private String medico;

    public CitaEspecialista(int id, LocalDate fecha, double costo, String especialidad, int consultorio, String medico) {
        super(id, fecha, costo);
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.medico = medico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public double calcularCosto() {
        return (getCosto()*1.5);
    }

    @Override
    public String toString() {
        return "CitaEspecialista{" +
                super.toString() + " " +
                "especialidad='" + especialidad + '\'' +
                ", consultorio=" + consultorio +
                ", medico='" + medico + '\'' +
                '}';
    }
}
