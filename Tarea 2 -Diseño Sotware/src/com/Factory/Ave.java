package com.Factory;

public class Ave implements Mascota {
    private String nombre;
    private int edad;

    public Ave(String nombre, int edad) {
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
        return "Ave";
    }

    @Override
    public boolean getNecesidadesEspeciales() {
        return true;
    }

    @Override
    public String getTamanio() {
        return "Pequeño";
    }

    @Override
    public String getPreferencias() {
        return "Ambiente cerrado";
    }
}
