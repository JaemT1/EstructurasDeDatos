package EjerciciosMaraton;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*int ds = calcularDiaSemana(15, 12, 4, 20);
        System.out.println("" + ds);*/

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia del mes"));
        String mesString = JOptionPane.showInputDialog("Ingrese el mes");
        int mes = determinarNumeroMes(mesString);
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
        int siglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el siglo"));



    }


    /*
        D = dia de la fecha a calcular
        M = mes del año empezando desde abril en 1, enero y febrero son 11 y 12
        A = año
        S = siglo a calcular



    */
    public static int calcularDiaSemana(int d, int m, int a, int s){
        int diaSemana = 0;
        diaSemana = ( (Math.abs( ((13*m)-1)/5)) + Math.abs(a/4) + Math.abs(s/4) + d + a - (2*s)) % 7;
        return diaSemana;
    }

    public static int determinarNumeroMes(String mes){
        int numeroMes = 0;
        switch (mes.toUpperCase()) {
            case "ENERO" -> numeroMes = 11;
            case "FEBRERO" -> numeroMes = 12;
            case "MARZO" -> numeroMes = 1;
            case "ABRIL" -> numeroMes = 2;
            case "MAYO" -> numeroMes = 3;
            case "JUNIO" -> numeroMes = 4;
            case "JULIO" -> numeroMes = 5;
            case "AGOSTO" -> numeroMes = 6;
            case "SEPTIEMBRE" -> numeroMes = 7;
            case "OCTUBRE" -> numeroMes = 8;
            case "NOVIEMBRE" -> numeroMes = 9;
            case "DICIEMBRE" -> numeroMes = 10;
        }
        return numeroMes;
    }

    public static int determinarSiglo(int anio, int mes){
        int siglo=(anio/100)+1;
        if (mes == 11 || mes == 12) {
            siglo = siglo - 1;
        }
        if (anio % 100 == 0) {
            siglo = siglo - 1;
        }
        return siglo;
    }
}
