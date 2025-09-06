/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpsModulo2;
import java.util.Scanner;
/**
 *
 * @author ppasa
 */
public class M2Ejercicio10 {
    public static
            int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
               return stockActual - cantidadVendida + cantidadRecibida;
}
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Ingrese el stock actual del producto: ");
                int stockActual = sc.nextInt();
                
                System.out.print("Ingrese la cantidad venida: ");
                int cantidadVendida = sc.nextInt();
                
                System.out.println("Ingrese la cantidad recibida: ");
                int cantidadRecibida = sc.nextInt();
                
                int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
                
                
                System.out.println("El nuevo stock del producto es: " + nuevoStock);
                
                sc.close();
                
            }
}
