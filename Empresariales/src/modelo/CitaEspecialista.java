package modelo;

import java.time.LocalDate;
import java.util.Date;

public class CitaEspecialista extends CitaMedica {

    private String especialidad;
    private String nombreEspecialista;

    public CitaEspecialista(int idCita, LocalDate fecha, String paciente, String motivo, double costo, String especialidad, String nombreEspecialista) {
        super(idCita, fecha, paciente, motivo, costo);
        this.especialidad = especialidad;
        this.nombreEspecialista = nombreEspecialista;
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

    public double calcularCosto() {
        return (getCosto() * 1.5);
    }

    @Override
    public String toString() {
        return "CitaEspecialista{" + super.toString() + " " +
                "especialidad='" + especialidad + '\'' +
                ", nombreEspecialista='" + nombreEspecialista + '\'' +
                '}';
    }
}
