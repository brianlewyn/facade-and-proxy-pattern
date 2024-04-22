import java.util.ArrayList;

public class HotelDatabase {

    private ArrayList<Hotel> hoteles = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public HotelDatabase() {
        hoteles.add(new Hotel("Hotel A", "Cancun", 4));
        hoteles.add(new Hotel("Hotel B", "Los Cabos", 5));
        hoteles.add(new Hotel("Hotel C", "Tulum", 5));
        hoteles.add(new Hotel("Hotel D", "Veracruz", 3));
    }

    public ArrayList<Hotel> buscarHoteles(String destino, int puntuacion) {
        ArrayList<Hotel> hotelesEncontrados = new ArrayList<>();
        for (int i = 0 ; i < hoteles.size() ; i++) {
            if (!hoteles.isEmpty() && hoteles.get(i).getDestino().equalsIgnoreCase(destino)) {
                hotelesEncontrados.add(hoteles.get(i));
            }

            if (puntuacion > 0 && hoteles.get(i).getPuntuacion() == puntuacion) {
                hotelesEncontrados.add(hoteles.get(i));
            }
        }
        return hotelesEncontrados;
    }

    public void reservarHotel(Hotel hotel, int numHabitaciones, String fechaInicio, String fechaFin) {
        reservas.add(new Reserva(hotel, numHabitaciones, fechaInicio, fechaFin));
    }

    public Reserva getReserva(int indice) {
        return reservas.get(indice);
    }
}
