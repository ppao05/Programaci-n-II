/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_3;

/**
 *
 * @author ppasa
 */
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");

        Libro libro = new Libro("Cien años de soledad", "978-84-376-0494-7", autor, editorial);

        System.out.println(libro);
        System.out.println("El libro fue escrito por: " + libro.getAutor().getNombre());
        System.out.println("Publicado por la editorial: " + libro.getEditorial().getNombre());
    }
}


