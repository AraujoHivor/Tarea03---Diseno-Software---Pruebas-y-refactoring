package com.Strategy;

public class NotificadorEmail implements NotificadorStrategy {

    @Override
    public void notificar(ContenidoNotificacion contenido) {
        System.out.println("EMAIL a " + contenido.getDestinatario());
        System.out.println("Mensaje: " + contenido.getMensaje());
    }
}
