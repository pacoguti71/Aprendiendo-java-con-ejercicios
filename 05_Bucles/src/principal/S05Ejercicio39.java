package principal;

import java.util.Scanner;

/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto con
 * su factorial.
 *
 */
public class S05Ejercicio39 {

    public static void main(String[] args) {
        int numero;
        int factorial;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            } // Fin for
            System.out.println(i + "! = " + factorial);
        } // Fin for

    } // Fin main

} // Fin class
