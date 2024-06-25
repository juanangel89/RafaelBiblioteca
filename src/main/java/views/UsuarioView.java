
package views;

import java.util.List;
import model.Usuario;

public class UsuarioView {
         public static void mostrarUsuarios(List<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            System.out.println("No hay Usuario disponibles.");
            
        } else {
            System.out.println("\n--- Lista de Libros ---");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario.getId() + ". " + usuario.getNombre()+ ". " + usuario.getEmail()+ ". " + usuario.getTelefono());
                
            }
        }
        
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
}
