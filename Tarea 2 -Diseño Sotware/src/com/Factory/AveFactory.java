package com.Factory;

public class AveFactory extends MascotaFactory {

    @Override
    public Mascota crearMascota(String nombre, String raza, int edad, String esp, String size) {
        return new Ave(nombre, edad);
    }
    
}