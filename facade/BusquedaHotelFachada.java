import java.util.ArrayList;

public class BusquedaHotelFachada {

    private HotelDatabase hotelDatabase;

    public BusquedaHotelFachada() {
        this.hotelDatabase = new HotelDatabase();
    }

    public ArrayList<Hotel> buscarHotelPorDestino(String destino) {
        return hotelDatabase.buscarHoteles(destino, -1);
    }

    public ArrayList<Hotel> buscarHotelPorPuntuacion(int puntuacion) {
        return hotelDatabase.buscarHoteles("", puntuacion);
    }

    public void reservarHotel(Hotel hotel, int numHabitaciones, String fechaInicio, String fechaFin) {
        hotelDatabase.reservarHotel(hotel, numHabitaciones, fechaInicio, fechaFin);
    }

    public Reserva getReserva(int indice) {
        return hotelDatabase.getReserva(indice);
    }
}
