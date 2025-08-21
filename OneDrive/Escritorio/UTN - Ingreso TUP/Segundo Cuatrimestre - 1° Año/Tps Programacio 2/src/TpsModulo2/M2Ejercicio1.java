/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpsModulo2;

import java.util.Scanner;

/** Ejercicio 1 Módulo 2
 *Verificación de año Bisiesto
 * @author ppasa
 */
public class M2Ejercicio1 {
    
  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un anio: ");
      int anio = sc.nextInt();
      
      if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
          System.out.println("El anio " + anio + " es bisiesto.");
      }else
          System.out.println("El anio " + anio + " no es bisiesto");
  }
      
    
      
  }
