package com.Factory;

public class HospedajeFactory extends ServicioFactory {

    @Override
    public Servicio crearServicio() {
        return new Hospedaje();
    }
    
}