package com.Factory;

public class Guarderia implements Servicio {

    @Override
    public boolean requiereVigilancia() {
        return true;
    }

    @Override
    public int maxMascotas() {
        return 10;
    }

    @Override
    public String nivelActividad() {
        return "Alta";
    }

}