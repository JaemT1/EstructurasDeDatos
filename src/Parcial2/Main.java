package Parcial2;

import java.util.ArrayList;

public class Main {
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    public static void main(String[] args) {
        Vehiculo<String, Integer, Double> volkswagen = new Vehiculo<>("Volkswagen", 2023, "Negro Igneous", 1200000.0);
        Vehiculo<String, Integer, Double> nissan = new Vehiculo<>("nissan", 1998, "Azul", 2500000.0);
        Vehiculo<String, Integer, Double> toyota = new Vehiculo<>("toyota", 2012, "Amarillo", 5600000.0);
        Vehiculo<String, Integer, Double> subaru = new Vehiculo<>("subaru", 1988, "Negro", 8900000.0);

        agregar(volkswagen);
        agregar(nissan);
        agregar(toyota);
        agregar(subaru);

        listar();


    }

    public static void agregar(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        System.out.println("Se agregó correctamente");
    }

    public static void listar(){
        for (Vehiculo vehiculo: vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }
}