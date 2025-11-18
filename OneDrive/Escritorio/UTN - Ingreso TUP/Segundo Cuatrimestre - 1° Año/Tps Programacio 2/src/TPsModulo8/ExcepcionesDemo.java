/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo8;

/**
 *
 * @author ppasa
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExcepcionesDemo {

    // 1) División segura
    public static void divisionSegura(Scanner sc) {
        System.out.println("=== División segura ===");
        try {
            System.out.print("Ingrese el dividendo: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese el divisor: ");
            int b = Integer.parseInt(sc.nextLine());

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar números enteros.");
        }
    }

    // 2) Conversión de cadena a número
    public static void conversionCadenaANumero(Scanner sc) {
        System.out.println("\n=== Conversión de cadena a número ===");
        System.out.print("Ingrese un texto que represente un número entero: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un número entero válido.");
        }
    }

    // 3) Lectura de archivo (manejo FileNotFoundException)
    public static void lecturaArchivo(String ruta) {
        System.out.println("\n=== Lectura de archivo (FileNotFoundException) ===");
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo '" + ruta + "' no existe.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida al leer el archivo.");
        }
    }

    // 4) Excepción personalizada: EdadInvalidaException
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void pruebaEdad(Scanner sc) {
        System.out.println("\n=== Validación de edad con excepción personalizada ===");
        System.out.print("Ingrese una edad: ");
        String texto = sc.nextLine();
        try {
            int edad = Integer.parseInt(texto);
            validarEdad(edad);
        } catch (NumberFormatException e) {
            System.out.println("Error: ingrese un número entero para la edad.");
        } catch (EdadInvalidaException e) {
            System.out.println("Se produjo EdadInvalidaException: " + e.getMessage());
        }
    }

    // 5) try-with-resources para leer archivo
    public static void lecturaArchivoTryWithResources(String ruta) {
        System.out.println("\n=== Lectura de archivo con try-with-resources ===");
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo '" + ruta + "' no existe.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida al leer el archivo con try-with-resources.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1) División segura
        divisionSegura(sc);

        // 2) Conversión de cadena a número
        conversionCadenaANumero(sc);

        // 3) Lectura de archivo (normal)
        lecturaArchivo("ejemplo.txt"); // 

        // 4) Excepción personalizada
        pruebaEdad(sc);

        // 5) try-with-resources
        lecturaArchivoTryWithResources("ejemplo2.txt");

        sc.close();
    }
}

