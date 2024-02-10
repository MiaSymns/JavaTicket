package proyectoprogra2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventosMusicalClass extends eventosClass {
    private TipoMusical tipoMusical;
    private final int capacity = 25000;

    public EventosMusicalClass(String codigo, String titulo, String descripcion, Date fecha, double montoAlquiler,
            TipoEvento tipoEvento,Usuarios user, TipoMusical tipomusica) {

        super(codigo, titulo, descripcion, fecha, montoAlquiler, tipoEvento,user);
        // double total = (montoAlquiler*0.3)+montoAlquiler;
        this.tipoMusical = tipomusica;
        //this.capacity = 25000;
    }

    // Getter and setter for tipoMusical
    public TipoMusical getTipoMusical() {
        return tipoMusical;
    }

    public void setTipoMusical(TipoMusical tipoMusical) {
        this.tipoMusical = tipoMusical;
    }

    // Getter and setter for capacity
    public int getCapacity() {
        return capacity;
    }

}
