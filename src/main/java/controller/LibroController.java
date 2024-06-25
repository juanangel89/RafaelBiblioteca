package controller;
import dao.LibroDAO;
import model.Libro;
import views.LibroView;
import java.util.List;
import model.LibroCategoria;
import dao.LibroCategoriaDAO;
import views.LibroCategoriaView;


public class LibroController {
     public LibroDAO libroDAO;
     public LibroCategoriaDAO libroCategoriaDAO;

    public LibroController() {
        libroDAO = new LibroDAO();
        libroCategoriaDAO = new LibroCategoriaDAO();
    }

    public int crearLibroButton(String titulo, String autor, String editorial, int anio_publicacion, String isbn) {
        int id;
        Libro libro = new Libro(0, titulo, autor, editorial, anio_publicacion, isbn);
        id=libroDAO.crearLibro(libro);
        return id;
    }
    public void crearLibroCategoriaButton(int libroId, int categoriaId){
        LibroCategoria lCategoria = new LibroCategoria(libroId, categoriaId);
        libroCategoriaDAO.crearLibroCategoria(lCategoria);
    }
        
    public List<Libro> leerlibrosButton() {      
        List<Libro> libros = libroDAO.leerLibros();
        LibroView.mostrarLibros(libros);
        return libros;
    }
    public List<LibroCategoria> leerlibrosCategoriasButton() {      
        List<LibroCategoria> libros2 = libroCategoriaDAO.leerLibroCategorias();
        LibroCategoriaView.mostrarLibros(libros2);
        return libros2;
    }
   
    public void actualizarLibroButton(int id, String titulo, String autor, String editorial, int anio_publicacion, String isbn) {
        Libro libro = new Libro(id, titulo,autor,editorial,anio_publicacion,isbn);
        libroDAO.actualizarLibro(libro);
    }
    public void actualizarLibroCategoriaButton(int libroId, int categoriaId){
        LibroCategoria categoria = new LibroCategoria(libroId, categoriaId);
        libroCategoriaDAO.actualizarLibroCategoria(categoria);
    }
    

    public void eliminarLibroButton(int id) {
        libroDAO.eliminarLibro(id);
    }
    public void eliminarLibroCategoriaButton(int libroId) {
        libroCategoriaDAO.eliminarLibroCategoria(libroId);
    }
    

}
