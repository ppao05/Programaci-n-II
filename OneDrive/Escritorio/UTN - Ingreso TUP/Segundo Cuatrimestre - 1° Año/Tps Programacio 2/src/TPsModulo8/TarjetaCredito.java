/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo8;

/**
 *
 * @author ppasa
 */
public class TarjetaCredito implements PagoConDescuento {

    private String nroTarjeta;

    public TarjetaCredito(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo: 10% de descuento
        double montoConDescuento = monto * 0.90;
        System.out.println("Aplicando 10% de descuento con tarjeta. Total con descuento: $" + montoConDescuento);
        return montoConDescuento;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de crédito " + nroTarjeta);
    }
}

