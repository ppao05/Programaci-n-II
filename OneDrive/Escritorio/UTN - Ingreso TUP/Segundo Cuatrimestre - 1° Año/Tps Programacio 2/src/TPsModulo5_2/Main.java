/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_2;

/**
 *
 * @author ppasa
 */
public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Samsung-BT5000", 5000);
        Usuario usuario = new Usuario("Paola Pasallo", "37474127");
        Celular celular = new Celular("356789012345678", "Samsung", "Galaxy S25", bateria, usuario);

        System.out.println(celular);
        System.out.println("El usuario accede a su celular: " + usuario.getCelular().getModelo());
    }
}
