package vista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        UIViaje vista=new UIViaje(sc);
        int op;
        do{
            System.out.println("menu");
            System.out.println("1.- crear viaje");
            System.out.println("2.- listar viaje");
            System.out.println("3.- Salir");
            System.out.print("Ingrese opcion:");
            op=sc.nextInt();
            switch (op) {
                case 1 -> vista.crearViaje();
                case 2 -> vista.listarViajes();
                default -> System.out.println("Adios");
            }
        }while(op!=3);

    }
}
