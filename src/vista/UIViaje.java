package vista;

import controlador.Controlador;

import java.util.Scanner;

public class UIViaje {
    private final Scanner  input;
    private final Controlador ctrl;
    public UIViaje(Scanner input){
        this.input=input;
        ctrl=Controlador.getInstance();
    }
    public void crearViaje(){
        System.out.println("Ingrese datos del viaje");
        System.out.println("Origen:");
        String origen=input.next();
        System.out.println("Destino:");
        String destino=input.next();
        System.out.println("Precio:");
        long precio=input.nextLong();
        System.out.println("Capacidad:");
        int cap=input.nextInt();
        if(ctrl.crearViaje(origen, destino, precio, cap)){
            System.out.println("Creación exitosa");
        }else{
            System.out.println("NO fue posible crear el viaje");
        }
    }
    public void listarViajes(){
        String[][] viajes=ctrl.listadoViajes();
        for (String[] viaje : viajes) {
            System.out.println(
                    viaje[0] + " " +
                    viaje[1] + " " +
                    viaje[2] + " " +
                    viaje[3] + " " +
                    viaje[4]);
        }
    }
}
