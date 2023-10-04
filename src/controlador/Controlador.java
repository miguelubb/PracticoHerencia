package controlador;
import modelo.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

//patrón Singleton
public class Controlador {
    //1° gurdar la única instancia
    private static Controlador instance=null;
    ArrayList<Viaje> viajes;
    ArrayList<Pasajero> personas;
    //2° constructor privado
    private Controlador(){
        //inicializar variables...
        viajes=new ArrayList<>();
        personas=new ArrayList<>();
    }
    //3° método estático getInstancia
    public static Controlador getInstance(){
        if(instance==null){
            instance=new Controlador();
        }
        return instance;
    }

    /*

     */
    public boolean crearViaje(String origen, String destino,
                              long precioNormal, int capacidad ){
        Viaje nuevo=new Viaje(origen, destino, precioNormal, capacidad);
        return viajes.add(nuevo);
    }

    public String[][] listadoViajes(){
        String[][] out=new String[viajes.size()][5];
        int i=0;
        for (Viaje viaje : viajes) {
            out[i][0]=viaje.getOrigen();
            out[i][1]=viaje.getDestino();
            out[i][2]= String.valueOf(viaje.getPrecioNormal());
            out[i][3]= String.valueOf(viaje.getCapacidad());
            out[i][4]= String.valueOf(viaje.disponibles());
            i++;
        }
        return out;
    }
}
