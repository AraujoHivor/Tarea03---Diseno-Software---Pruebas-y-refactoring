
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.Composite.ServicioBase;
import com.Factory.Mascota;
import com.Factory.Perro;

public class ServicioBaseTest {

    @Test
    void SB1_calcularPrecio_conMascotaPerro_retornaPrecioBase() {
        ServicioBase paseo = new ServicioBase("Paseo", 10);
        Mascota perro = new Perro("Max", 3, "Grande");

        assertEquals(10, paseo.calcularPrecio(perro));
    }

    @Test
    void SB2_calcularPrecio_conMascotaNull_noFalla_yRetornaPrecioBase() {
        ServicioBase paseo = new ServicioBase("Paseo", 10);

        assertDoesNotThrow(() -> paseo.calcularPrecio(null));
        assertEquals(10, paseo.calcularPrecio(null));
    }

    @Test
    void SB3_getNombre_retornaNombreCorrecto() {
        ServicioBase paseo = new ServicioBase("Paseo", 10);

        assertEquals("Paseo", paseo.getNombre());
    }

    @Test
    void SB4_esCompatible_porDefecto_true() {
        ServicioBase paseo = new ServicioBase("Paseo", 10);
        Mascota gato = new com.Factory.Gato("Michi", 2);

        assertTrue(paseo.esCompatible(gato));
    }
}