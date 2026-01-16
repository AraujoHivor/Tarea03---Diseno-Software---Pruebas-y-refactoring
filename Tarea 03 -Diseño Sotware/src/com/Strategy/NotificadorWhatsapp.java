package com.Strategy;

public class NotificadorWhatsapp implements NotificadorStrategy {

    @Override
    public void notificar(String destinatario, String asunto, String mensaje) {
        System.out.println("WhatsApp enviado a " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
    
}