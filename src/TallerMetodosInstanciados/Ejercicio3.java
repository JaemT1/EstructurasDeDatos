package TallerMetodosInstanciados;

import javax.swing.*;

public class Ejercicio3 {

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
     * Método que calcula si un número es primo
     * @param numero el numero a calcular
     * @return true si es primo, false si no
     */
    public boolean calcularPrimo(int numero) {
        boolean esPrimo = false;
        int cantDivisiones = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cantDivisiones++;
            }
        }

        if (cantDivisiones == 2){
            esPrimo = true;
        }

            return esPrimo;
        }

        public void imprimirResultado(boolean esPrimo){
            if (esPrimo){
                JOptionPane.showMessageDialog(null, "El número es primo");
            }else
                JOptionPane.showMessageDialog(null, "El número no es primo");
        }
}
