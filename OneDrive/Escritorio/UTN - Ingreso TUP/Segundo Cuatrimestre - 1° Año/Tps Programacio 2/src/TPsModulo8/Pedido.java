/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo8;

/**
 *
 * @author ppasa
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    public enum EstadoPedido {
        PENDIENTE,
        PAGADO,
        ENVIADO,
        ENTREGADO
    }

    private Cliente cliente;
    private List<Producto> productos;
    private EstadoPedido estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Cambia el estado y notifica al cliente
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado de tu pedido cambió a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void mostrarResumen() {
        System.out.println("Pedido de " + cliente.getNombre() + " - Estado: " + estado);
        for (Producto p : productos) {
            System.out.println("  - " + p);
        }
        System.out.println("Total: $" + calcularTotal());
    }
}
