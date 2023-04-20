package Recursos;

import javax.swing.JOptionPane;
public class Recursos {

    /**
     * Método que permite leer un dato double
     *
     * @param mensaje mensaje a mostrar en pantalla
     * @return retorna el valor double obtenido
     */
    public static double leerDouble(String mensaje) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
        return num;
    }

    /**
     * Método que permite leer un dato entero
     *
     * @param mensaje mensaje a mostrar en pantalla
     * @return retorna el valor entero obtenido
     */
    public static int leerInt(String mensaje) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        return num;
    }

    /**
     * Método que permite leer un dato String
     * @param mensaje mensaje a mostrar en pantalla
     * @return retorna el valor string obtenido
     */
    public static String leerString(String mensaje) {
        String msj = "";
        msj = JOptionPane.showInputDialog(null, mensaje);
        return msj;
    }

    /**
     * Método que permite imprimir un mensaje en pantalla
     *
     * @param mensaje mensaje a mostrar en pantalla
     */
    public static void imprimir(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Método que permite imprimir un mensaje en consola
     * @param mensaje
     */
    public static void imprimirConsola(String mensaje) {
        System.out.println(mensaje);
    }
}
