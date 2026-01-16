package com.Factory;

public class GatoFactory extends MascotaFactory {

    @Override
    public Mascota crearMascota(String nombre, int edad) {
        return new Gato(nombre, edad);
    }
}
