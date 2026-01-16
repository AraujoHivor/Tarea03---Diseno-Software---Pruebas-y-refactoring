package com.Strategy;

public class DatosNotificacion {

    private String destinatario;
    private String asunto;
    private String mensaje;
    private CanalNotificacion canal;

    public DatosNotificacion(String destinatario, String asunto, String mensaje, CanalNotificacion canal) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.canal = canal;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public CanalNotificacion getCanal() {
        return canal;
    }
}

