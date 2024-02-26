package model;

import java.time.LocalDate;

public abstract class CitaMedica {

    private String  numeroIdentificacion;
    private String nombrePaciente;
    private  LocalDate fecha;
    private  int costo;

    public CitaMedica(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, int costo) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombrePaciente = nombrePaciente;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public abstract double calcularCosto();


}
