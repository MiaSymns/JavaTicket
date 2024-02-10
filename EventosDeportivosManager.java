/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.util.ArrayList;
import java.util.List;

public class EventosDeportivosManager {
    private static EventosDeportivosManager instance;
    private List<EventosDeportivosClass> eventosDeportivosList;

    private EventosDeportivosManager() {
        eventosDeportivosList = new ArrayList<>();
    }

    public static EventosDeportivosManager getInstance() {
        if (instance == null) {
            instance = new EventosDeportivosManager();
            // create a new event with 0
        }
        return instance;
    }

    public List<EventosDeportivosClass> getEventosList() {
        return eventosDeportivosList;
    }

    // Modify addEvento method to accept an existing EventosDeportivosClass object
    public void addEvento(EventosDeportivosClass evento) {
        // evento.imprimir();
        eventosDeportivosList.add(evento);
    }

    public void removeEvento(EventosDeportivosClass evento) {
        eventosDeportivosList.remove(evento);
    }

    // search with code
    public EventosDeportivosClass searchEvento(List<EventosDeportivosClass> list, String code, int index) {
        if (index == list.size()) {
            return null;
        }

        if (list.get(index).getCodigo().equals(code)) {
            return list.get(index);
        }

        return searchEvento(list, code, index + 1);
    }
}
