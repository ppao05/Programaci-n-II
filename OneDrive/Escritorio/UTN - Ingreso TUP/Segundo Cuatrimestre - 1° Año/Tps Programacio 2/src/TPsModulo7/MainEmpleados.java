/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo7;

/**
 *
 * @author ppasa
 */
import java.util.ArrayList;
import java.util.List;

public class MainEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 300000, 3));
        empleados.add(new EmpleadoTemporal("Carlos", 160, 2000));
        empleados.add(new EmpleadoPlanta("Laura", 280000, 5));
        empleados.add(new EmpleadoTemporal("Juan", 100, 1500));

        System.out.println("Sueldos de empleados (polimorfismo):");
        for (Empleado e : empleados) {
            String tipo;
            if (e instanceof EmpleadoPlanta) {
                tipo = "Empleado de planta";
            } else if (e instanceof EmpleadoTemporal) {
                tipo = "Empleado temporal";
            } else {
                tipo = "Desconocido";
            }

            System.out.println(tipo + " - " + e.getNombre()
                    + " - Sueldo: $" + e.calcularSueldo());
        }
    }
}

