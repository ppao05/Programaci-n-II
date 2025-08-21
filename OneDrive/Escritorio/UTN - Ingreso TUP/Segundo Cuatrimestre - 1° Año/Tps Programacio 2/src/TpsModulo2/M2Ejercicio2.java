/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpsModulo2;

import java.util.Scanner;
        
/** Módulo 2 Ejercicio 2
 * Crear un programa que determine el mayor número de 3 ingresados por el usuario
 *
 * @author ppasa
 */
public class M2Ejercicio2 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Ingrese el numero 1: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa el numero 2: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa el numero 3: ");
        num3 = Integer.parseInt(input.nextLine());
     if (num1 > num2 && num1 > num3) {
         System.out.println("El numero " + num1 + " es el mayor.");
     } else if (num2 > num1 && num2 > num3) {
         System.out.println("El numero" + num2 + " es el mayor");
     } else {
         System.out.println("El numero " + num3 + " es el mayor");
     }
      
       
    
}
}
