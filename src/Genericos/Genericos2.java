package Genericos;

import java.util.ArrayList;

public class Genericos2 <E>{
    private E lista;

    public Genericos2(E lista) {
        this.lista = lista;
    }

    public E getLista() {
        return lista;
    }

    public void setLista(E lista) {
        this.lista = lista;
    }

}

class main2{
    public static void main(String[] args) {
        ArrayList<String> animales = new ArrayList<>();
        Genericos2 <ArrayList<String>> lista = new Genericos2<>(animales);
        lista.getLista().add("Ortiz");
        lista.getLista().add("Jurado");
        lista.getLista().add("MOcho");

        for (String s: lista.getLista()) {
            System.out.println(s);
        }

    }
}
