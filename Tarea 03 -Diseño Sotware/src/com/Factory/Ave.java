package com.Factory;

public class Ave extends MascotaBase
        implements MascotaConPreferencias, MascotaConNecesidadesEspeciales {

    public Ave(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Ave";
    }

    @Override
    public boolean tieneNecesidadesEspeciales() {
        return true;
    }

    @Override
    public String getPreferencias() {
        return "Ambiente cerrado";
    }
}
