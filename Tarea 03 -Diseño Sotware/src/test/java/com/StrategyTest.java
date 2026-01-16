
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.Strategy.ContenidoNotificacion;
import com.Strategy.NotificadorEmail;
import com.Strategy.NotificadorWhatsapp;
import com.Strategy.NotificadorStrategy;

public class StrategyTest {
    

    @Test
    void ST1_notificarEmail_noFalla() {
        ContenidoNotificacion c = new ContenidoNotificacion("destino", "Mensaje");
        NotificadorStrategy email = new NotificadorEmail();
        assertDoesNotThrow(() -> email.notificar(c));
    }

    @Test
    void ST2_notificarWhatsapp_noFalla() {
        ContenidoNotificacion c = new ContenidoNotificacion("destino", "Mensaje");
        NotificadorStrategy wa = new NotificadorWhatsapp();
        assertDoesNotThrow(() -> wa.notificar(c));
    }

    @Test
    void ST3_strategyNull_lanzaExcepcion() {
        ContenidoNotificacion c = new ContenidoNotificacion("destino", "m");
        NotificadorStrategy strategy = null;
        assertThrows(NullPointerException.class, () -> strategy.notificar(c));
    }
}

