
package controller;
import dao.UsuarioDAO;
import model.Usuario;
import views.UsuarioView;
import java.util.List;


public class UsuarioController {
    public UsuarioDAO usuarioDAO;
    
        public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }
           public void crearUsuarioButton(String nombre, String email, String telefono) {
        Usuario usuario = new Usuario(0, nombre, email, telefono);
        usuarioDAO.crearUsuario(usuario);
    }
        
    public List<Usuario> leerUsuariosButton() {      
        List<Usuario> usuarios = usuarioDAO.leerUsuarios();
        UsuarioView.mostrarUsuarios(usuarios);
        return usuarios;
    }
   
    public void actualizarUsuarioButton(int id, String nombre, String email, String telefono) {
        Usuario usuario = new Usuario(id, nombre,email,telefono);
        usuarioDAO.actualizarUsuario(usuario);
    }

    public void eliminarUsuarioButton(int ID) {
        int id = ID;
        usuarioDAO.eliminarUsuario(id);
    }
        
}
