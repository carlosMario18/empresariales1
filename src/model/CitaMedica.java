package model;

import java.time.LocalDate;

public abstract class CitaMedica {

    private String  numeroIdentificacion;
    private String nombrePaciente;
    private  LocalDate fecha;
    private  int costo;

    private  String  tipoCita;

    public CitaMedica(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, int costo, String tipoCita) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombrePaciente = nombrePaciente;
        this.fecha = fecha;
        this.costo = costo;
        this.tipoCita = tipoCita;
    }

    public CitaMedica() {

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

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public abstract double calcularCosto();

    public abstract boolean idExistente(String numeroIdentificacion);

}
