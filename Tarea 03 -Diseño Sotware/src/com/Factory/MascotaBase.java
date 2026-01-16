package com.Factory;

public abstract class MascotaBase implements Mascota {

    protected String nombre;
    protected int edad;

    public MascotaBase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }
}
