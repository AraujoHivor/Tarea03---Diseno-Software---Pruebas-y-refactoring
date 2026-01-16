
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.Strategy.NotificadorEmail;
import com.Strategy.NotificadorWhatsapp;
import com.Strategy.NotificadorStrategy;

public class StrategyTest {

    @Test
    void ST1_notificarEmail_noFalla() {
        NotificadorStrategy email = new NotificadorEmail();
        assertDoesNotThrow(() -> email.notificar("test@mail.com", "Asunto", "Mensaje"));
    }

    @Test
    void ST2_notificarWhatsapp_noFalla() {
        NotificadorStrategy wa = new NotificadorWhatsapp();
        assertDoesNotThrow(() -> wa.notificar("0999999999", "Asunto", "Mensaje"));
    }

    @Test
    void ST3_strategyNull_lanzaExcepcion() {
        NotificadorStrategy strategy = null;
        assertThrows(NullPointerException.class, () -> strategy.notificar("x", "a", "m"));
    }
}

