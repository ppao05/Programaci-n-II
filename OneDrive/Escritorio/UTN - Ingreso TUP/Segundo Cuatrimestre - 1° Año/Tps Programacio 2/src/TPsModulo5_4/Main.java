/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_4;

/**
 *
 * @author ppasa
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco ICBC", "30-12345678-9");
        Cliente cliente = new Cliente("Paola Pasallo", "12345678");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4567-8912-3456-7890", "12/28", cliente, banco);

        System.out.println(tarjeta);
        System.out.println("El cliente accede a su tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("Banco emisor: " + tarjeta.getBanco().getNombre());
    }
}


