package TallerMetodosInstanciados;

public class Ejercicio4App {
    public static void main(String[] args) {
        Ejercicio4 fibonacci = new Ejercicio4();
        int serie = fibonacci.pedirNumero("Ingrese hasta cuando va la serie");

        for (int i = 0; i < serie; i++) {

            System.out.print(fibonacci.calcularFibonacciRecursivo(i) + ", ");
        }
    }
}
