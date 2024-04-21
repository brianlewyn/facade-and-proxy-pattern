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
    }

}
