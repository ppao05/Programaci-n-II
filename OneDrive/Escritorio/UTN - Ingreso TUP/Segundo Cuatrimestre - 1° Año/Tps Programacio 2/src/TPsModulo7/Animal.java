/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo7;

/**
 *
 * @author ppasa
 */
public class Animal {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void describirAnimal() {
        System.out.println("Soy un animal de tipo: " + this.getClass().getSimpleName());
    }
}
