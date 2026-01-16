

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Composite.PaqueteServicio;
import com.Composite.ServicioBase;
import com.Factory.Mascota;
import com.Factory.PerroFactory;
import com.Observer.Reserva;
import com.Observer.ReservaListeners;

class ReservaTest {

    static class FakeListener implements ReservaListeners {
        int calls = 0;
        String lastMessage = null;

        @Override
        public void update(String mensaje) {
            calls++;
            lastMessage = mensaje;
        }
    }

    @Test
    void R1_confirmar_reservaValida_observadoresNotificados() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");
        paquete.addService(new ServicioBase("Paseo", 10));
        Mascota mascota = new PerroFactory().crearMascota("Max", 3);

        Reserva reserva = new Reserva(1, "2026-01-14", paquete, mascota);

        FakeListener listener = new FakeListener();
        reserva.getManejador().addObserver(listener);

        reserva.confirmar();

        assertEquals(1, listener.calls);
        assertEquals("Reserva confirmada", listener.lastMessage);
    }

    @Test
    void R2_cancelar_reservaValida_observadoresNotificados() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");
        paquete.addService(new ServicioBase("Baño", 15));
        Mascota mascota = new PerroFactory().crearMascota("Max", 3);

        Reserva reserva = new Reserva(2, "2026-01-14", paquete, mascota);

        FakeListener listener = new FakeListener();
        reserva.getManejador().addObserver(listener);
        reserva.cancelar();

        assertEquals(1, listener.calls);
        assertEquals("Reserva cancelada", listener.lastMessage);
    }

    @Test
    void R3_calcularMonto_servicioPaquete25_retorna25() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");
        paquete.addService(new ServicioBase("Paseo", 10));
        paquete.addService(new ServicioBase("Baño", 15));

        Mascota mascota = new PerroFactory().crearMascota("Max", 3);

        Reserva reserva = new Reserva(3, "2026-01-14", paquete, mascota);

        assertEquals(25.0, reserva.calcularMonto());
    }

    @Test
    void R4_confirmar_sinObserversRegistrados_noProduceError() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");
        paquete.addService(new ServicioBase("Paseo", 10));
        Mascota mascota = new PerroFactory().crearMascota("Max", 3);

        Reserva reserva = new Reserva(4, "2026-01-14", paquete, mascota);

        assertDoesNotThrow(reserva::confirmar);
    }
}

