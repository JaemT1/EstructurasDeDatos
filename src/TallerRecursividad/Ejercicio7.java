package TallerRecursividad;

import javax.swing.*;
import Recursos.Recursos;

/*
 * A partir de una cadena (String) verificar si solo tiene letras, solo números o posee ambos.
 */

/**
 * @author Isabella Cardozo Mar�n
 * @author Juan Manuel Tunubala Larrota
 * @author Juan Emanuel Rodr�guez Rodr�guez
 *
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena = Recursos.leerString("Ingrese la cadena a evaluar");
        char[]letras = cadena.toCharArray();
        evaluarCadena(letras, 0, 0, 0);
    }

    /**
     * Método recursivo que permite saber si en una cadena previamente convertida a array de chars
     * hay solo letras, hay solo numeros o si hay ambos
     * @param letras el array de chars a evaluar
     * @param i indice para recorrer el array
     * @param cantLetras la cantidad de letras que van apareciendo
     * @param cantNumeros la cantidad de números que van apareciendo
     */
    public static void evaluarCadena(char[] letras, int i, int cantLetras, int cantNumeros) {
        int longitud = letras.length;
        if (i < longitud) {
            if (Character.isLetter(letras[i])) {
                evaluarCadena(letras, i + 1, cantLetras + 1, cantNumeros);
            }else evaluarCadena(letras, i + 1, cantLetras, cantNumeros + 1);
        }else{
            imprimirResultado(cantLetras, cantNumeros);
        }
    }

    /**
     * Método que permite imprimir si hay solo letras, si hay solo numeros o si hay ambos
     * @param cantLetras la cantidad de letras
     * @param cantNumeros la cantidad de números
     */
    public static void imprimirResultado(int cantLetras, int cantNumeros){
        if (cantNumeros == 0 && cantLetras > 0){ //Si hay solo letras
            JOptionPane.showMessageDialog(null, "Solo hay letras en la cadena");
        } else if (cantLetras == 0 && cantNumeros > 0 ) { //Si hay solo numeros
            JOptionPane.showMessageDialog(null, "Solo hay números en la cadena");
        } else if (cantLetras > 0 && cantNumeros > 0 ) { //Si hay letras y números
            JOptionPane.showMessageDialog(null, "Hay números y letras en la cadena");
        }
    }
}
