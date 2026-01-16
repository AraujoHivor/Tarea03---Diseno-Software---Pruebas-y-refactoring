package com.Strategy;

public class Notificacion {

    private String destinatario;
    private String asunto;
    private String mensaje;
    private NotificadorStrategy strategy;

    public Notificacion(String destinatario, String asunto, String mensaje) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public void setStrategy(NotificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public void notificar(String destinatario, String asunto, String mensaje) {
        
        if (strategy == null) {
            throw new IllegalStateException("No se ha definido una estrategia de notificación");
        }
        strategy.notificar(destinatario, asunto, mensaje);
    }

}