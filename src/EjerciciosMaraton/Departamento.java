package EjerciciosMaraton;

import java.util.ArrayList;
import java.util.HashMap;

public class Departamento {

    private HashMap<String,ArrayList<Infante>> ciudades = new HashMap<>();
    private String nombre;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public void addChild(String ciudad, ArrayList<Infante> infantes){
        ciudades.put(ciudad,infantes);
    }


    public HashMap<String, ArrayList<Infante>> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashMap<String, ArrayList<Infante>> ciudades) {
        this.ciudades = ciudades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
