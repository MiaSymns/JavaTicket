/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.util.ArrayList;
import java.util.List;

public class EventosMusicalManager {
    private static EventosMusicalManager instance;
    private List<EventosMusicalClass> eventosList;

    private EventosMusicalManager() {
        eventosList = new ArrayList<>();
    }

    public static EventosMusicalManager getInstance() {
        if (instance == null) {
            instance = new EventosMusicalManager();
        }
        return instance;
    }

    public List<EventosMusicalClass> getEventosList() {
        return eventosList;
    }

    public void addEvento(EventosMusicalClass evento) {
        eventosList.add(evento);
    }

    public void removeEvento(EventosMusicalClass evento) {
        eventosList.remove(evento);
    }

    public EventosMusicalClass searchEvento(List<EventosMusicalClass> list, String code, int index) {
        if (index == list.size()) {
            return null;
        }

        if (list.get(index).getCodigo().equals(code)) {
            return list.get(index);
        }

        return searchEvento(list, code, index + 1);
    }
}
