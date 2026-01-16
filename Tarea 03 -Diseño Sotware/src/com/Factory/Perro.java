package com.Factory;

public class Perro extends MascotaBase
        implements MascotaConTamanio, MascotaConPreferencias, MascotaConNecesidadesEspeciales {

    private String tamanio;

    public Perro(String nombre, int edad, String tamanio) {
        super(nombre, edad);
        this.tamanio = tamanio;
    }

    @Override
    public String getEspecie() {
        return "Perro";
    }

    @Override
    public boolean tieneNecesidadesEspeciales() {
        return false;
    }

    @Override
    public String getTamanio() {
        return tamanio;
    }

    @Override
    public String getPreferencias() {
        return "Paseos y juegos";
    }
}
