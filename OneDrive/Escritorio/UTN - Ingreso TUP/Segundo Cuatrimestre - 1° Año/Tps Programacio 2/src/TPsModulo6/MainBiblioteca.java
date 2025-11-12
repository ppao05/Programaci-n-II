/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo6;

/**
 *
 * @author ppasa
 */
public class MainBiblioteca {
    
    public static void main(String[] args) {

        // 1. Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "Julio Cortázar", "Argentina");
        Autor a3 = new Autor("A003", "J. K. Rowling", "Británica");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "El coronel no tiene quien le escriba", 1961, a1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, a2);
        biblioteca.agregarLibro("ISBN004", "Harry Potter y la piedra filosofal", 1997, a3);
        biblioteca.agregarLibro("ISBN005", "Harry Potter y la cámara secreta", 1998, a3);

        // 4. Listar todos los libros con su información y la del autor.
        System.out.println("---- 4) Listar todos los libros ----");
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n---- 5) Buscar libro por ISBN (ISBN003) ----");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro con ese ISBN.");
        }

        // 6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\n---- 6) Libros publicados en 1997 ----");
        biblioteca.filtrarLibrosPorAnio(1997);

        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n---- 7) Eliminar libro ISBN002 y listar restantes ----");
        boolean eliminado = biblioteca.eliminarLibro("ISBN002");
        if (eliminado) {
            System.out.println("Libro ISBN002 eliminado correctamente.");
        } else {
            System.out.println("No se encontró el libro ISBN002.");
        }
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n---- 8) Cantidad total de libros ----");
        System.out.println("Total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n---- 9) Autores disponibles en la biblioteca ----");
        biblioteca.mostrarAutoresDisponibles();
    }
}


