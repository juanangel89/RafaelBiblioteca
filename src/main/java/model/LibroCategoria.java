
package model;


public class LibroCategoria {
    private int libroId;
    private int categoriaId;

    public LibroCategoria(int libroId, int categoriaId) {
        this.libroId = libroId;
        this.categoriaId = categoriaId;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }
    
    
    
}
