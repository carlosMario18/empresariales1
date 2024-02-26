package model;

import java.time.LocalDate;

public class CitaEspecialista extends CitaMedica {

    private  String especialidad;
    private String consultorio;
    private String nombreMedico;

    public CitaEspecialista(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, int costo, String tipoCita, String especialidad, String consultorio, String nombreMedico) {
        super(numeroIdentificacion, nombrePaciente, fecha, costo, tipoCita);
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.nombreMedico = nombreMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public double calcularCosto() {
        return 0;
    }

    public boolean idExistente(String numeroIdentificacion) {
        return false;
    }

}
