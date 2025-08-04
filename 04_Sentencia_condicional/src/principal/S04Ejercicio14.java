package principal;

import java.util.Scanner;

/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 */
public class S04Ejercicio14 {

    public static void main(String[] args) {
        int numero;
        boolean esPar = false;
        boolean esDivisible = false;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
        // +-*/ .sqrt() .pow() 4/2=2 resto 0 5/2=2 resto=1
        if (numero % 2 == 0) {
            esPar = true;
        }

        if (numero % 5 == 0) {
            esDivisible = true;
        }

        System.out.printf("El número %d %s par y %s divisible por 5\n", numero, esPar ? "es" : "no es", esDivisible ? "es" : "no es");

    } // Fin main

} // Fin class
