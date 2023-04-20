package ListaSimplementeEnlazadaCircular;

public class ListaCircularSimple {

    private Nodo primero;
    private int tamaño;

    public ListaCircularSimple() {
        primero = null;
        tamaño = 0;
    }

    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;//Se hace el enlace circular
        } else {
            Nodo actual = primero;
            while (actual.siguiente != primero) {
                actual = actual.siguiente; //Cuando hay más elementos, se usa este while para ir recorriendo la lista
            }
            actual.siguiente = nuevo; //Agrega el nuevo elemento
            nuevo.siguiente = primero; //Hace el enlace circular
        }
        tamaño++;
    }

    public Object obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        Nodo actual = primero;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    public void eliminar(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        if (tamaño == 1) {
            primero = null;
        } else {
            Nodo actual = primero;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
            if (indice == 0) {
                primero = actual.siguiente;
            }
        }
        tamaño--;
    }

    public int tamaño() {
        return tamaño;
    }

    public boolean esVacia() {
        return tamaño == 0;
    }

    public void listar(){
        Nodo actual =primero;
        int i = 0;
        while(i < tamaño){
            System.out.print("["+actual.dato+"]-->");
            actual=actual.siguiente;
            i++;
        }
    }

}
