package com.Observer;

import com.Strategy.ContenidoNotificacion;
import com.Strategy.NotificadorStrategy;

public class UsuarioListener implements ReservaListeners {

    private final String destinatario;
    private final NotificadorStrategy notificador;

    public UsuarioListener(String destinatario, NotificadorStrategy notificador) {
        this.destinatario = destinatario;
        this.notificador = notificador;
    }

    @Override
    public void update(String mensaje) {
        ContenidoNotificacion contenido =
                new ContenidoNotificacion(destinatario, mensaje);

        notificador.notificar(contenido);
    }
}
