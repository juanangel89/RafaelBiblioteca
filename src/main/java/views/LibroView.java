package views;
import model.Libro;
import java.util.List;


public class LibroView {
     public static void mostrarLibros(List<Libro> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles.");
            
        } else {
            System.out.println("\n--- Lista de Libros ---");
            for (Libro libro : libros) {
                System.out.println(libro.getId() + ". " + libro.getTitulo()+ ". " + libro.getAutor()+ ". " + libro.getEditorial()+ ". " + libro.getAnio_publicacion()+ ". " + libro.getIsbn());
                
            }
        }
        
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}