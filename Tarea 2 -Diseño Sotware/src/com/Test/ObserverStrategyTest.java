package com.tests;

import com.Composite.PaqueteServicio;
import com.Composite.Servicio;
import com.Composite.ServicioBase;
import com.Factory.Mascota;
import com.Factory.PerroFactory;
import com.Observer.Reserva;
import com.Observer.UsuarioListener;
import com.Strategy.NotificadorStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverStrategyTest {

    // Strategy fake para capturar mensajes
    static class NotificadorFake implements NotificadorStrategy {
        String ultimoDestino;
        String ultimoMensaje;

        @Override
        public void notificar(String destino, String mensaje) {
            this.ultimoDestino = destino;
            this.ultimoMensaje = mensaje;
        }
    }

    @Test
    void alConfirmarReservaSeNotificaAlUsuario() {
        Mascota perro = new PerroFactory().crearMascota("Max", "Labrador", 3, "", "Grande");

        Servicio paseo = new ServicioBase("Paseo", 10);
        PaqueteServicio paquete = new PaqueteServicio("Paquete Diario", "Diario");
        paquete.addService(paseo);

        Reserva reserva = new Reserva(1, "2025-01-10", paquete, perro);

        NotificadorFake fake = new NotificadorFake();
        UsuarioListener usuario = new UsuarioListener("usuario@email.com", fake);

        reserva.getManejador().addObserver(usuario);

        reserva.confirmar();

        assertEquals("usuario@email.com", fake.ultimoDestino);
        assertNotNull(fake.ultimoMensaje);
        assertFalse(fake.ultimoMensaje.isBlank());
    }
}
