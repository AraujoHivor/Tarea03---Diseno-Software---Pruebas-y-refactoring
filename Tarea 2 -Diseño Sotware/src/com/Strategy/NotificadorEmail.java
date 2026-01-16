package com.Strategy;

public class NotificadorEmail implements NotificadorStrategy {

    @Override
    public void notificar(String destinatario, String asunto, String mensaje) {
        System.out.println("Email enviado a " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
    }

}