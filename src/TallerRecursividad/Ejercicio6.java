package TallerRecursividad;

/*
 * Reescribir el programa de la matriz de buses.
 */

/**
 * @author Isabella Cardozo Mar�n
 * @author Juan Manuel Tunubala Larrota
 * @author Juan Emanuel Rodr�guez Rodr�guez
 *
 */

public class Ejercicio6 {
	public static void main(String[] args) {

		int[][] buses = {
				{ 101, 102, 103, 104 },
				{ 13, 80, 34, 76 },
				{ 45, 67, 12, 79 },
				{ 85, 21, 23, 2 },
				{ 2,  6,  43, 22 }
		};

		imprimirMatrizRecursiva(buses, 0, 0);
		System.out.println("Por día: ");
		calcularSumaRecursivaForma1(buses, 1, 0, 1, 0, 0);
		System.out.println("\nPor bus: ");
		calcularSumaRecursivaForma2(buses, 1, 0, 0, 0, 0);

	}

	public static void imprimirMatrizRecursiva(int[][] matriz, int i, int j) {

		if (matriz != null) {

			if (i < matriz.length) {

				if (j < matriz[i].length - 1) {

					System.out.print("[" + matriz[i][j] + "]" + " ");
					imprimirMatrizRecursiva(matriz, i, j + 1);

				} else {
					System.out.print("[" + matriz[i][j] + "]" + " ");
					System.out.println("\n");
					imprimirMatrizRecursiva(matriz, i + 1, 0);

				}
			}
		}
	}

	public static void calcularSumaRecursivaForma1(int[][] matriz, int i, int j, int aux, int col, int fil) {

		if (matriz != null) {

			if (i < matriz.length) {

				if (j < matriz[i].length - 1) {
					if (matriz[i][j] > aux) {

						aux = matriz[i][j];
						col = j;
						fil = i;
						calcularSumaRecursivaForma1(matriz, i, j + 1, aux, col, fil);
					} else {
						calcularSumaRecursivaForma1(matriz, i, j + 1, aux, col, fil);
					}

				} else {
					if (matriz[i][j] > aux) {

						aux = matriz[i][j];
						col = j;
						fil = i;

					}
					System.out.println("El día " + obtenerDia(fil) + ", el bus con código " + matriz[0][col] + " llevó " + aux + " pasajeros.");
					calcularSumaRecursivaForma1(matriz, i + 1, 0, aux = 1, col = 0, fil = 0);

				}
			}
		}

	}

	public static void calcularSumaRecursivaForma2(int[][] matriz, int i, int j, int aux, int col, int fil) {

		if (matriz != null) {

			if (j < matriz.length - 1) {

				if (i < matriz[i].length) {
					if (matriz[i][j] > aux) {

						aux = matriz[i][j];
						col = j;
						fil = i;
						calcularSumaRecursivaForma2(matriz, i + 1, j, aux, col, fil);
					} else {
						calcularSumaRecursivaForma2(matriz, i + 1, j, aux, col, fil);
					}

				} else {
					if (matriz[i][j] > aux) {

						aux = matriz[i][j];
						col = j;
						fil = i;

					}
					System.out.println("El bus con código " + matriz[0][col] + " llevó " + aux + " pasajeros el dia " + obtenerDia(fil));
					calcularSumaRecursivaForma2(matriz, 1, j + 1, aux = 1, col = 0, fil = 0);

				}
			}
		}

	}

	/**
	 * Retorna el nombre del día de la semana en base a su número
	 * @param numDia número del día a evalúar
	 * @return retorna el nombre del día
	 */
	public static String obtenerDia(int numDia){
		return switch (numDia) {
			case 1 -> "Lunes";
			case 2 -> "Martes";
			case 3 -> "Miercoles";
			case 4 -> "Jueves";
			case 5 -> "Vierne";
			case 6 -> "Sabado";
			case 7 -> "Domingo";
			default -> "No Existe El  Día";
		};
	}
}
