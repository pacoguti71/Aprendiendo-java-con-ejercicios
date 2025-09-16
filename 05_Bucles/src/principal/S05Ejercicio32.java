package principal;

import java.util.Scanner;

/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
 * de izquierda a derecha. Usa long en lugar de int donde sea necesario para
 * admitir números largos.
 *
 */
public class S05Ejercicio32 {

    public static void main(String[] args) {
        long numero;
        int longitud;
        int digito;
        int suma = 0;

        StringBuilder pares = new StringBuilder();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        numero = teclado.nextLong();

        longitud = (int) Math.log10(numero) + 1;

        for (int i = longitud; i >= 1; i--) {
            digito = (int) numero % 10;
            if (digito % 2 == 0) {
                pares.insert(0, digito + " ");
                suma += digito;
            }
            numero /= 10;
        } // Fin for

        System.out.printf("Digitos pares: %s%n", pares);
        System.out.printf("Suma de los dígitos pares: %d%n", suma);

    } // Fin main

} // Fin class
