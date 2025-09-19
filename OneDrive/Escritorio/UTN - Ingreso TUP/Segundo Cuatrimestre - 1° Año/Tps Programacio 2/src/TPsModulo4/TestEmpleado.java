/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo4;

/**
 *
 * @author ppasa
 */
public class TestEmpleado {
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado(1, "Paola Pasallo", "Desarrolladora,", 55000);
        Empleado emp2 = new Empleado("Carlos Alvarez", "Diseñador");
        Empleado emp3 = new Empleado("Daiana Gomez", "Analista");
        
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        emp1.actualizarSalario(10.0);
        emp2.actualizarSalario(5000);
        
        System.out.println("\nDespues de aumentos:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
