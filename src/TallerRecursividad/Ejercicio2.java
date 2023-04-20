package TallerRecursividad;

import java.util.Scanner;

/*
 * Realizar un programa que imprima los numeros de 1 hasta N.
 */

/**
 * @author Isabella Cardozo Mar�n
 * @author Juan Manuel Tunubala Larrota
 * @author Juan Emanuel Rodr�guez Rodr�guez
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un n�mero: ");
		int numero = scanner.nextInt();

		imprimirNumeros(numero);

	}

	private static void imprimirNumeros(int numero) {

		if (numero > 0) {
			imprimirNumeros(numero - 1);
			System.out.println(numero);
		}

	}

}
