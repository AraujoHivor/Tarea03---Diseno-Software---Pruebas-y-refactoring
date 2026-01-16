package com.Factory;

public class PerroFactory extends MascotaFactory {

    public PerroFactory() {
    }

    @Override
    public Mascota crearMascota(String nombre, int edad) {
        return new Perro(nombre, edad, "Grande");
    }
}
