package TallerRecursividad;

import java.util.Scanner;

/*
 * Cree un m�todo que lea un n�mero y luego lea la potencia a la cu�l desea elevarla e imprimir el resultado.
 */

/**
 * @author Isabella Cardozo Mar�n
 * @author Juan Manuel Tunubala Larrota
 * @author Juan Emanuel Rodr�guez Rodr�guez
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un n�mero: ");
		int n = scanner.nextInt();

		System.out.println("Ingrese a qu� potencia desea elevar el n�mero: ");
		int potencia = scanner.nextInt();

		int total = calcularPotenciaRecursiva(n, potencia);
		System.out.println("La potecia del n�mero es de: " + total);

	}

	private static int calcularPotenciaRecursiva(int n, int potencia) {

		if (potencia == 0) {
			return 1;
		} else if (potencia < 0) {

			return calcularPotenciaRecursiva(n, potencia + 1) / n;
		} else {
			return n * calcularPotenciaRecursiva(n, potencia - 1);
		}

	}
}
