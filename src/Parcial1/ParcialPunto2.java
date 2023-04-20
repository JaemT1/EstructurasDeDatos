package Parcial1;

public class ParcialPunto2 {
    public static void main(String[] args) {
        int[][] matrizInt = {{1,2,3},
                             {4,5,6},
                             {7,8,9}};

        int suma = calcularSumaMatriz(matrizInt, 0, 0);
        System.out.println("" + suma);
    }

    /**
     * Método que suma los elementos de una matriz de enteros
     * @param matriz matriz a sumar
     * @param i indice para las filas
     * @param j indice para las columnas
     * @return retorna la suma
     */
    public static int calcularSumaMatriz(int[][]matriz, int i, int j){
        int suma = 0;

        if(i < matriz.length) {
            if (j <= matriz[0].length-1){
                suma = matriz[i][j] + calcularSumaMatriz(matriz,i,j + 1);
            }else {
                suma = calcularSumaMatriz(matriz, i + 1, 0);
            }
        }else return suma;

        return suma;
    }
}
