package model;

import java.time.LocalDate;

public class CitaGeneral extends CitaMedica {

    private String nombreGeneralista;
    private String observacion;


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

    public double calcularCosto() {
        return getCosto();
    }

    public boolean idExistente(String numeroIdentificacion) {
        return false;
    }

}
