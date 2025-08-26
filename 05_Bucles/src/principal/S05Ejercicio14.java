package principal;

import java.util.Scanner;

/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 *
 */
public class S05Ejercicio14 {

    public static void main(String[] args) {

        int base;
        int exponente;
        int resultado = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la base a elevar: ");
        base = teclado.nextInt();
        System.out.print("Introduce el exponente: ");
        exponente = teclado.nextInt();

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        } // Fin for

        System.out.printf("El número %d elevado a la potencia %d es %d.%n", base, exponente, resultado);

        resultado = (int) Math.pow(base, exponente);

        System.out.printf("El número %d elevado a la potencia %d es %d.%n", base, exponente, resultado);

    } // Fin main

} // Fin class
