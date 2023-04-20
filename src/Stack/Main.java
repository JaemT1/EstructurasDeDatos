package Stack;

import java.util.Stack;

public class Main {

    //LIFO - STACK
    public static void main(String[] args) {
        // Crear una pila
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push(3);
        pila.push(7);
        pila.push(1);

        // Mostrar la pila antes de la modificación
        System.out.println("Pila original: " + pila);

        // Buscar un elemento en la pila y obtener su posición relativa
        int posicion = pila.search(7);
        if (posicion != -1) {
            System.out.println("El elemento está en la posición " + posicion + " de la pila.");
        } else {
            System.out.println("El elemento no está en la pila.");
        }

        // Sacar los elementos de la pila y modificar el elemento deseado
        Stack<Integer> pilaAux = new Stack<>();
        while (!pila.isEmpty()) {
            int elementoAux = pila.pop();
            if (elementoAux == 7) {
                elementoAux = 0; // Modificar el elemento deseado
            }
            pilaAux.push(elementoAux);
        }

        // Volver a insertar los elementos en la pila en el orden inverso
        while (!pilaAux.isEmpty()) {
            int elemento = pilaAux.pop();
            pila.push(elemento);
        }

        // Mostrar la pila despues de la modificación
        System.out.println("Pila original: " + pila);

        // Consultar el elemento superior de la pila sin quitarlo de la pila
        int elementoSuperior = pila.peek();
        System.out.println("Elemento superior de la pila: " + elementoSuperior);

        // Quitar y mostrar el elemento superior de la pila
        int elementoSuperior2 = pila.pop();
        System.out.println("Elemento superior de la pila: " + elementoSuperior2);

        // Mostrar los elementos restantes en la pila
        System.out.println("Elementos restantes en la pila:");
        while (!pila.empty()) {
            System.out.println(pila.pop());
        }
    }
}

