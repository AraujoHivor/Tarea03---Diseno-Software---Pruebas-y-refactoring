package com.Factory;

public class Perro implements Mascota {
    private String nombre;
    private int edad;
    private String tamanio;

    public Perro(String nombre, int edad, String tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    @Override
    public boolean esCompatibleCon() {
        return true;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getEspecie() {
        return "Perro";
    }

    @Override
    public boolean getNecesidadesEspeciales() {
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
