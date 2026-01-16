package com.Composite;
import java.util.ArrayList;
import java.util.List;

import com.Factory.Mascota;

public class PaqueteServicio implements Servicio {

    private String nombre;
    // private String tipo;  Eliminado (No aporta en nada)
    private List<Servicio> servicios = new ArrayList<>();

    public PaqueteServicio(String nombre, String tipo) {
        this.nombre = nombre;
    }

    public boolean addService(Servicio servicio) {
        return servicios.add(servicio);
    }

    public boolean removeService(Servicio servicio) {
        return servicios.remove(servicio);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPrecio(Mascota mascota) {
        double total = 0;
        for (Servicio s : servicios) {
            total += s.calcularPrecio(mascota);
        }
        return total;
    }

    @Override
    public boolean esCompatible(Mascota mascota) {
        for (Servicio s : servicios) {
            if (!s.esCompatible(mascota)) {
                return false;
            }
        }
        return true;
    }
}
