package modelo;

public class TerceraEdad extends Pasajero{
    public TerceraEdad(String rut, String nombre, String telefonoContacto, String nombreContacto) {
        super(rut, nombre, telefonoContacto, nombreContacto);
    }

    @Override
    public long tarifa(long precioNormal) {
        return (long)(precioNormal*0.4);
    }
}
