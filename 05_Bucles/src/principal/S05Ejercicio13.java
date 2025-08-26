package principal;

import java.util.Scanner;

/**
 * Escribe un programa que lea una lista de diez números y determine cuántos son
 * positivos, y cuántos son negativos.
 *
 */
public class S05Ejercicio13 {

    public static void main(String[] args) {

        final int MAX_NUMEROS = 10;
        int numero;
        int positivos = 0;
        int negativos = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < MAX_NUMEROS; i++) {
            System.out.print("Introduce el número " + (i + 1) + "º: ");
            numero = teclado.nextInt();
            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }

        } // Fin for

        System.out.printf("Has introducido %d numeros positivos y %d negativos.%n", positivos, negativos);

    } // Fin main

} // Fin class
