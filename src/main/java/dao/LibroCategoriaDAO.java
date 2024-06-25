
package dao;
import config.ConexionBD;
import java.sql.Connection;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import model.LibroCategoria;


public class LibroCategoriaDAO {
    private Connection conexion;
    private ConexionBD conexionBD;
    
        public LibroCategoriaDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    
    }
        
        public void crearLibroCategoria(LibroCategoria libroCategoria) {
        String sql = "INSERT INTO libros_Categorias (libro_id, categoria_id) VALUES (?,?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, libroCategoria.getLibroId());
            statement.setInt(2, libroCategoria.getCategoriaId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public List<LibroCategoria> leerLibroCategorias() {
        List<LibroCategoria> libroCategorias = new ArrayList<>();
        String sql = "SELECT * FROM libros_Categorias";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int libroId = resultSet.getInt("libro_id");
                int categoriaId = resultSet.getInt("categoria_id");
                LibroCategoria libroCategoria = new LibroCategoria(libroId, categoriaId);
                libroCategorias.add(libroCategoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return libroCategorias;
    }

    public void actualizarLibroCategoria(LibroCategoria libroCategoria) {
        String sql = "UPDATE Libros_Categorias SET categoria_id = ?, WHERE libro_id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, libroCategoria.getCategoriaId());
            statement.setInt(2, libroCategoria.getLibroId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarLibroCategoria(int libroId) {
        String sql = "DELETE FROM libros_Categorias WHERE libro_id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, libroId);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        conexionBD.closeConexion(conexion);
    }
    
}
