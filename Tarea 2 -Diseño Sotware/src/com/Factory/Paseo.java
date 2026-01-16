package com.Factory;

public class Paseo implements Servicio {

    @Override
    public boolean requiereVigilancia() {
        return false;
    }

    @Override
    public int maxMascotas() {
        return 1;
    }

    @Override
    public String nivelActividad() {
        return "Alta";
    }

}
