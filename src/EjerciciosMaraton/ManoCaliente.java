package EjerciciosMaraton;

public class ManoCaliente {
    public static void main(String[] args) {
        String partidos = "11000001011000111110100100101100110011010110001010 101001111100000100011100000111111010000111010010010101 111101000000100001100100011100001100100000110 1000000110111011101101001000001111101111011011100111111";
        String[] juegos = partidos.split(" ");
        int[] manosCalientes = determinarManoCaliente(juegos);
        for (int i = 0; i < manosCalientes.length; i++) {
            System.out.println(manosCalientes[i]);
        }
        System.out.println(calcularPorcentaje(manosCalientes));
    }

    public static int[] determinarManoCaliente(String [] juegos){
        int[]manosCalientes = new int[juegos.length];
        for (int i = 0; i < juegos.length; i++) {
            String partido = juegos[i];
            int cont = 0;
            int numeroManosCalientas = 0;
            for (int j = 0; j < partido.length(); j++) {
                if (partido.charAt(j) == '1') {
                    cont++;
                }

                if(cont > 4){
                    numeroManosCalientas++;
                    cont = 0;
                }
                if (partido.charAt(j) == '0'){
                    cont = 0;
                }
            }
            manosCalientes[i] = numeroManosCalientas;

        }
        return manosCalientes;
    }

    public static double calcularPorcentaje(int[]manosCalientes){
        double cantManosCalientes = 0;

        for (int i = 0; i < manosCalientes.length; i++) {
            if (manosCalientes[i] != 0){
                cantManosCalientes++;
            }
        }
        double porcentaje = (cantManosCalientes / manosCalientes.length) * 100;
        return porcentaje;
    }
}
