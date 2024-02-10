/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.util.Date;

public class EventosReligiosoClass extends eventosClass {
    private final int capacity = 30000;

    public EventosReligiosoClass(String codigo, String titulo, String descripcion, Date fecha, double montoAlquiler,
            TipoEvento tipoEvento,Usuarios user) {
        super(codigo, titulo, descripcion, fecha, montoAlquiler, tipoEvento,user);
        //this.capacity = 30000;
    }
    public int getCapacity() {
        return capacity;
    }
}
