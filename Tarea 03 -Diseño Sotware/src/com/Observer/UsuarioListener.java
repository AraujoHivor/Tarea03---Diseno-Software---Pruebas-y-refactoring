package com.Observer;
import com.Strategy.NotificadorStrategy;

public class UsuarioListener implements ReservaListeners {

    private NotificadorStrategy notificador;
    private String destinatario;

    public UsuarioListener(String destinatario, NotificadorStrategy notificador) {
        this.destinatario = destinatario;
        this.notificador = notificador;
    }

    @Override
    public void update(String mensaje) {
        notificador.notificar(destinatario, "Notificación Reserva", mensaje);
    }
    
}