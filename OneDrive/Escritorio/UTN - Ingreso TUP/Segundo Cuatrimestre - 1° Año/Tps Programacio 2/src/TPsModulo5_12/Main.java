/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_12;

/**
 *
 * @author ppasa
 */
public class Main {
  
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Paola Pasallo", "20-12345678-9");
        Impuesto impuesto = new Impuesto(15000.75, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}


