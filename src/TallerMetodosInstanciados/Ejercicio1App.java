package TallerMetodosInstanciados;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio1App {
    public static void main(String[] args) {

        //Instanciación
        Ejercicio1 suma = new Ejercicio1();

        //Petición de datos
        int inicioRango = suma.pedirNumero("Ingrese el inicio del rango");
        int finRango = suma.pedirNumero("Ingrese el final del rango");

        //Se obtienen los números dentro del rango ingresado
        ArrayList<Integer> numerosDelRango = suma.obtenerNumeros(inicioRango, finRango);

        //Se suman los números
        int sumaNumerosRango = suma.calcularSuma(numerosDelRango);

        //Se muestran los números y la suma
        String numeros = numerosDelRango.toString();

        suma.imprimirMensaje("Los números dentro de su rango son: " + numeros);
        suma.imprimirMensaje("La suma de los números entre " + inicioRango + " y " + finRango + " es: " + sumaNumerosRango);
    }
}
