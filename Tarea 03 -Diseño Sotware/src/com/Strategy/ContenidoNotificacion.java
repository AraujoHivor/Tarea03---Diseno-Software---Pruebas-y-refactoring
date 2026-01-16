package com.Strategy;

public class ContenidoNotificacion {

    private final String destinatario;
    private final String mensaje;

    public ContenidoNotificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }
}
