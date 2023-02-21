package TallerRecursividad;
/*
 * Construya una funci�n para sumar los n�meros naturales hasta N de forma
recursiva. EL dato N pasar� como par�metro.
 */

import java.util.Scanner;

/**
 * 
 * @author Isabella Cardozo Mar�n
 * @author Juan Manuel Tunubala Larrota
 * @author Juan Emanuel Rodr�guez Rodr�guez
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un n�mero: ");
		int numero = scanner.nextInt();

		int total = calcularSumaRecursiva(numero);
		System.out.println("La suma de los n�meros hasta " + numero + " es de: " + total);

	}

	private static int calcularSumaRecursiva(int numero) {

		int suma;

		if (numero == 1) {
			return 1;
		} else {
			suma = numero + calcularSumaRecursiva(numero - 1);
			return suma;
		}

	}
}
