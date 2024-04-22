public class Reserva {

    private Hotel hotel;
    private int numHabitaciones;
    private String fechaInicio;
    private String fechaFin;

    public Reserva(Hotel hotel, int numHabitaciones, String fechaInicio, String fechaFin) {
        this.hotel = hotel;
        this.numHabitaciones = numHabitaciones;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
