package proyectoprogra2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventosManager {
    private static EventosManager instance;
    private List<eventosClass> eventosList;

    private EventosManager() {
        eventosList = new ArrayList<>();
    }

    public static EventosManager getInstance() {
        if (instance == null) {
            instance = new EventosManager();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date = null;
            try {
                date = formatter.parse("4-2-2024");
            } catch (ParseException ex) {
                Logger.getLogger(EventosManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            eventosClass evento = new eventosClass("0", "Evento de prueba", "Descripcion prueba", date, 22.3,
                    TipoEvento.SELECT, UsuariosManager.getCurrentUsuario());
            instance.addEvento(evento);
        }
        return instance;
    }

    public void addEvento(eventosClass evento) {
        eventosList.add(evento);
        // evento.imprimir();
    }

    public void removeEvento(eventosClass evento) {
        eventosList.remove(evento);
    }

    public List<eventosClass> getEventosList() {
        return eventosList;
    }

    public void setEventosList(List<eventosClass> eventosList) {
        this.eventosList = eventosList;
    }

    public eventosClass searchEvento(List<eventosClass> list, String code, int index) {
        if (index == list.size()) {
            return null;
        }

        if (list.get(index).getCodigo().equals(code)) {
            return list.get(index);
        }

        return searchEvento(list, code, index + 1);
    }
}
