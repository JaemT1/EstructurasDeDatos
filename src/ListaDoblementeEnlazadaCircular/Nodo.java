package ListaDoblementeEnlazadaCircular;

public class Nodo {
    int valor;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
}

