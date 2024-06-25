package dao;
import config.ConexionBD;
import model.Libro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class LibroDAO {
    private Connection conexion;
    private ConexionBD conexionBD;
    private ResultSet resultado;
    
    public LibroDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    
    }



    public int crearLibro(Libro libro) {
        int id = 0;
        String sql = "INSERT INTO libros (titulo, autor, editorial, anio_publicacion, isbn) VALUES (?,?,?,?,?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getAutor());
            statement.setString(3, libro.getEditorial());
            statement.setInt(4, libro.getAnio_publicacion());
            statement.setString(5, libro.getIsbn());
            statement.executeUpdate();
            resultado = (ResultSet) statement.getGeneratedKeys();
            if (resultado.next()) {
                id = resultado.getInt(1);
            }
            return id;
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
            return -1;
        }
    }

    public List<Libro> leerLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                String editorial = resultSet.getString("editorial");
                int anio_publicacion = resultSet.getInt("anio_publicacion");
                String isbn = resultSet.getString("isbn");
                Libro libro = new Libro(id, titulo, autor, editorial, anio_publicacion, isbn);
                libros.add(libro);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return libros;
    }

    public void actualizarLibro(Libro libro) {
        String sql = "UPDATE libros SET titulo = ?, autor = ?, editorial = ?, anio_publicacion = ?, isbn = ?  WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getAutor());
            statement.setString(3, libro.getEditorial());
            statement.setInt(4, libro.getAnio_publicacion());
            statement.setString(5, libro.getIsbn());
            statement.setInt(6, libro.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarLibro(int id) {
        String sql = "DELETE FROM libros WHERE id = ?";
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

