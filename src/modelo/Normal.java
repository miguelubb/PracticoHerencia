package modelo;

public class Normal extends Pasajero{
    public Normal(String rut, String nombre, String telefonoContacto, String nombreContacto) {
        super(rut, nombre, telefonoContacto, nombreContacto);
    }

    @Override
    public long tarifa(long precioNormal) {
        return precioNormal;
    }
}
