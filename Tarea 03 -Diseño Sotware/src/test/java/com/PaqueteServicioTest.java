
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.Composite.PaqueteServicio;
import com.Composite.ServicioBase;
import com.Factory.Mascota;
import com.Factory.Perro;

public class PaqueteServicioTest {

    @Test
    void PS1_addService_agregaServicio_retornaTrue() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");
        ServicioBase paseo = new ServicioBase("Paseo", 10);

        assertTrue(paquete.addService(paseo));
    }

    @Test
    void PS2_calcularPrecio_sumaServicios_correcto() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");
        paquete.addService(new ServicioBase("Paseo", 10));
        paquete.addService(new ServicioBase("Baño", 15));

        Mascota perro = new Perro("Max", 3, "Grande");

        assertEquals(25, paquete.calcularPrecio(perro));
    }

    @Test
    void PS3_calcularPrecio_paqueteVacio_retorna0() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");
        Mascota perro = new Perro("Max", 3, "Grande");

        assertEquals(0, paquete.calcularPrecio(perro));
    }

    @Test
    void PS4_esCompatible_todosCompatibles_true() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");
        paquete.addService(new ServicioBase("Paseo", 10));
        paquete.addService(new ServicioBase("Baño", 15));

        Mascota perro = new Perro("Max", 3, "Grande");
        assertTrue(paquete.esCompatible(perro));
    }

    @Test
    void PS5_esCompatible_unServicioIncompatible_false() {
        PaqueteServicio paquete = new PaqueteServicio("Paquete", "Combo");

        paquete.addService(new ServicioBase("Paseo", 10));
        paquete.addService(new com.Composite.Servicio() {
            @Override public String getNombre() { return "IncompatibleFake"; }
            @Override public double calcularPrecio(com.Factory.Mascota mascota) { return 5; }
            @Override public boolean esCompatible(com.Factory.Mascota mascota) { return false; }
        });

        Mascota perro = new Perro("Max", 3, "Grande");
        assertFalse(paquete.esCompatible(perro));
    }
}

