package ListaSimplementeEnlazadaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircularSimple listaSimple = new ListaCircularSimple();
        listaSimple.agregar(20);
        listaSimple.agregar(30);
        listaSimple.agregar(40);
        listaSimple.listar();
    }
}