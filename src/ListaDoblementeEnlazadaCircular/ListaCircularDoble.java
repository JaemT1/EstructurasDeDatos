package ListaDoblementeEnlazadaCircular;

public class ListaCircularDoble {
    Nodo cabeza;
    int tamaño;

    public ListaCircularDoble() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) { // Si la cabeza es nula, entonces la lista está vacía
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza; // La cabeza apunta a sí mismo, porque es una lista circular
            cabeza.anterior = cabeza; // La cabeza también apunta a sí mismo en la dirección anterior
        } else {
            Nodo ultimo = cabeza.anterior; // Iniciamos con el nodo anterior a la cabeza (el último nodo)
            ultimo.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo
            nuevoNodo.anterior = ultimo; // El nuevo nodo apunta al último nodo en la dirección anterior
            nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta a la cabeza en la dirección siguiente
            cabeza.anterior = nuevoNodo; // La cabeza apunta al nuevo nodo en la dirección anterior
        }
        tamaño++; // Incrementamos el tamaño de la lista
    }

    /*public boolean remover(int valor) {
        if (cabeza == null) { // Si la cabeza es nula, entonces la lista está vacía
            return false;
        }

        Nodo nodoActual = cabeza;
        do {
            if (nodoActual.valor == valor) { // Si encontramos el nodo con el valor dado
                Nodo anterior = nodoActual.anterior;
                Nodo siguiente = nodoActual.siguiente;
                anterior.siguiente = siguiente; // El nodo anterior apunta al siguiente nodo
                siguiente.anterior = anterior; // El nodo siguiente apunta al anterior nodo
                tamaño--; // Decrementamos el tamaño de la lista
                if (nodoActual == cabeza) { // Si el nodo a eliminar es la cabeza, entonces actualizamos la cabeza
                    cabeza = siguiente;
                }
                return true;
            }
            nodoActual = nodoActual.siguiente; // Avanzamos al siguiente nodo
        } while (nodoActual != cabeza); // Si regresamos a la cabeza, entonces hemos recorrido toda la lista

        return false; // No encontramos el nodo con el valor dado
    }*/
    public void imprimir() {
        if (cabeza != null) {
            Nodo actual = this.cabeza.siguiente;
            do {
                System.out.print(actual.anterior.valor + " ");
                actual = actual.siguiente;
            } while (actual != this.cabeza.siguiente);
        }
    }
}

