package principal;

import java.util.Scanner;

/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
 * se debe mostrar el total acumulado, el contador de los números introducidos y
 * la media.
 *
 */
public class S05Ejercicio23 {

    public static void main(String[] args) {
        final int SUMA_MAXIMA = 10000;
        int numero;

        int suma = 0;
        int cantNumero = 0;
        double media = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();

            suma += numero;

            cantNumero++;

        } while (suma <= SUMA_MAXIMA);

        media = (double) suma / cantNumero;

        System.out.printf("El total acumulado es %d.%n", suma);
        System.out.printf("Se han introducido %d números.%n", cantNumero);
        System.out.printf("La media es %.2f.%n", media);

    } // Fin main

} // Fin class
