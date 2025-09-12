/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo3;

/**
 *
 * @author ppasa
 */
public class Libros {
   
    public static void main(String[] args) {
        Libro libro1 = new Libro();

       
        libro1.setTitulo("El Elegido");
        libro1.setAutor("Andrew Gross");

       
        if (!libro1.setAnioPublicacion(3000)) {
            System.out.println("Intento invalido: anioo 3000 no aceptado.");
        }

        if (libro1.setAnioPublicacion(2016)) {
            System.out.println("Anio cambiado correctamente a 2016.");
        }

        
        System.out.println("Informacion final del libro:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Anio: " + libro1.getAnioPublicacion());
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro() {
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean setAnioPublicacion(int anioPublicacion) {
        int anioActual = java.time.Year.now().getValue();
        if (anioPublicacion > 0 && anioPublicacion <= anioActual) {
            this.anioPublicacion = anioPublicacion;
            return true;
        }
        return false; // 
    }
}

