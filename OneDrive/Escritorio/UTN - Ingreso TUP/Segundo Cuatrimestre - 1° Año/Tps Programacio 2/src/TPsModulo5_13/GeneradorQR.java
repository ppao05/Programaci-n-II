/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_13;

/**
 *
 * @author ppasa
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("QR generado con valor: " + codigo.getValor() +
                           " para el usuario: " + codigo.getUsuario().getNombre() +
                           " (" + codigo.getUsuario().getEmail() + ")");
    }
}


