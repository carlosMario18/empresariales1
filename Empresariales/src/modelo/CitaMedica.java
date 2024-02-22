package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class CitaMedica {
    private int idCita;
    private LocalDate fecha;
    private String paciente;
    private String motivo;

    private double costo;


    public CitaMedica(int idCita, LocalDate fecha, String paciente, String motivo, double costo) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.paciente = paciente;
        this.motivo = motivo;
        this.costo = costo;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public abstract double calcularCosto();
    @Override
    public String toString() {
        return "CitaMedica{" +
                "idCita=" + idCita +
                ", fecha=" + fecha +
                ", paciente='" + paciente + '\'' +
                ", motivo='" + motivo + '\'' +
                ", costo='" + costo + '\'' +
                '}';
    }
}
