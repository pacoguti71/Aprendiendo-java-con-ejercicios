package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 *
 */
public class S05Ejercicio25 {

    public static void main(String[] args) {
        int numeroOriginal;
        int numero;
        int numeroReves = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numeroOriginal = teclado.nextInt();
        numero = numeroOriginal;

        while (numero > 0) {
            numeroReves = (numeroReves * 10) + (numero % 10);
            numero = numero / 10;
        }

        System.out.print("El número del revés (con int) es: " + numeroReves + "\n");

        /////////////////////////
        String numeroString;
        String numeroRevesString = "";

        numeroString = String.valueOf(numeroOriginal);

        // 25896
        for (int i = numeroString.length() - 1; i >= 0; i--) {
            numeroRevesString += numeroString.charAt(i);
        } // Fin for

        System.out.print("El número del revés (con String) es: " + numeroRevesString + "\n");

    } // Fin main

} // Fin class
