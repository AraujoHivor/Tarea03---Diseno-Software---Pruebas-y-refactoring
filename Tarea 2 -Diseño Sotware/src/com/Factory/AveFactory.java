package com.Factory;

public class AveFactory extends MascotaFactory {

    @Override
    public Mascota crearMascota(String nombre, int edad) {
        return new Ave(nombre, edad);
    }
}
