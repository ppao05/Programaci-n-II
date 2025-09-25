/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5;

/**
 *
 * @author ppasa
 */
public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("fotoPaola.jpg", "JPG");
        Titular titular = new Titular("Paola Pasallo", "12345678");
        Pasaporte pasaporte = new Pasaporte("AR12345", "2025-01-01", foto, titular);

        System.out.println(pasaporte);
        System.out.println("El titular accede a su pasaporte: " + titular.getPasaporte().getNumero());
    }
}
