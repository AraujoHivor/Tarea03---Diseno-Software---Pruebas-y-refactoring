package com.Factory;

public class PerroFactory extends MascotaFactory {

    @Override
    public Mascota crearMascota(String nombre, String raza, int edad, String esp, String size) {
        return new Perro(nombre, edad, size);
    }
    
}