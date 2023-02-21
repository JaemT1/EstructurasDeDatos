package TallerMetodosInstanciados;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio1 {
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
     * Método que permite imprimir un mensaje
     * @param mensaje mensaje que se desea mostrar en pantalla
     */
    public void imprimirMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Método que obtiene los números dentro de un rango
     * @param inicioRango Donde inicia el rango
     * @param finRango Donde termima el rango
     * @return el arraylist con los números del rango
     */
    public  ArrayList<Integer> obtenerNumeros(int inicioRango, int finRango){
        ArrayList<Integer> numerosDelRango = new ArrayList<Integer>();
        if (inicioRango > finRango){
            //También se podría hacer el numero del final del rango igual al inicio y el inicio igual al final
            JOptionPane.showMessageDialog(null, "El rango es imposible");
        }else{
            //Tambien se puede hacer con arrays calculando el tamaño con (finRango - inicioRango) - 1
            for (int i = inicioRango + 1 ; i < finRango; i++) {
                    numerosDelRango.add(i);
            }
        }
        return numerosDelRango;
    }

    /**
     * Método que calcula la suma de los números de un arraylist
     * @param numerosDelRango los números a sumar
     * @return la suma
     */
    public  int calcularSuma(ArrayList<Integer> numerosDelRango){
        int suma = 0;
        for (int numero: numerosDelRango) {
            suma += numero;
        }
        return suma;
    }
}