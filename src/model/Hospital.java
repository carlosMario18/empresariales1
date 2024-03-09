package model;

public class Hospital {

    private static Hospital hospital;
    private String nombre;
    private String nit;

    private Hospital(){

    }

    public static Hospital getHospital(){
        if (hospital == null) {
            hospital = new Hospital();
            hospital.setNit("1234567890");
            hospital.setNombre("Clinica San Pablo");
        }

        return hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }
}
