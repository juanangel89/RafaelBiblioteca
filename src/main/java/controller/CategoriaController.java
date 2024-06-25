
package controller;
import dao.CategoriaDAO;
import java.util.List;
import model.Categoria;

import views.CategoriaView;

        

public class CategoriaController {
    public CategoriaDAO categoriaDAO;
    
    public CategoriaController (){
        categoriaDAO = new CategoriaDAO(); 
    
    }
    
    public void crearCategoriaButton(String nombre) {
        Categoria categoria = new Categoria(0, nombre);
        categoriaDAO.crearCategoria(categoria);
    }
    
    public List<Categoria> leerCategoriasButton() {      
        List<Categoria> categorias = categoriaDAO.leerCategorias();
        CategoriaView.mostrarCategorias(categorias);
        return categorias;
    }

    public void actualizarCategoriaButton(int ID, String nombre) {
        int id = ID;
        String nuevoNombre = nombre;
        Categoria categoria = new Categoria(id, nuevoNombre);
        categoriaDAO.actualizarCategoria(categoria);
        
    }
  
    public void eliminarCategoriaButton(int ID) {
        int id = ID;
        categoriaDAO.eliminarCategoria(id);
    }

}
