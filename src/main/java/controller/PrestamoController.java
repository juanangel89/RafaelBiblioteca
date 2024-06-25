
package controller;
import dao.PrestamoDAO;
import java.util.Date;
import model.Prestamo;
import views.PrestamoView;
import java.util.List;


public class PrestamoController {
    public PrestamoDAO prestamoDAO;
    
        public PrestamoController() {
        prestamoDAO = new PrestamoDAO();
    }
        
        public void crearPrestamoButton(int libroId, int usuarioId, String fechaPrestamo, String fechaDevolucion) {
        Prestamo prestamo = new Prestamo(0, libroId, usuarioId, fechaPrestamo, fechaDevolucion);
        prestamoDAO.crearPrestamo(prestamo);
    }
        
    public List<Prestamo> leerPrestamosButton() {      
        List<Prestamo> prestamos = prestamoDAO.leerPrestamos();
        PrestamoView.mostrarPrestamos(prestamos);
        return prestamos;
    }
   
    public void actualizarPrestamoButton(int id, int libroId, int usuarioId, String fechaPrestamo, String fechaDevolucion) {
        Prestamo prestamo = new Prestamo(id, libroId,usuarioId,fechaPrestamo,fechaDevolucion);
        prestamoDAO.actualizarPrestamo(prestamo);
    }

    public void eliminarPrestamoButton(int id) {
        
        prestamoDAO.eliminarPrestamo(id);
    }
    
}
