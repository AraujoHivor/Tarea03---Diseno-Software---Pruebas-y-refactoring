package com.Observer;

import java.util.ArrayList;
import java.util.List;

import com.Composite.Servicio;
import com.Factory.Mascota;

public class Reserva {

    private double monto;
    //Observers directamente en Reserva
    private List<ReservaListeners> observers = new ArrayList<>();

    public Reserva(int id, String fechaReserva, Servicio servicio, Mascota mascota) {
        this.monto = servicio.calcularPrecio(mascota);
    }

    //Métodos que antes estaban en ManejarReserva
    public void addObserver(ReservaListeners r) {
        observers.add(r);
    }

    public void removeObserver(ReservaListeners r) {
        observers.remove(r);
    }

    private void notificar(String mensaje) {
        for (ReservaListeners r : observers) {
            r.update(mensaje);
        }
    }

    public void confirmar() {
        notificar("Reserva confirmada");
    }

    public void cancelar() {
        notificar("Reserva cancelada");
    }

    public double calcularMonto() {
        return monto;
    }

    public Reserva getManejador() {
        throw new UnsupportedOperationException("Unimplemented method 'getManejador'");
    }

    
}
