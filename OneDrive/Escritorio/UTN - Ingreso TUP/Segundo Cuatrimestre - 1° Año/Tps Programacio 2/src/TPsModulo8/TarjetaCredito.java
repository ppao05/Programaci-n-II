/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo8;

/**
 *
 * @author ppasa
 */
class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo: 5% de recargo negativo = 5% de descuento
        double descuento = monto * 0.05;
        return monto - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Pagando con Tarjeta de Crédito (" + numeroTarjeta + ") por $" + montoConDescuento);
    }
}
