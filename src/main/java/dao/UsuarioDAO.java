
package dao;
import config.ConexionBD;
import model.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class UsuarioDAO {
        private Connection conexion;
    private ConexionBD conexionBD;
    
    public UsuarioDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    }
    
    public void crearUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, email, telefono) VALUES (?,?,?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getEmail());
            statement.setString(3, usuario.getTelefono());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public List<Usuario> leerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");
                Usuario usuario = new Usuario(id, nombre, email, telefono);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return usuarios;
    }

    public void actualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET nombre = ?, email = ?, telefono = ?  WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getEmail());
            statement.setString(3, usuario.getTelefono());
            statement.setInt(4, usuario.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        conexionBD.closeConexion(conexion);
    }

    
    
}
