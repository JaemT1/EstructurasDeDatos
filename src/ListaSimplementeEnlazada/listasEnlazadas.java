/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimplementeEnlazada;

/**
 *
 * @author cares
 */
public class listasEnlazadas {

    private nodo primero;
    private int tamano;

    public static void main(String[] args) {
        // TODO code application logic here
        listasEnlazadas lista = new listasEnlazadas();
        //lista.verifiaLista();
        lista.verifiaLista();
        lista.adicionarNodo(10);
        lista.adicionarNodo(20);
        lista.adicionarNodo(30);
        lista.listar();
        lista.verifiaLista();
        System.out.println("\n"+"Tamaño   "+lista.tamano());
        lista.buscarElemento(10);
        System.out.println("\nEl elemento en dicha posición es: "+lista.buscarElementoPosicion(0));


    }

    public void verifiaLista(){
        if (primero==null)
        {
            System.out.println("No hay datos en la lista");
        }else{
            System.out.println("La lista contiene datos");
        }
    }

    public void adicionarNodo(int dato)
    {
        nodo nuevo= new nodo(dato);
        nuevo.siguiente=primero;
        primero=nuevo;
        tamano++;

    }

    public int tamano()
    {
        return tamano;
    }

    public void listar()
    {
        nodo actual =primero;
        while(actual!=null){
            System.out.print("["+actual.dato+"]-->");
            actual=actual.siguiente;
        }
    }

    public int buscarElemento(int valor) {
        int valorEncontrado = 0;
        nodo actual = primero;
        int i = 0;
        while(actual!=null){
            if (actual.dato == valor){
                System.out.print("["+actual.dato+"]" + " y está en la posición " + i);
            }
            actual=actual.siguiente;
            i++;
        }

        return valorEncontrado;
    }

    public int buscarElementoPosicion(int pos){

        int elemento = 0;
        int i = 0;
        nodo actual =primero;
        while(actual!=null){
            if(pos == i) {
                elemento = actual.dato;
            }
            actual=actual.siguiente;
            i++;
        }
        return elemento;

    }
}
