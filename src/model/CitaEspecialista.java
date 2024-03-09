package model;

import java.time.LocalDate;

public class CitaEspecialista extends CitaMedica {
    private String especialidad;
    private String nombreEspecialista;

    private ConsultorioEspecializado consultorio;



    public CitaEspecialista(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, double costo, String tipoCita, String especialidad, String nombreEspecialista, ConsultorioEspecializado consultorio) {
        super(numeroIdentificacion, nombrePaciente, fecha, costo, tipoCita);
        this.especialidad = especialidad;
        this.nombreEspecialista = nombreEspecialista;
        this.consultorio = consultorio;
    }

    public CitaEspecialista() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreEspecialista() {
        return nombreEspecialista;
    }

    public void setNombreEspecialista(String nombreEspecialista) {
        this.nombreEspecialista = nombreEspecialista;
    }

    public ConsultorioEspecializado getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(ConsultorioEspecializado consultorio) {
        this.consultorio = consultorio;
    }

    public double calcularCosto() {
        return getCosto();
    }

    public boolean idExistente(String numeroIdentificacion) {
        return false;
    }
}

