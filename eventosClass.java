/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 *
 * @author Mia Symns
 */
public class eventosClass {
    private String codigo;
    private String titulo;
    private String descripcion;
    private Date fecha;
    private double montoAlquiler;
    private TipoEvento tipoEvento;
    private boolean isActive;
    private Usuarios createdBy;

    public eventosClass(String codigo, String titulo, String descripcion, Date fecha, double montoAlquiler,
        TipoEvento tipoEvento, Usuarios createdBy) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.montoAlquiler = montoAlquiler;
        this.tipoEvento = tipoEvento;
        this.isActive = false;
        this.createdBy = createdBy;
        try {
            String codigoSinPrefijo = codigo.replace("EVT-", "");
            int codigoInt = Integer.parseInt(codigoSinPrefijo);
            Usuarios.getCurrentUsuario().addIdEventoCreado(codigoInt);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + codigo + " no es un número válido.");
        }
    }

    //make getter and setter for createdby
    public Usuarios getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Usuarios user){
        this.createdBy = user;
    }

    public void setIsActive(boolean b) {
        this.isActive = b;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }
    public String getFechaSimpleDateFormat() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    return formatter.format(fecha);
}

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    // Métodos específicos para cada tipo de evento

    public String[] getNombresEquipos() {
        // Código para eventos deportivos
        return new String[] { "Equipo 1", "Equipo 2" };
    }

    // Método para imprimir los datos del evento

    public void imprimir() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha: " + fecha);
        System.out.println("Monto de alquiler: " + montoAlquiler);
        System.out.println("Tipo de evento: " + tipoEvento);

        // Código para imprimir datos específicos de cada tipo de evento
        // switch (tipoEvento) {
        // case DEPORTIVO:
        // System.out.println("Nombres de los equipos: " +
        // Arrays.toString(getNombresEquipos()));
        // break;
        // case MUSICAL:
        // break;
        // case RELIGIOSO:
        // break;
        // }
    }
}
