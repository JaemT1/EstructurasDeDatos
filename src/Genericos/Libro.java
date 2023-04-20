package Genericos;

public class Libro <T,U,V>{

    T titulo;
    T autor;
    U nPaginas;
    V precio;

    public Libro(T titulo, T autor, U nPaginas, V precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.precio = precio;
    }

    public T getTitulo() {
        return titulo;
    }

    public void setTitulo(T titulo) {
        this.titulo = titulo;
    }

    public T getAutor() {
        return autor;
    }

    public void setAutor(T autor) {
        this.autor = autor;
    }

    public U getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(U nPaginas) {
        this.nPaginas = nPaginas;
    }

    public V getPrecio() {
        return precio;
    }

    public void setPrecio(V precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo=" + titulo +
                ", autor=" + autor +
                ", nPaginas=" + nPaginas +
                ", precio=" + precio +
                '}';
    }
}
