/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.util.ArrayList;
import java.util.List;

public class EventosReligiososManager {
    private static EventosReligiososManager instance;
    private List<EventosReligiosoClass> eventosList;

    private EventosReligiososManager() {
        eventosList = new ArrayList<>();
    }

    public static EventosReligiososManager getInstance() {
        if (instance == null) {
            instance = new EventosReligiososManager();
        }
        return instance;
    }

    public List<EventosReligiosoClass> getEventosList() {
        return eventosList;
    }

    public void addEvento(EventosReligiosoClass evento) {
        eventosList.add(evento);
    }

    public void removeEvento(EventosReligiosoClass evento) {
        eventosList.remove(evento);
    }

    public EventosReligiosoClass searchEvento(List<EventosReligiosoClass> list, String code, int index) {
        if (index == list.size()) {
            return null;
        }

        if (list.get(index).getCodigo().equals(code)) {
            return list.get(index);
        }

        return searchEvento(list, code, index + 1);
    }
}
