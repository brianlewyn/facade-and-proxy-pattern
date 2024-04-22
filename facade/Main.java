import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        BusquedaHotelFachada hotelFachada = new BusquedaHotelFachada();

        System.out.println("===== Hoteles en Cancun =====");
        ArrayList<Hotel> hotelesPorDestino = hotelFachada.buscarHotelPorDestino("Cancun");
        for (int i = 0 ; i < hotelesPorDestino.size() ; i++) {
            System.out.println(hotelesPorDestino.get(i).toString() + '\n');
        }

        System.out.println("===== Hoteles de 5 estrellas =====");
        ArrayList<Hotel> hotelesPorPuntuacion = hotelFachada.buscarHotelPorPuntuacion(5);
        for (int i = 0 ; i < hotelesPorPuntuacion.size() ; i++) {
            System.out.println(hotelesPorPuntuacion.get(i).toString() + '\n');
        }

        System.out.println("===== Reserva de habitacion =====");
        Hotel hotel = hotelesPorDestino.get(0); 
        hotelFachada.reservarHotel(hotel, 2, "2024-04-30", "2024-05-07");
        Reserva reserva = hotelFachada.getReserva(0);
        System.out.println("Se ha reservado en " + reserva.getHotel().getNombre());
        System.out.println("Numero de habitaciones " + reserva.getNumHabitaciones());
        System.out.println("Fecha inicio " + reserva.getFechaInicio());
        System.out.println("Fecha fin " + reserva.getFechaFin());
    }

}

