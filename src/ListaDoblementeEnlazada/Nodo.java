package ListaDoblementeEnlazada;

public class Nodo {
    // Campo para almacenar el dato del nodo
    Object dato;
    // Campos para almacenar referencias a los nodos anterior y siguiente
    Nodo anterior;
    Nodo siguiente;
    // Constructor para inicializar un nodo
    public Nodo(Object dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}
