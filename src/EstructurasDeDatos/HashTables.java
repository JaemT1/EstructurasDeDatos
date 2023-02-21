package EstructurasDeDatos;

import java.util.Enumeration;
import java.util.Hashtable;
import Recursos.Recursos;
/**
 *
 * @author Nicolas Ramirez Ríos
 * @author Juan Manuel Tunubala Larrota
 */
public class HashTables {
    public static void main(String[] args) {
        Hashtable<String, String>tabla = new Hashtable<String, String>();
        String llave;
        
        int cantDatos = Recursos.leerInt("Ingrese la cantidad de datos a agregar");
        int contador = 0;
        
        //Petición y adición de datos
        while(contador < cantDatos){
            String codigoFacultad = Recursos.leerString("Ingrese el código de la facultad");
            String nombreFacultad = Recursos.leerString("Ingrese el nombre de la facultad");
            tabla.put(codigoFacultad, nombreFacultad);
            contador++;
        }
        
        //Recorriendo la hashtable
        Enumeration<String> nombres;
        nombres = tabla.keys();
        while(nombres.hasMoreElements()){
            llave = (String)nombres.nextElement();
            System.out.println("Código de la facultad: " + llave + ", nombre de la facultad: " + tabla.get(llave));
        }
        
    }
}
