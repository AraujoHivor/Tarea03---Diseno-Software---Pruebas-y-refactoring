package com.Factory;

public class Gato implements Mascota{
    
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
        return "Gato";
    }

    @Override
    public boolean getNecesidadesEspeciales() {
        return false;
    }

    @Override
    public String getTamanio() {
        return "Pequeño";
    }

    @Override
    public String getPreferencias() {
        return "Ambientes tranquilos";
    }

}
