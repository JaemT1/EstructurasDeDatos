package ListaDoblementeEnlazada;

public class ListaDoblementeEnlazada {
    // Campo para almacenar una referencia al primer nodo de la lista
    Nodo inicio;
    // Campo para almacenar una referencia al último nodo de la lista
    Nodo fin;
    // Constructor para inicializar la lista
    public ListaDoblementeEnlazada() {
        inicio = null;
        fin = null;
    }
    // Método para agregar un nodo al final de la lista
    public void agregarAlFinal(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            nuevoNodo.anterior = fin;
            fin = nuevoNodo;
        }
    }
    // Método para recorrer la lista y mostrar los datos de los nodos
    public void recorrerLista() {
        Nodo nodoActual = inicio;
        while (nodoActual != null) {
            System.out.print("<--" + nodoActual.dato + "-->");
            nodoActual = nodoActual.siguiente;
        }
    }
}
