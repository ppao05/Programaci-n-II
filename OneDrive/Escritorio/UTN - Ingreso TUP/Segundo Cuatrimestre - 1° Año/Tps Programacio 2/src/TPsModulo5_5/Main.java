/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_5;

/**
 *
 * @author ppasa
 */
public class Main {
  
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("MSI B550", "AMD B550");
        Propietario propietario = new Propietario("Paola Pasallo", "37474127");

        Computadora pc = new Computadora("MSI", "PC-2025-001", placa, propietario);

        System.out.println(pc);
        System.out.println("El propietario accede a su computadora: " + propietario.getComputadora().getMarca());
    }
}


