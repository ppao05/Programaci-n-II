/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpsModulo2;

import java.util.Scanner;

/**Modulo 2 ejercicio 3
 * Crear un programa donde el usuario ingrese su edad y se indique su rango etario
 *
 * @author ppasa
 */
public class M2Ejercicio3 {
    
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in); 
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
    if(edad < 12){
        System.out.println("Niño.");
    } else if(edad >= 12 && edad <=17){
        System.out.println("Adolescente.");
    } else if (edad >= 18 && edad <= 59) {
        System.out.println("Adulto.");
    }else {
        System.out.println("Adulto mayor.");
    }
        
    }
       
}
