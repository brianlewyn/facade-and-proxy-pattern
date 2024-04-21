public class Hotel {
    
    private String nombre;
    private String destino;
    private int puntuacion;

    public Hotel(String nombre, String destino, int puntuacion) {
        this.nombre = nombre;
        this.destino = destino;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nombre del hotel: " + nombre + "\nDestino: " + destino + "\nPuntuacion del hotel: " + puntuacion;
    }

}
