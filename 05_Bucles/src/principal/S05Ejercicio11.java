package principal;

import java.util.Scanner;

/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 */
public class S05Ejercicio11 {

    public static void main(String[] args) {

        int numero;
        int cuadrado;
        double cubo;
        int cuboEntero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        numero = teclado.nextInt();

        System.out.printf("%-10s %-10s %-10s%n", "Número", "| Cuadrado", "| Cubo");

        for (int i = numero; i < numero + 5; i++) {
            cuadrado = i * i;
            cubo = Math.pow(i, 3);
            cuboEntero = (int) Math.pow(i, 3);

            System.out.printf("%-10d |%-10d |%-10.2f%n", i, cuadrado, cubo);
            System.out.printf("%-10d |%-10d |%-10d%n", i, cuadrado, cuboEntero);

        } // Fin for

    } // Fin main

} // Fin class
