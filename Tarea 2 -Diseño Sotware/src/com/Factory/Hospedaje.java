package com.Factory;

public class Hospedaje implements Servicio {

    @Override
    public boolean requiereVigilancia() {
        return true;
    }

    @Override
    public int maxMascotas() {
        return 5;
    }

    @Override
    public String nivelActividad() {
        return "Media";
    }

}