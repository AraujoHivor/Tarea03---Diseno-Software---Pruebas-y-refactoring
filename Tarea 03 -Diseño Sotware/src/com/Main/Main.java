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

        //Factory refactorizada (ya no recibe parámetros innecesarios)
        PerroFactory factory = new PerroFactory();
        Mascota perro = factory.crearMascota("Max", 3);

        //Servicios base (Composite)
        Servicio paseo = new ServicioBase("Paseo", 10);
        Servicio baño = new ServicioBase("Baño", 15);

        PaqueteServicio paquete = new PaqueteServicio("Paquete Diario", "Diario");
        paquete.addService(paseo);
        paquete.addService(baño);

        //Reserva (Observer sin Middle Man)
        Reserva reserva = new Reserva(1, "2025-01-10", paquete, perro);

        //Listener refactorizado
        UsuarioListener usuario = new UsuarioListener("usuario@email.com", new NotificadorEmail());

        reserva.addObserver(usuario);

        reserva.confirmar();
    }
}
