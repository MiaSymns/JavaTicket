package proyectoprogra2;

import java.util.Date;

public class EventosDeportivosClass extends eventosClass {
    private String nombreEquipoUno;
    private String nombreEquipoDos;
    private TipoEventoDeportivo tipoDeporte;
    private final int capacity = 20000;

    public EventosDeportivosClass(String codigo, String titulo, String descripcion, Date fecha, double montoAlquiler,
            TipoEvento tipoEvento,Usuarios user, TipoEventoDeportivo tipoDeporte, String nombreEquipoUno, String nombreEquipoDos) {
        super(codigo, titulo, descripcion, fecha, montoAlquiler, tipoEvento,user);
        this.tipoDeporte = tipoDeporte;
        this.nombreEquipoUno = nombreEquipoUno;
        this.nombreEquipoDos = nombreEquipoDos;
    }

    // Getter and setter for nombreEquipoUno
    public String getNombreEquipoUno() {
        return nombreEquipoUno;
    }

    public void setNombreEquipoUno(String nombreEquipoUno) {
        this.nombreEquipoUno = nombreEquipoUno;
    }

    // Getter and setter for nombreEquipoDos
    public String getNombreEquipoDos() {
        return nombreEquipoDos;
    }

    public void setNombreEquipoDos(String nombreEquipoDos) {
        this.nombreEquipoDos = nombreEquipoDos;
    }

    // Getter and setter for tipoDeporte
    public TipoEventoDeportivo getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(TipoEventoDeportivo tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    // Getter and setter for capacity
    public int getCapacity() {
        return capacity;
    }

}
