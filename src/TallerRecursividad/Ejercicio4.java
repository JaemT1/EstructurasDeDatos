package TallerRecursividad;

/*
 * Crea un m�todo que permita recorrer y mostrar un array ingresado.
 */

/**
 * @author Isabella Cardozo Mar�n
 * @author Juan Manuel Tunubala Larrota
 * @author Juan Emanuel Rodr�guez Rodr�guez
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		int[] numero = { 1, 2, 3, 4, 5, 6 };
		recorrerArrayRecursivo(numero, 0);

	}

	private static void recorrerArrayRecursivo(int[] numero, int i) {

		int aux;
		if (i <= numero.length - 1) {
			aux = numero[i];
			System.out.print(aux + " ");
			recorrerArrayRecursivo(numero, i + 1);
		}

	}

}
