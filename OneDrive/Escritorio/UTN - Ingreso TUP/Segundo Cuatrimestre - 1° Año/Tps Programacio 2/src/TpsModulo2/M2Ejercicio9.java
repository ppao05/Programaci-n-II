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
public class M2Ejercicio9 {
    public static
            double calcularCostoEnvio(double peso, String zona){
            double costoEnvio =0;
            
            if(zona.equalsIgnoreCase("Nacional")){
                costoEnvio = peso * 5;
            } else if (zona.equalsIgnoreCase("Internacional")) {
                costoEnvio = peso * 10;
            } else {
                System.out.println("Zona invalida");
            }
            return costoEnvio;
            
}
       
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en Kg: ");
        double peso = sc.nextDouble();
       
        
        sc.nextLine();
        System.out.print("Ingrese la zona de envío: (Nacional o Internacional): ");
        String zona = sc.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
        sc.close();
    }
}
