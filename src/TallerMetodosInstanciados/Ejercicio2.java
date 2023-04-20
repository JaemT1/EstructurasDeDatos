package TallerMetodosInstanciados;

import javax.swing.*;

public class Ejercicio2 {

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

    /**
     * Método que calcula el factorial de un número
     * @param numero número a calcularle el factorial
     * @return el factorial calculado
     */
    public int calcularFactorial(int numero){
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
