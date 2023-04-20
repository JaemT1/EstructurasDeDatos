package Parcial1;


public class ParcialPunto3 {
    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] pares = new int[conjunto.length];
        devolverPares(conjunto, pares, 0, 0);
        for (int i = 0; i < pares.length; i++) {
            System.out.println(""+ pares[i]);
        }

    }

    /**
     * Método recursivo que permite devolver los números pares en base a un conjunto de enteros cualquieras
     * @param conjunto array a evaluar
     * @param pares donde se van a guardar los pares
     * @param i indice para el conjunto
     * @param j indice para el array de pares
     * @return el array de pares
     */
    public static int[]devolverPares(int[]conjunto, int[]pares, int i, int j){
        if(i < conjunto.length){
            if (conjunto[i] % 2 == 0){
                pares[j] = conjunto[i];
                devolverPares(conjunto, pares, i+1, j+1);
            }else devolverPares(conjunto, pares, i+1, j);

        }else return pares;
        return pares;
    }


}
