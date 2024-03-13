package model;

import interfaz.MedicoG;

import java.time.LocalDate;

public class CitaGeneral extends CitaMedica implements MedicoG {

    private String nombreGeneralista;
    private String observacion;
    private String consultorio;



    public CitaGeneral(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, double costo, String tipoCita, String nombreGeneralista, String observacion) {
        super(numeroIdentificacion, nombrePaciente, fecha, costo, tipoCita);
        this.nombreGeneralista = nombreGeneralista;
        this.observacion = observacion;

    }

    public CitaGeneral( ){
    }

    public String getNombreGeneralista() {
        return nombreGeneralista;
    }

    public void setNombreGeneralista(String nombreGeneralista) {
        this.nombreGeneralista = nombreGeneralista;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int asignarConsultorio() {

        int numero = 10;
        System.out.println("Consultorio asignado: " + numero);
        return  numero;
    }
    public double calcularCosto() {
        return getCosto();
    }

    public boolean idExistente(String numeroIdentificacion) {
        return false;
    }

}