/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo3;

/**
 *
 * @author ppasa
 */
public class Estudiante {
    
    private final String nombre;
    private final String apellido;
    private final String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
}

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
}

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
}
     public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
}

public static void main(String[] args) {
     Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Matemática", 7.5);
     System.out.println("Información inicial:");
     estudiante1.mostrarInfo();
     
     estudiante1.subirCalificacion(1.0);
     System.out.println("\nLuego de subir calificación:");
     estudiante1.mostrarInfo();

     estudiante1.bajarCalificacion(0.5);
     System.out.println("\nLuego de bajar calificación:");
     estudiante1.mostrarInfo();
}
}
