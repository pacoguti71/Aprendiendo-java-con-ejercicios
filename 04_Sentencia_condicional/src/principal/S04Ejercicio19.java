package principal;

import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 */
public class S04Ejercicio19 {

    public static void main(String[] args) {
        int numero;
        int numDigitos = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero de 5 cifras como máximo.");
        numero = teclado.nextInt();
        numero = Math.abs(numero);

        if (numero < 10) {
            numDigitos = 1;
        } else if (numero < 100) {
            numDigitos = 2;
        } else if (numero < 1000) {
            numDigitos = 3;
        } else if (numero < 10000) {
            numDigitos = 4;
        } else if (numero < 100000) {
            numDigitos = 5;
        } else {
            System.err.println("El número introducido tiene más de cinco cifras.");
        }

        System.out.println("El número de dígitos es: " + (numDigitos > 0 ? numDigitos : "no puedo calcularlo."));

        System.out.println("\n************* OTRA FORMA *************\n");
        String numDigitosString = String.valueOf(numero);
        System.out.printf("El número de dígitos del número es: %s\n", numDigitosString.length());
    } // Fin main

} // Fin class
