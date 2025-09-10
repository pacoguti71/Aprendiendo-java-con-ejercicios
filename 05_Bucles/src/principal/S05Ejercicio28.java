package principal;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 *
 */
public class S05Ejercicio28 {

    public static void main(String[] args) {
        int numero;
        int resultado = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();

        for (int i = numero; i > 0; i--) {
            resultado *= i;
        } // Fin for

        System.out.printf("El factorial de %d (!%d) es %d%n", numero, numero, resultado);

        teclado.close();

    } // Fin main

} // Fin class
