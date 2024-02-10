package proyectoprogra2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuariosManager extends Usuarios {
    private static UsuariosManager instance;
    private static ArrayList<Usuarios> usuariosList; // List of Usuarios

    private UsuariosManager() {
        super("ADMIN", "ADMINISTRADOR", "supersecreto", 100, TipoUsuario.ADMINISTRADOR); // Dummy initialization for
                                                                                         // extension purposes
        usuariosList = new ArrayList<>(); // Initialize the list
        // Add default admin user
        usuariosList.add(this);
    }

    public static UsuariosManager getInstance() {
        if (instance == null) {
            instance = new UsuariosManager();
        }
        return instance;
    }

    public static ArrayList<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public static void setUsuariosList(ArrayList<Usuarios> list) {
        usuariosList = list;
    }

    public void addUsuario(Usuarios usuario) {
        if (usuariosList == null) {
            usuariosList = new ArrayList<>();
        }
        for (Usuarios existingUser : usuariosList) {
            if (existingUser.getUsername().equals(usuario.getUsername())) {
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        usuariosList.add(usuario);
    }
public boolean usuarioExiste(String username) {
    if (usuariosList != null) {
        for (Usuarios usuario : usuariosList) {
            if (usuario.getUsername().equals(username)) {
                return true;
            }
        }
    }
    return false;
}
    public void removeUsuario(Usuarios usuario) {
        if (usuariosList != null) {
            usuariosList.remove(usuario);
        }
    }

    public Usuarios findUsuarioByUsername(String username) {
        if (usuariosList != null) {
            for (Usuarios usuario : usuariosList) {
                if (usuario.getUsername().equals(username)) {
                    return usuario;
                }
            }
        }
        return null;
    }

    public static Usuarios validateLogin(String username, String password) {
        // Get the list of users
        ArrayList<Usuarios> usersList = getUsuariosList();
        for (Usuarios usersList1 : usersList) {
            System.out.println(usersList1.getNombreCompleto());
        }
        // Iterate through the list of users to find a match
        for (Usuarios user : usersList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Return the user if the credentials match
            }
        }

        // Return null if no user with matching credentials is found
        return null;
    }

}
