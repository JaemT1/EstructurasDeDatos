package TallerRecursividad;

/*
 * Cree un m�todo que permita encontrar el mayor y el menor n�mero de una rray de forma recursiva.
 */

/**
 * @author Isabella Cardozo Mar�n
 * @author Juan Manuel Tunubala Larrota
 * @author Juan Emanuel Rodr�guez Rodr�guez
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		int[] numero = { 3, 2, 6, 9, 32, 11 };
		int numMayor = encontrarMayorRecursivo(numero, 0, 0);
		int numMenor = encontrarMenorRecursivo2(numero, 0);
		System.out.println("El n�mero menor es: " + numMenor);
		System.out.println("El n�mero mayor es: " + numMayor);

	}

	private static int encontrarMayorRecursivo(int[] numero, int i, int numMayor) {
		if (i == numero.length - 1) {
			return numMayor;
		} else {

			if (numero[i] > numMayor) {
				numMayor = numero[i];
			}
			return encontrarMayorRecursivo(numero, (i + 1), numMayor);
		}

	}

	public static int encontrarMenorRecursivo2(int[] numeros, int indice) {
		int longitudArray = numeros.length - 1; // 6 - 1 = 5
		int menor = 0;
		int menorTemporal = 0;

		// Caso base y entra cuando ha llegado al final del array

		if (indice == longitudArray) { // i = 0;
			return menor = numeros[indice];
		} else {

			menor = encontrarMenorRecursivo2(numeros, indice + 1);

			if (numeros[indice] < menor) {
				menorTemporal = numeros[indice];
			} else {
				menorTemporal = menor;
			}
		}
		return menorTemporal;
	}

}
