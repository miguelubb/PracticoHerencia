package modelo;

import java.util.Objects;

public abstract class Pasajero {
    private String rut;
    private String nombre;
    private String telefonoContacto;
    private String nombreContacto;

    public abstract long tarifa(long precioNormal);

    public Pasajero(String rut, String nombre, String telefonoContacto, String nombreContacto) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefonoContacto = telefonoContacto;
        this.nombreContacto = nombreContacto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasajero pasajero)) return false;
        return rut.equals(pasajero.rut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rut);
    }


}
