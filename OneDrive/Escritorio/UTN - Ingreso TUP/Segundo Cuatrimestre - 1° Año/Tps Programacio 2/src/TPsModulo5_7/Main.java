/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_7;

/**
 *
 * @author ppasa
 */
public class Main {
    
    public static void main(String[] args) {
        Motor motor = new Motor("1.5", "2NR-FE");
        Conductor conductor = new Conductor("Paola Pasallo", "LIC-12345");

        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyoya Yaris", motor, conductor);

        System.out.println(vehiculo);
        System.out.println("Conductor del vehículo: " + vehiculo.getConductor().getNombre());
        System.out.println("Vehículo asignado al conductor: " + conductor.getVehiculo().getModelo());
    }
}

