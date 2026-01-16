package com.Observer;

import com.Composite.Servicio;
import com.Factory.Mascota;

public class Reserva {

    private int id;
    private String fechaReserva;
    private double monto;
    private Servicio servicio;
    private Mascota mascota;
    private ManejarReserva manejador;

    public Reserva(int id, String fechaReserva, Servicio servicio, Mascota mascota) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.servicio = servicio;
        this.mascota = mascota;
        this.manejador = new ManejarReserva();
        this.monto = servicio.calcularPrecio(mascota);
    }

    public void confirmar() {
        manejador.notificar("", "Confirmación", "Reserva confirmada");
    }

    public void cancelar() {
        manejador.notificar("", "Cancelación", "Reserva cancelada");
    }

    public double calcularMonto() {
        return monto;
    }

    public ManejarReserva getManejador() {
        return manejador;
    }
}