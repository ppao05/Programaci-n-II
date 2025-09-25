/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_8;

/**
 *
 * @author ppasa
 */
public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Paola Pasallo", "paola@email.com");

        Documento documento = new Documento(
            "Contrato Laboral",
            "Este documento certifica la relación laboral...",
            usuario
        );

        System.out.println(documento);
        System.out.println("Usuario que firmó: " + documento.getFirmaDigital().getUsuario().getNombre());
    }

}
