package com.Strategy;

public class Notificacion {

    private ContenidoNotificacion contenido;
    private NotificadorStrategy strategy;

    public Notificacion(ContenidoNotificacion contenido) {
        this.contenido = contenido;
    }

    public void setStrategy(NotificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public void notificar() {
        if (strategy == null) {
            throw new IllegalStateException("No se ha definido una estrategia de notificación");
        }
        strategy.notificar(contenido);
    }
}
