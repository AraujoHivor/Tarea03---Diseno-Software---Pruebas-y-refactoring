package com.Main;

import com.Composite.PaqueteServicio;
import com.Composite.Servicio;
import com.Composite.ServicioBase;
import com.Factory.Mascota;
import com.Factory.PerroFactory;
import com.Observer.Reserva;
import com.Observer.UsuarioListener;
import com.Strategy.NotificadorEmail;

public class Main {

    public static void main(String[] args) {

        PerroFactory factory = new PerroFactory();
        Mascota perro = factory.crearMascota("Max", "Labrador", 3, "", "Grande");

        Servicio paseo = new ServicioBase("Paseo", 10);
        Servicio baño = new ServicioBase("Baño", 15);

        PaqueteServicio paquete = new PaqueteServicio("Paquete Diario", "Diario");
        paquete.addService(paseo);
        paquete.addService(baño);

        Reserva reserva = new Reserva(1, "2025-01-10", paquete, perro);

        UsuarioListener usuario =
                new UsuarioListener("usuario@email.com", new NotificadorEmail());

        reserva.getManejador().addObserver(usuario);

        reserva.confirmar();
    }
}
