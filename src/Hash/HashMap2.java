package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMap2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> ropa = new HashMap<>();
        int opcion = 0;
        do{
            System.out.println("Ingrese una opción: \n"
                    + "1.Agregar \n" +
                    "2. Consultar \n" +
                    "3. Modificar \n" +
                    "4. Eliminar \n" +
                    "5. Salir");
            opcion = s.nextInt() ;


            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el código de la prenda: ");
                    String codigo = s.next();
                    System.out.println("Ingrese el nombre de la prenda: ");
                    String nombre = s.next();
                    agregar(codigo, nombre, ropa);
                    break;

                case 2:
                    listar(ropa);
                    break;

                case 3:
                    System.out.println("Ingrese el código de la prenda que desea modificar: ");
                    String codigoAModificar = s.next();
                    modificar(codigoAModificar,ropa);
                    break;

                case 4:
                    System.out.println("Ingrese el código de la prenda que desea eliminar: ");
                    String codigoAEliminar = s.next();
                    eliminar(ropa, codigoAEliminar);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opción no válida");
            }


        } while(opcion!=5);
    }

    /**
     * Método que permite eliminar un objeto del hashmap
     * @param ropa
     * @param codigoAEliminar
     */
    private static void eliminar(HashMap<String, String> ropa, String codigoAEliminar) {
        if (ropa.containsKey(codigoAEliminar)){
            ropa.remove(codigoAEliminar);
            System.out.println("Se ha eliminado exitosamente");
        }else System.out.println("El código a eliminar no existe");
    }

    /**
     * Método que permite modificar un objeto del hashmap
     * @param codigoAModificar
     * @param ropa
     */
    private static void modificar(String codigoAModificar, HashMap<String, String> ropa){
        Scanner s = new Scanner(System.in);
        String clave;
        Iterator<String> iterador = ropa.keySet().iterator();
        if (ropa.containsKey(codigoAModificar)){
            System.out.println("Ingrese el nombre nuevo: ");
            String nombreNuevo = s.next();
            while(iterador.hasNext()) {
                clave = iterador.next();
                ropa.replace(clave, nombreNuevo);
                break;
            }
        }else System.out.println("El código de la prenda a modificar no existe");
    }

    private static void listar(HashMap<String, String> ropa) {
        String clave;
        Iterator<String> iterador = ropa.keySet().iterator();
        while(iterador.hasNext()) {
            clave = iterador.next();
            System.out.println("La prenda " + ropa.get(clave) + " tiene el código " + clave);
        }

    }

    private static void agregar(String codigo, String nombre, HashMap<String, String> ropa) {
        if (ropa.containsKey(codigo)){
            System.out.println("No se puede agregar esta prenda, ya existe");
        }else ropa.put(codigo, nombre);
    }


}
