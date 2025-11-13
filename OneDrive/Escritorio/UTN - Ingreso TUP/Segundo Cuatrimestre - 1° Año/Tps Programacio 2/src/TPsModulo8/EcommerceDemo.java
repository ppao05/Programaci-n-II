/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo8;

/**
 *
 * @author ppasa
 */
public class EcommerceDemo {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Paola", "paola@example.com");

        Producto p1 = new Producto("Mouse", 5000);
        Producto p2 = new Producto("Teclado", 8000);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Elegimos un medio de pago, por ejemplo PayPal
        PagoConDescuento pago = new PayPal("paola@paypal.com");
        pago.procesarPago(total);

        // Cambiamos estado del pedido (debe notificar al cliente)
        pedido.setEstado("PAGADO");
        pedido.setEstado("ENVIADO");
    }
}
