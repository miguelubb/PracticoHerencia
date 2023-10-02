import java.util.ArrayList;

public class Viaje {
    private String origen;
    private String destino;
    private long precioNormal;
    private int capacidad;

    ArrayList<Pasajero> misPasajeros;

    public Viaje(String origen, String destino, long precioNormal, int capacidad) {
        this.origen = origen;
        this.destino = destino;
        this.precioNormal = precioNormal;
        this.capacidad = capacidad;
        misPasajeros=new ArrayList<>(capacidad);
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public long getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(long precioNormal) {
        this.precioNormal = precioNormal;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void planilla(){
        System.out.println("Listado de pasajeros");
        System.out.println("=====================================");
        System.out.println("         Origen : "+getOrigen());
        System.out.println("        Destino : "+getDestino());
        System.out.println("Total pasajeros : "+ misPasajeros.size());
        System.out.printf("%2s | %-13s | %-25s | %-14s | %-25s %n", "N°", "R.U.T","Nombre", "Telefono", "Nombre Contacto");
        System.out.println("-----------------------------------------------------------------------------------");
        int i=1;
        for (Pasajero pasajero : misPasajeros) {
            System.out.printf("%2d | %-13s | %-25s | %-14s | %-25s %n",
                    i++,
                    pasajero.getRut(),
                    pasajero.getNombre(),
                    pasajero.getTelefonoContacto(),
                    pasajero.getNombreContacto());
        }
    }

    public long recaudacion(){
        long out=0;
        for (Pasajero pasajero : misPasajeros) {
            out+=pasajero.tarifa(precioNormal);
        }
        return out;
    }

    public boolean subePasajero(Pasajero p){
        //pasajero no debe estar en el bus y el bus no debe estar lleno
        if(misPasajeros.contains(p) || capacidad<=misPasajeros.size()){
            return false;
        }
        return misPasajeros.add(p);
    }
    public boolean bajaPasajero(Pasajero p){
        return misPasajeros.remove(p);
    }


}
