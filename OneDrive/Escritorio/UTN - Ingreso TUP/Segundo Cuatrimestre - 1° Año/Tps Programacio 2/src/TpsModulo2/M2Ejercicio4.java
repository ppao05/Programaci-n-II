/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpsModulo2;

import java.util.Scanner;

/**Modulo 2 Ejercicio 4 
 *Programa donde usuario ingrese precio y categoría de un producto y se imprima por pantalla un descuento según la categoría
 * @author ppasa
 */
public class M2Ejercicio4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = sc.nextDouble();
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = sc.next().toUpperCase();
        double porcentajeDescuento = 0;
        
       switch (categoria) {
           case "A":
               porcentajeDescuento = 0.10;
               break;
           case "B":
               porcentajeDescuento = 0.15;
               break;
           case "C":
               porcentajeDescuento = 0.20;
               break;
           default:
               System.out.println("Categoría no válida");
               
               }
     double montoDescuento = precioOriginal * porcentajeDescuento;
     double precioFinal = precioOriginal - montoDescuento;
     
     System.out.println("Descuento aplicado: " + (int)(porcentajeDescuento * 100) + "%");
     System.out.println("Precio original: " + precioOriginal);
     System.out.println("Precio final: " + precioFinal);
     
    }
    }
    

