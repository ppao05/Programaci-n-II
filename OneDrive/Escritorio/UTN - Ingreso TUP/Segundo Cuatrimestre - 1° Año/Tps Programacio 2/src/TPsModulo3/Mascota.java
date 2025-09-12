/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo3;

/**
 *
 * @author ppasa
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Especie: " + especie);
    System.out.println("Edad: " + edad + " años");
}
public void cumplirAnios() {
    edad++;
    System.out.println("¡Feliz cumpleaños, " + nombre + "! Ahora tiene " + edad + " años.");
}

public static void main(String[] args) {
    Mascota miMascota = new Mascota("Atila", "Perro", 10);
    
    System.out.println("Información de la mascota:");
        miMascota.mostrarInfo();
        
    System.out.println("\nSimulando el paso de un año...");
        miMascota.cumplirAnios();

    System.out.println("\nInformación actualizada de la mascota:");
        miMascota.mostrarInfo();
}

}
    

