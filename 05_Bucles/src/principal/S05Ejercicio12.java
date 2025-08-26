package principal;

import java.util.Scanner;

/**
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
 * debe introducir por teclado.
 *
 */
public class S05Ejercicio12 {

    public static void main(String[] args) {
        int numero;
        int cifraMostrar;
        int cifraAnterior1 = 0;
        int cifraAnterior2 = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce cuántos números quieres ver: ");
        numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print(cifraAnterior1 + " ");
            cifraMostrar = cifraAnterior1 + cifraAnterior2;
            cifraAnterior1 = cifraAnterior2;
            cifraAnterior2 = cifraMostrar;
        } // Fin for

    } // Fin main

} // Fin class
