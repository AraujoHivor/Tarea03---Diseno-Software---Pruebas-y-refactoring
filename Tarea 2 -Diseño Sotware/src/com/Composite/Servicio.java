package com.Composite;
import com.Factory.Mascota;

public interface Servicio {
    String getNombre();
    double calcularPrecio(Mascota mascota);
    boolean esCompatible(Mascota mascota);
}