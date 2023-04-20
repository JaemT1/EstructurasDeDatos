package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> ropa = new HashMap<>();
        int opcion = 0;
        do{
            System.out.println("Ingrese una opción: \n"
                                + "1.Agregar \n" +
                                "2. Consultar \n " +
                                "3. Salir");
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
            }


        } while(opcion!=3);
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
