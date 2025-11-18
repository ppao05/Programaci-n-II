/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo8;

/**
 *
 * @author ppasa
 */
public class MainEcommerce {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Paola", "paola@example.com");

        Producto p1 = new Producto("Mouse gamer", 15000);
        Producto p2 = new Producto("Teclado mecánico", 30000);
        Producto p3 = new Producto("Auriculares", 12000);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        pedido.mostrarResumen();

        // Cambiar estado y notificar
        pedido.cambiarEstado(Pedido.EstadoPedido.PAGADO);

        // Medios de pago
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        PayPal paypal = new PayPal("paola.paypal@example.com");

        double total = pedido.calcularTotal();

        System.out.println("\n--- Pago con tarjeta de crédito (con descuento) ---");
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(totalConDescuento);

        System.out.println("\n--- Pago con PayPal (sin descuento) ---");
        paypal.procesarPago(total);
    }
}

