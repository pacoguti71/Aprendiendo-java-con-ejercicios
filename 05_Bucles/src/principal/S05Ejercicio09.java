package principal;

import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente,
 * con la salvedad de que el anterior estaba limitado a números de 5 dígitos
 * como máximo. En esta ocasión, hay que realizar el ejercicio utilizando
 * bucles; de esta manera, la única limitación en el número de dígitos la
 * establece el tipo de dato que se utilice (int o long).
 *
 */
public class S05Ejercicio09 {

    public static void main(String[] args) {

        long numeroOriginal;
        long numero;
        int digitos = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número (max 19 digitos): ");
        numeroOriginal = teclado.nextLong();
        numero = numeroOriginal;

        while (numero >= 1) {
            digitos++;
            numero /= 10;
        }

        System.out.printf("El número %d tiene %d%n", numeroOriginal, digitos);

    } // Fin main

} // Fin class
