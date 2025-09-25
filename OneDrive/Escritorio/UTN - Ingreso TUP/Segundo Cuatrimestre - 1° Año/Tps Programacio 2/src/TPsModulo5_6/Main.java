/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_6;

/**
 *
 * @author ppasa
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Paola Pasallo", "1122334455");
        Mesa mesa = new Mesa(12, 4);

        Reserva reserva = new Reserva("2025-09-30", "21:00", cliente, mesa);

        System.out.println(reserva);
        System.out.println("Cliente de la reserva: " + reserva.getCliente().getNombre());
        System.out.println("Mesa reservada: " + reserva.getMesa().getNumero());
    }
}


