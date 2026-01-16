
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.Factory.GatoFactory;
import com.Factory.PerroFactory;
import com.Factory.Mascota;

public class MascotaFactoryTest {

    @Test
    void FM1_crearPerroFactory_creaPerro() {
        Mascota m = new PerroFactory().crearMascota("Max",3);
        assertNotNull(m);
        assertEquals("Max", m.getNombre());
    }

    @Test
    void FM2_crearGatoFactory_creaGato() {
        Mascota m = new GatoFactory().crearMascota("Michi",2);
        assertNotNull(m);
        assertEquals("Michi", m.getNombre());
    }

    @Test
    void FM3_nombreVacio_seCreaIgual() {
        Mascota m = new PerroFactory().crearMascota("",3);
        assertNotNull(m);
        assertEquals("", m.getNombre());
    }

    @Test
    void FM4_edadNegativa_seCreaIgual_oSeControla() {
        Mascota m = new GatoFactory().crearMascota("Michi",3);
        assertNotNull(m);

    }
}
