package interfaz;

public interface Observable {

    void agregarObservador(Observador observador);
    void eliminarObservador(Observador observador);
    public void notificar();
}
