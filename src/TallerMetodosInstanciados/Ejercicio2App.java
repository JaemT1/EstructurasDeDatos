package TallerMetodosInstanciados;

import javax.swing.*;

public class Ejercicio2App {
    public static void main(String[] args) {

        Ejercicio2 factorial = new Ejercicio2();
        int numero = factorial.pedirNumero("Ingrese el número el cual desea calcular");
        int resultadoFactorial = factorial.calcularFactorial(numero);
        JOptionPane.showMessageDialog(null, "EL factorial de: " + numero + " es: " + resultadoFactorial);
    }
}
