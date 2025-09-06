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
public class M2Ejercicio5 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int numero;
        do{
            System.out.print("Ingrese un número o 0 para terminar: ");
            numero = scanner.nextInt();
            if (numero %2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        } while (numero != 0);
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
