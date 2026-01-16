package com.Strategy;

public class NotificadorWhatsapp implements NotificadorStrategy {

    @Override
    public void notificar(ContenidoNotificacion contenido) {
        System.out.println("WhatsApp enviado a " + contenido.getDestinatario());
        System.out.println("Mensaje: " + contenido.getMensaje());
    }
}
