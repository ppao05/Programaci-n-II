/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo3;

/**
 *
 * @author ppasa
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100;
    public NaveEspacial(String nombre, int combustible) {
    this.nombre = nombre;
    if (combustible > LIMITE_COMBUSTIBLE) {
    this.combustible = LIMITE_COMBUSTIBLE;
} else {
    this.combustible = combustible;
}
}
    public void despegar() {
        if (combustible >= 10) {
        combustible -= 10;
        System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
}   else {
    System.out.println("No hay suficiente combustible para despegar.");
}
}
    public void avanzar(int distancia) {
    int consumo = distancia * 2;
    if (combustible >= consumo) {
    combustible -= consumo;
    System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
}   else {
    System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
}
}
    public void recargarCombustible(int cantidad) {
    if (combustible + cantidad > LIMITE_COMBUSTIBLE) {
    System.out.println("No se puede recargar esa cantidad. Se superaría el límite de combustible.");
} else {
    combustible += cantidad;
    System.out.println("Combustible recargado. Combustible actual: " + combustible);
}
}
    public void mostrarEstado() {
    System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
}
    public static void main(String[] args) {
    NaveEspacial nave = new NaveEspacial("Atila", 50);
    nave.despegar(); // Intenta despegar
    nave.avanzar(30); // Intenta avanzar sin recargar (debería fallar si no hay suficiente)
    nave.recargarCombustible(40); // Recarga combustible
    nave.avanzar(20); // Ahora debería poder avanzar
    nave.mostrarEstado(); // Muestra el estado final
}
}


