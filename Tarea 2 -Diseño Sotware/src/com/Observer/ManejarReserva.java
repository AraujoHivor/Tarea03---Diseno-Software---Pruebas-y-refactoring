package com.Observer;
import java.util.ArrayList;
import java.util.List;

public class ManejarReserva {

    private List<ReservaListeners> observers = new ArrayList<>();

    public void addObserver(ReservaListeners r) {
        observers.add(r);
    }

    public void removeObserver(ReservaListeners r) {
        observers.remove(r);
    }

    public void notificar(String desti, String asunto, String mensaje) {
        for (ReservaListeners r : observers) {
            r.update(mensaje);
        }
    }
}