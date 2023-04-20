package TallerMetodosInstanciados;

import javax.swing.*;

public class Ejercicio4 {

    public int calcularFibonacciRecursivo(int numero) {

        //CASO BASE, si es cero devuelve un cero
        if (numero == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1
        } else if (numero == 1) {
            return 1;
        } else {
            //Hago la suma
            return calcularFibonacciRecursivo(numero - 1) + calcularFibonacciRecursivo(numero - 2);
        }
    }

    /**
     * Método que pide un número con una ventana emergente
     * @param mensaje mensaje que se desea mostrar en pantalla
     * @return retorna el número ingresado
     */
    public int pedirNumero(String mensaje){
        int numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numero;
    }
}
