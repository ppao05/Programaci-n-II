/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_13;

/**
 *
 * @author ppasa
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Paola Pasallo", "Paola.Pasallo@email.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("ABC123XYZ", usuario);
    }
}


