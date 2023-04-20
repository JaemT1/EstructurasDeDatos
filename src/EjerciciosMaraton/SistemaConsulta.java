package EjerciciosMaraton;

import javax.swing.*;
import java.util.ArrayList;

public class SistemaConsulta {
    private ArrayList<Departamento> departamentos = new ArrayList<>();

    public void agregarInformacion(){ //Departamento

        int cantDepartamentos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de departamentos que desea agregar"));
        do {
            String nombreDepartamento = JOptionPane.showInputDialog(null, "Ingrese el nombre del departamento número: " + cantDepartamentos);
            Departamento Departamento = new Departamento(nombreDepartamento);
            int cantCiudades = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de ciudades que posee " + nombreDepartamento));
            for (int i = 0; i < cantCiudades; i++) {
                String ciudad = JOptionPane.showInputDialog(null,"Ingrese el nombre de la ciudad " + cantCiudades +" :");
            }

            cantDepartamentos --;
        }while(cantDepartamentos > 0);

    }
}
