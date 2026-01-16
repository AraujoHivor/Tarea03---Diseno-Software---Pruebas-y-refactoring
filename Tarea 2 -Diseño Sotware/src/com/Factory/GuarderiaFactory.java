package com.Factory;

public class GuarderiaFactory extends ServicioFactory {

    @Override
    public Servicio crearServicio() {
        return new Guarderia();
    }
    
}