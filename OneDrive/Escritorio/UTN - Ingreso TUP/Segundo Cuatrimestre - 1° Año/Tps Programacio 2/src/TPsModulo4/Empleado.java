/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo4;

/**
 *
 * @author ppasa
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados = 0;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0;
        totalEmpleados++;
    }
    
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }
    
    public void actualizarSalario(int cantidad) {
        this.salario += cantidad;
    }
    
    @Override
    public String toString() {
        return "Empleado [ID =" + id +
                ", Nombre=" + nombre +
                ", Puesto=" + puesto +
                ", salario=$" + salario + "]";
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    public double getSalario() {
        return salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void setSalario(double salario) {
        if (salario > 0 ) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser mayor que 0");
        }
    }
}
