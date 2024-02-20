package model;

import java.time.LocalDate;

public abstract class CitaMedica {

    private int id;
    private LocalDate fecha;
    private double costo;

    public CitaMedica(int id, LocalDate fecha, double costo) {
        this.id = id;
        this.fecha = fecha;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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
                "id=" + id +
                ", fecha=" + fecha +
                ", costo=" + costo +
                '}';
    }
}
