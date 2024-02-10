
package proyectoprogra2;

import java.util.ArrayList;
import java.util.Arrays;

public class Usuarios {

    private static Usuarios currentUsuario; // Singleton instance
    private static ArrayList<Usuarios> usuariosList; // List of Usuarios

    private String nombreCompleto;
    private String username;
    private String password;
    private int edad;
    private TipoUsuario tipoUsuario;
    private ArrayList<Integer> idsEventosCreados;

    Usuarios(String nombreCompleto, String username, String password, int edad, TipoUsuario tipoUsuario) {
        this.nombreCompleto = nombreCompleto;
        this.username = username;
        this.password = password;
        this.edad = edad;
        this.tipoUsuario = tipoUsuario;
        this.idsEventosCreados = new ArrayList<>();
    }

    public static Usuarios getCurrentUsuario() {
        return currentUsuario;
    }

    public static void setCurrentUsuario(Usuarios usuario) {
        currentUsuario = usuario;
    }

    public static ArrayList<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public static void setUsuariosList(ArrayList<Usuarios> list) {
        usuariosList = list;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public ArrayList<Integer> getIdsEventosCreados() {
        return idsEventosCreados;
    }

    public void addIdEventoCreado(int idEvento) {
        if (!idsEventosCreados.contains(idEvento)) {
            idsEventosCreados.add(idEvento);
        }
    }

    // Método para imprimir los datos del usuario

    public void imprimir() {
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo de usuario: " + tipoUsuario);
        System.out.println("IDs de eventos creados: " + Arrays.toString(idsEventosCreados.toArray()));
    }
}
