package com.Composite;
import com.Factory.Mascota;

public class ServicioBase implements Servicio {

    protected String nombre;
    protected double precioBase;
    protected String tipo;

    public ServicioBase(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPrecio(Mascota mascota) {
        return precioBase;
    }

    @Override
    public boolean esCompatible(Mascota mascota) {
        return true;
    }
}