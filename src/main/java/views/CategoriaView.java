
package views;

import java.util.List;
import model.Categoria;

public class CategoriaView {
         public static void mostrarCategorias(List<Categoria> categorias) {
        if (categorias.isEmpty()) {
            System.out.println("No hay categorías disponibles.");
            
        } else {
            System.out.println("\n--- Lista de Categorias ---");
            for (Categoria categoria : categorias) {
                System.out.println(categoria.getId() + ". " + categoria.getNombre());
                
            }
        }
        
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
}
