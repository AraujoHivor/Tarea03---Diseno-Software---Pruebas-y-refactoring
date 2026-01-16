package com.Factory;

public class PaseoFactory extends ServicioFactory {

    @Override
    public Servicio crearServicio() {
        return new Paseo();
    }
    
}