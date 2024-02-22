package modelo;

import java.time.LocalDate;
import java.util.Date;

public class CitaGeneral extends CitaMedica {

    private String generalistaAsignado;
    private String observacion;

    public CitaGeneral(int idCita, LocalDate fecha, String paciente, String motivo, double costo, String generalistaAsignado, String observacion) {
        super(idCita, fecha, paciente, motivo, costo);
        this.generalistaAsignado = generalistaAsignado;
        this.observacion = observacion;
    }

    public String getGeneralistaAsignado() {
        return generalistaAsignado;
    }

    public void setGeneralistaAsignado(String generalistaAsignado) {
        this.generalistaAsignado = generalistaAsignado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public double calcularCosto() {
        return 0;
    }

    ;

    @Override
    public String toString() {
        return "CitaGeneral{" + super.toString() + " " +
                "generalistaAsignado='" + generalistaAsignado + '\'' +
                ", observacion='" + observacion + '\'' +
                '}';
    }
}
