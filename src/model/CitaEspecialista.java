package model;

import java.time.LocalDate;

public class CitaEspecialista extends CitaMedica {

    private  String especialidad;
    private String  nombreEspecialista;

    public CitaEspecialista(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, double costo, String tipoCita, String especialidad, String nombreEspecialista) {
        super(numeroIdentificacion, nombrePaciente, fecha, costo, tipoCita);
        this.especialidad = especialidad;

        this.nombreEspecialista = nombreEspecialista;
    }

    public CitaEspecialista() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getnombreEspecialista() {
        return nombreEspecialista;
    }

    public void setnombreEspecialista(String nombreEspecialista) {
        this.nombreEspecialista = nombreEspecialista;
    }

    public double calcularCosto() {
        return getCosto();
    }

    public boolean idExistente(String numeroIdentificacion) {
        return false;
    }

}
