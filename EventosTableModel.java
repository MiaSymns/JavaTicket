/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EventosTableModel extends AbstractTableModel {
    private List<eventosClass> eventosList;
    private String[] columnNames;

    public EventosTableModel(List<eventosClass> eventosList, String[] columnNames) {
        this.eventosList = eventosList;
        this.columnNames = columnNames;
    }

    @Override
    public int getRowCount() {
        return eventosList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        eventosClass evento = eventosList.get(rowIndex);
        EventosDeportivosClass eventoDeportivo = EventosDeportivosManager.getInstance().searchEvento(EventosDeportivosManager.getInstance().getEventosList(), evento.getCodigo(), 0);
        EventosMusicalClass eventoMusical = EventosMusicalManager.getInstance().searchEvento(EventosMusicalManager.getInstance().getEventosList(), evento.getCodigo(), 0);
        EventosReligiosoClass eventoReligioso = EventosReligiososManager.getInstance().searchEvento(EventosReligiososManager.getInstance().getEventosList(), evento.getCodigo(), 0);
        switch (columnIndex) {
            case 0: return evento.getCodigo();
            case 1: return evento.getTitulo();
            case 2: return evento.getDescripcion();
            case 3: return evento.getFechaSimpleDateFormat();
            case 4: return evento.getMontoAlquiler();
            case 5: return evento.getTipoEvento();
            case 6: return evento.getCreatedBy().getNombreCompleto();
            case 7:
                // Capacity column
                switch (evento.getTipoEvento()) {
                    case DEPORTIVO: return eventoDeportivo.getCapacity();
                    case MUSICAL: return eventoMusical.getCapacity();
                    case RELIGIOSO: return eventoReligioso.getCapacity();
                    default: return null;
                }
            case 8:
                return (evento.getTipoEvento() == TipoEvento.DEPORTIVO) ? eventoDeportivo.getTipoDeporte() : null;
            case 9:
                return (evento.getTipoEvento() == TipoEvento.DEPORTIVO) ? eventoDeportivo.getNombreEquipoUno() : null;
            case 10:
                return (evento.getTipoEvento() == TipoEvento.DEPORTIVO) ? eventoDeportivo.getNombreEquipoDos() : null;
            case 11:
                return (evento.getTipoEvento() == TipoEvento.MUSICAL) ? eventoMusical.getTipoMusical() : null;
            case 12:
                return evento.getIsActive();
            default: return null;
        }
        
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}