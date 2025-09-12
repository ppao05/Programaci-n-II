/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo3;

/**
 *
 * @author ppasa
 */

public class GranjaDigital {
public static void main(String[] args) {

Gallina gallina1 = new Gallina(1, 2);
Gallina gallina2 = new Gallina(2, 1);

gallina1.ponerHuevo();
gallina1.ponerHuevo();
gallina1.envejecer();
gallina2.ponerHuevo();
gallina2.envejecer();
gallina2.ponerHuevo();

gallina1.mostrarEstado();
gallina2.mostrarEstado();
}
}

class Gallina {
   
private int idGallina;
private int edad;
private int huevosPuestos;
// Constructor
public Gallina(int idGallina, int edad) {
this.idGallina = idGallina;
this.edad = edad;
this.huevosPuestos = 0;
}
// Método para simular que la gallina pone un huevo
public void ponerHuevo() {
huevosPuestos++;
System.out.println("La gallina " + idGallina + " ha puesto un huevo.");
}
// Método para simular que la gallina envejece
public void envejecer() {
edad++;
System.out.println("La gallina " + idGallina + " ha envejecido. Nueva edad: " + edad);
}
public void mostrarEstado() {
System.out.println("Gallina " + idGallina + ": Edad = " + edad + " años, Huevos puestos = " + huevosPuestos);
}
}




