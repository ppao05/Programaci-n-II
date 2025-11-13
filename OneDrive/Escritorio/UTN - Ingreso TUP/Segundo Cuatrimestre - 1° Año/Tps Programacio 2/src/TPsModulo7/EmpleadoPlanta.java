/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo7;

/**
 *
 * @author ppasa
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private int antiguedad; // años

    public EmpleadoPlanta(String nombre, double sueldoBase, int antiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + antiguedad * 5000; // ejemplo de plus por antigüedad
    }
}
