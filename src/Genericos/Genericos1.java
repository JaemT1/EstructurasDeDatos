package Genericos;

/*
E – Element (usado bastante por Java Collections Framework)
K – Key (Llave, usado en mapas)
N – Number (para números)
T – Type (Representa un tipo, es decir, una clase)
V – Value (representa el valor, también se usa en mapas)
S,U,V etc. – usado para representar otros tipos.
*/

public class Genericos1 <T> {

    private T elemento1;
    private T elemento2;
    private T elemento3;

    public Genericos1(T elemento1, T elemento2, T elemento3) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
    }

    public T getElemento1() {
        return elemento1;
    }

    public void setElemento1(T elemento1) {
        this.elemento1 = elemento1;
    }

    public T getElemento2() {
        return elemento2;
    }

    public void setElemento2(T elemento2) {
        this.elemento2 = elemento2;
    }

    public T getElemento3() {
        return elemento3;
    }

    public void setElemento3(T elemento3) {
        this.elemento3 = elemento3;
    }

    @Override
    public String toString() {
        return "Elemento 1: " + elemento1 + " Elemento 2: " + elemento2 + " Elemento 3: " + elemento3;
    }
}


class main{
    public static void main(String[] args) {
        //String
        Genericos1<String> animales = new Genericos1<>("Ortiz", "Jurado", "Mocho");
        System.out.println(animales.toString());

        //Integer*-
        Genericos1<Integer> numeros = new Genericos1<>(1, 2, 3);
        System.out.println(numeros.toString());
    }
}
