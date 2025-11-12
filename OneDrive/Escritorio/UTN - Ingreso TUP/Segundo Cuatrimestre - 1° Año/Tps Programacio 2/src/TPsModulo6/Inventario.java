/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo6;

/**
 *
 * @author ppasa
 */

import java.util.ArrayList;
public class Inventario {
    

    private ArrayList<Producto> productos = new ArrayList<>();

    // Agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Listar todos los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // Buscar producto por ID (devuelve el objeto o null)
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    // Eliminar producto por ID (devuelve true si lo elimina)
    public boolean eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            return true;
        }
        return false;
    }

    // Actualizar stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // Filtrar por categoría (imprime los productos de esa categoría)
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        boolean alguno = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                alguno = true;
            }
        }
        if (!alguno) {
            System.out.println("No hay productos en la categoría: " + categoria);
        }
    }

    // Obtener total de stock (suma de cantidades)
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Obtener producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        return max;
    }

    // Filtrar productos por rango de precio
    public void filtrarProductosPorPrecio(double min, double max) {
        boolean alguno = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                alguno = true;
            }
        }
        if (!alguno) {
            System.out.println("No hay productos con precio entre $" + min + " y $" + max);
        }
    }

    // Mostrar categorías disponibles con descripciones
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }
}


