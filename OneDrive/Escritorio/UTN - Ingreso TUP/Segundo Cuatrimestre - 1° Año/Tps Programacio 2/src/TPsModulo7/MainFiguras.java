/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo7;

/**
 *
 * @author ppasa
 */
public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo(2.5);
        figuras[1] = new Rectangulo(4, 3);
        figuras[2] = new Circulo(1.2);

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - Área: " + f.calcularArea());
        }
    }
}
