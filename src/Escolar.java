
public class Escolar extends Pasajero{
    String nivelEscolar;

    public Escolar(String rut, String nombre, String telefonoContacto, String nombreContacto, String nivelEscolar) {
        super(rut, nombre, telefonoContacto, nombreContacto);
        this.nivelEscolar=nivelEscolar;
    }

    @Override
    public long tarifa(long precioNormal) {
        double desc=0.0;
        switch (nivelEscolar){
            case "basica": desc=1;break;
            case "media": desc=0.60;break;
            case "universitaria": desc=0.5;break;
        }
        return (long)(precioNormal*(1-desc));
    }
}
