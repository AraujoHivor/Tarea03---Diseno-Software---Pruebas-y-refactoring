package com.tests;

import com.Composite.PaqueteServicio;
import com.Composite.Servicio;
import com.Composite.ServicioBase;
import com.Factory.Mascota;
import com.Factory.PerroFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {

    @Test
    void paqueteSumaPrecioDeServicios() {
        // mascota dummy (si tu calcularPrecio la necesita)
        Mascota perro = new PerroFactory().crearMascota("Max", "Labrador", 3, "", "Grande");

        Servicio paseo = new ServicioBase("Paseo", 10);
        Servicio bano  = new ServicioBase("Bano", 15);

        PaqueteServicio paquete = new PaqueteServicio("Paquete Diario", "Diario");
        paquete.addService(paseo);
        paquete.addService(bano);

        double total = paquete.calcularPrecio(perro);

        assertEquals(25.0, total, 0.0001);
    }
}
