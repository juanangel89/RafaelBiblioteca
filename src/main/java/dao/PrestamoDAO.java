
package dao;

import config.ConexionBD;
import java.sql.Connection;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import model.Prestamo;


public class PrestamoDAO {
        private Connection conexion;
    private ConexionBD conexionBD;
    
        public PrestamoDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    
    }
        
        public void crearPrestamo(Prestamo prestamo) {
        String sql = "INSERT INTO prestamos (libro_id, usuario_id, fecha_prestamo, fecha_devolucion) VALUES (?,?,?,?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, prestamo.getLibroId());
            statement.setInt(2, prestamo.getUsuarioId());
            statement.setString(3, prestamo.getFechaPrestamo());
            statement.setString(4, prestamo.getFechaDevolucion());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public List<Prestamo> leerPrestamos() {
        List<Prestamo> prestamos = new ArrayList<>();
        String sql = "SELECT * FROM prestamos";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int libroId = resultSet.getInt("libro_id");
                int usuarioId = resultSet.getInt("usuario_id");
                String fechaPrestamo = resultSet.getString("fecha_prestamo");
                String fechaDevolucion = resultSet.getString("fecha_devolucion");
                Prestamo prestamo = new Prestamo(id, libroId, usuarioId, fechaPrestamo, fechaDevolucion);
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return prestamos;
    }

    public void actualizarPrestamo(Prestamo prestamo) {
        String sql = "UPDATE prestamos SET libro_id = ?, usuario_id = ?, fecha_prestamo = ?, fecha_devolucion = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, prestamo.getLibroId());
            statement.setInt(2, prestamo.getUsuarioId());
            statement.setString(3, prestamo.getFechaPrestamo());
            statement.setString(4, prestamo.getFechaDevolucion());
            statement.setInt(5, prestamo.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarPrestamo(int id) {
        String sql = "DELETE FROM prestamos WHERE id = ?";
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
