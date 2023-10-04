package modelo;

public class Escolar extends Pasajero{
    String nivelEscolar;

    public Escolar(String rut, String nombre, String telefonoContacto, String nombreContacto, String nivelEscolar) {
        super(rut, nombre, telefonoContacto, nombreContacto);
        this.nivelEscolar=nivelEscolar;
    }

    @Override
    public long tarifa(long precioNormal) {
        double desc = switch (nivelEscolar) {
            case "basica" -> 1;
            case "media" -> 0.60;
            case "universitaria" -> 0.5;
            default -> 0.0;
        };
        return (long)(precioNormal*(1-desc));
    }
}
