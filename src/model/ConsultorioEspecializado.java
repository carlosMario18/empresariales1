package model;

public class ConsultorioEspecializado {

    private String numeroConsultorio;
    private String seccion;

    public ConsultorioEspecializado(String numeroConsultorio, String seccion) {
        this.numeroConsultorio = numeroConsultorio;
        this.seccion = seccion;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "ConsultorioEspecializado{" +
                "numeroConsultorio=" + numeroConsultorio +
                ", seccion='" + seccion + '\'' +
                '}';
    }
}
