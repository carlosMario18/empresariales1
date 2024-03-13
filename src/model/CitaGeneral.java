package model;

import interfaz.MedicoG;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.time.LocalDate;

public class CitaGeneral extends CitaMedica implements MedicoG {

    private String nombreGeneralista;
    private String observacion;
    private static Set<Integer> consultoriosAsignados;
    private Random random;


    public CitaGeneral(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, double costo, String tipoCita, String nombreGeneralista, String observacion) {
        super(numeroIdentificacion, nombrePaciente, fecha, costo, tipoCita);
        this.nombreGeneralista = nombreGeneralista;
        this.observacion = observacion;
        this.consultoriosAsignados = new HashSet<>();
        this.random = new Random();
    }

    public CitaGeneral( ){
        this.consultoriosAsignados = new HashSet<>();
        this.random = new Random();
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
    public  int asignarConsultorio() {
        int consultorioAsignado;

        if (consultoriosAsignados.size() == 10) {
            consultoriosAsignados.clear();
        }

        do {
            consultorioAsignado = random.nextInt(10) + 1;
        } while (consultoriosAsignados.contains(consultorioAsignado));

        consultoriosAsignados.add(consultorioAsignado);

        return consultorioAsignado;
    }
    public double calcularCosto() {
        return getCosto();
    }

    public boolean idExistente(String numeroIdentificacion) {
        return false;
    }

}