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
public class M2Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese unanota entre 0 y 10: ");
            nota = sc.nextInt();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida. Intente nuevamente.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota ingresada: " + nota);
        
        sc.close();
    }
    
}
