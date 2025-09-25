/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_10;

/**
 *
 * @author ppasa
 */
public class Main {
    
    public static void main(String[] args) {
        Titular titular = new Titular("Paola Pasallo", "12345678");

        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 50000.0, titular);

        System.out.println(cuenta);
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
    }
}


