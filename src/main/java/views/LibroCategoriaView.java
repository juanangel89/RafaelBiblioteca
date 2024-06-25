
package views;

import java.util.List;
import model.LibroCategoria;

public class LibroCategoriaView {
         public static void mostrarLibros(List<LibroCategoria> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles.");
            
        } else {
            System.out.println("\n--- Lista de Libros Categorias ---");
            for (LibroCategoria libro : libros) {
                System.out.println(libro.getLibroId() + ". " + libro.getCategoriaId());
                
            }
        }
        
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
}
