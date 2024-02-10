/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author Mia Symns
 */
public class usuariosClass {
    // Atributos de la clase usuarios
    private String nombre;
    private String contra;
    private String tipo;

    // Consructor de la clase usuarios
    public usuariosClass(String nombre, String contra, String tipo) {
        this.nombre = nombre;
        this.contra = contra;
        this.tipo = tipo;
    }

    // Getters y setters de la clase usuarios
    public String getNombre() {
        return nombre;
    }

    public String getContra() {
        return contra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodo toString de la clase usuarios
    @Override
    public String toString() {
        return "usuariosClass{" + "nombre=" + nombre + ", contra=" + contra + ", tipo=" + tipo + '}';
    }

}
