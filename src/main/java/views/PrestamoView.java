
package views;

import java.util.List;
import model.Prestamo;


public class PrestamoView {
         public static void mostrarPrestamos(List<Prestamo> prestamos) {
        if (prestamos.isEmpty()) {
            System.out.println("No hay prestamos disponibles.");
            
        } else {
            System.out.println("\n--- Lista de prestamos ---");
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo.getId() + ". " + prestamo.getLibroId()+ ". " + prestamo.getUsuarioId()+ ". " + prestamo.getFechaPrestamo()+ ". " + prestamo.getFechaDevolucion());
                
            }
        }
        
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
}
