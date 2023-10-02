import java.util.ArrayList;

public class ViajeTest {
    public static void main(String[] args) {
        ArrayList<Pasajero> misPasajeros=new ArrayList<>();
        ArrayList<Viaje> misViajes=new ArrayList<>();
        misPasajeros.add(new Normal("11.111.111-1",
                "Rosa Espinoza", "+569 1111 1111","Ariel Espinoza"));
        misPasajeros.add(new Normal("22.222.222-2", "Antonio Parada",
                "+569 2222 2222", "Mariela Arriagada"));
        misPasajeros.add(new Escolar("33.333.333-3", "Nelson Aristia",
                "+569 3333 3333","Consuelo Aristia","basica"));
        misPasajeros.add(new Escolar("44.444.444-4", "Ana Garrido",
                "+569 4444 4444", "Soledad Garrido", "media"));
        misPasajeros.add(new Escolar("55.555.555-5", "Elena Aedo",
                "+569 5555 5555", "Adolfo Aedo", "universitaria"));
        misPasajeros.add(new TerceraEdad("77.777.777-7","Esteban Vásquez",
                "+569 7777 7777", "Eduardo Velásquez"));
        Viaje elViaje=new Viaje("Chillán", "Santiago", 25000, 20);
        elViaje.subePasajero(misPasajeros.get(1));
        elViaje.subePasajero(misPasajeros.get(2));
        elViaje.planilla();

    }
}
