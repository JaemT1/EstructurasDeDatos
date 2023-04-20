package Genericos;

import java.util.ArrayList;

public class Main {

    static Enlaces enlaces = new Enlaces();
    static ArrayList<Libro> libros = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {

            opcion = enlaces.conector_int("Digite la operacion que desea hacer:\n\n" +
                    "1- Agregar Producto\n" +
                    "2- Consulta General\n" +
                    "3- Consulta por Titulo\n" +
                    "4- Salir");
            switch (opcion){
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    consultaGeneral();
                    break;
                case 3:
                    consultarPrecio();
                    break;
            }

        }while(opcion != 4);

    }

    public static void agregarLibro() {

        String titulo = enlaces.conec_str("Digite el titulo del libro");
        String autor = enlaces.conec_str("Digite el autor del libro");
        int nPaginas = enlaces.conector_int("Digite la cantidad de paginas del libro");
        double precio = enlaces.conector_double("Digite el precio del libro");

        Libro libro = new Libro<>(titulo,autor,nPaginas,precio);

        libros.add(libro);

        enlaces.salida3("El libro se cargó ", "correctamente");
    }

    public static void consultaGeneral(){
        if(libros.size() != 0){
            for(Libro libro: libros){
                System.out.println(libro.toString());
            }
        }else{
            enlaces.salida3("No hay libros ","que mostrar");
        }

    }

    public static void consultarPrecio(){
        String titulo = enlaces.conec_str("Digite el titulo del libro que desea consultar");
        boolean hecho = false;
        for(Libro libro: libros){
            if(libro.getTitulo().equals(titulo)){
                enlaces.salida3("Autor: " + libro.getAutor(),"\nPrecio: " + libro.getPrecio());
                hecho = true;
            }
        }
        if(!hecho){
            enlaces.salida3("El libro no ", "existe");
        }

    }
}