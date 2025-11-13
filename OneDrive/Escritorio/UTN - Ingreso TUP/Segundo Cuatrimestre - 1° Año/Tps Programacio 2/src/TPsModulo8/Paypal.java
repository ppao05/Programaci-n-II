/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo8;

/**
 *
 * @author ppasa
 */
class PayPal implements PagoConDescuento {
    private String emailCuenta;

    public PayPal(String emailCuenta) {
        this.emailCuenta = emailCuenta;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo: 10% de descuento
        double descuento = monto * 0.10;
        return monto - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Pagando con PayPal (" + emailCuenta + ") por $" + montoConDescuento);
    }
}