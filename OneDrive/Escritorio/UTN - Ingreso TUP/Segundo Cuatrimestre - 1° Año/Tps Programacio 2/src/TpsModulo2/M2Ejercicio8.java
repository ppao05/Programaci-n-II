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
public class M2Ejercicio8 {
    public static 
            double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
            double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
            return precioFinal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();
        
        System.out.print("Ingrese el porcentaje de impuesto (Ejemplo: 10 para 10%): ");
        double impuesto = sc.nextDouble() / 100;
        
        System.out.print("Ingrese el % de descuento (Ejemplo: 5 para 5%): ");
        double descuento = sc.nextDouble() / 100;
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
        
        sc.close();
        
    }
        
}
