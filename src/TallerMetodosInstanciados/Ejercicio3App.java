package TallerMetodosInstanciados;

public class Ejercicio3App {
    public static void main(String[] args) {
        Ejercicio3 primo = new Ejercicio3();
        int numero = primo.pedirNumero("Ingrese el número que desea calcular");
        boolean esPrimo = primo.calcularPrimo(numero);
        primo.imprimirResultado(esPrimo);
    }
}
