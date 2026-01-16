package com.Factory;

public class Gato extends MascotaBase
        implements MascotaConPreferencias, MascotaConNecesidadesEspeciales {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Gato";
    }

    @Override
    public boolean tieneNecesidadesEspeciales() {
        return false;
    }

    @Override
    public String getPreferencias() {
        return "Ambientes tranquilos";
    }
}
