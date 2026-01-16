package com.Factory;

public class GatoFactory extends MascotaFactory {

    @Override
    public Mascota crearMascota(String nombre, String raza, int edad, String esp, String size) {
        return new Gato(nombre, edad);
    }
    
}