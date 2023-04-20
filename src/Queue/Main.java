package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    //FIFO - QUEUE
    public static void main(String[] args) {
        // Crear una cola
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.add("Juan");
        cola.add("María");
        cola.add("Pedro");

        // Consultar el segundo elemento de la cola (índice 1)
        String segundoElemento = cola.stream().skip(1).findFirst().orElse(null);
        System.out.println("Segundo elemento de la cola: " + segundoElemento);

        // Quitar y mostrar el primer elemento de la cola
        String primerElemento = cola.remove();
        System.out.println("Primer elemento de la cola: " + primerElemento);

        // Mostrar los elementos restantes en la cola
        System.out.println("Elementos restantes en la cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}

