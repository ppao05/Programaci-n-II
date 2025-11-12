/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo6;

/**
 *
 * @author ppasa
 */
public class MainStock {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("P001", "Arroz 1kg", 1500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares Bluetooth", 8500, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera negra", 3000, 35, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Tostadora", 12000, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Galletitas", 900, 80, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("----- 2) Listar todos los productos -----");
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n----- 3) Buscar producto por ID (P003) -----");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\n----- 4) Productos de la categoría ALIMENTOS -----");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n----- 5) Eliminar producto con ID P002 -----");
        boolean eliminado = inventario.eliminarProducto("P002");
        if (eliminado) {
            System.out.println("Producto P002 eliminado correctamente.");
        } else {
            System.out.println("No se encontró el producto P002.");
        }
        System.out.println("Productos restantes:");
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto existente.
        System.out.println("\n----- 6) Actualizar stock de P001 a 100 unidades -----");
        boolean actualizado = inventario.actualizarStock("P001", 100);
        if (actualizado) {
            System.out.println("Stock de P001 actualizado.");
        } else {
            System.out.println("No se encontró el producto P001.");
        }
        inventario.buscarProductoPorId("P001").mostrarInfo();

        // 7. Mostrar el total de stock disponible.
        System.out.println("\n----- 7) Total de stock disponible -----");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de unidades en stock: " + totalStock);

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\n----- 8) Producto con mayor stock -----");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        } else {
            System.out.println("No hay productos en el inventario.");
        }

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n----- 9) Productos con precio entre $1000 y $3000 -----");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n----- 10) Categorías disponibles -----");
        inventario.mostrarCategoriasDisponibles();
    }
}


