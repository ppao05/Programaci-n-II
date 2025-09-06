/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpsModulo2;

/**
 *
 * @author ppasa
 */
public class M2Ejercicio12 {
    public static void main(String[] args) {
        double [] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        for (double precio: precios){
            System.out.println("Precio: $ " + precio);
        }
        
        precios[1] = 279.5;
        
        System.out.println("\nPrecios modificados:");
        for(double precio: precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
