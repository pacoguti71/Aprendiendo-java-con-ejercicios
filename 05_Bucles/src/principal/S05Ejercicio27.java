package principal;

import java.util.Scanner;

/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 *
 */
public class S05Ejercicio27 {

    public static void main(String[] args) {
        final int MULTIPLO = 3;

        int numero;
        int cantMultiplos = 0;
        int sumaMultiplos = 0;

        Scanner teclado = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % MULTIPLO == 0) {
                resultado.append(i).append(" ");
                cantMultiplos++;
                sumaMultiplos += i;
            }
        } // Fin for

        System.out.printf("Cantidad de múltiplos encontrados: %d%n", cantMultiplos);
        System.out.printf("Suma de múltilplos: %d%n", sumaMultiplos);
        System.out.printf("Los múltiplos de %d de %d son: %s%n", MULTIPLO, numero, resultado);

    } // Fin main

} // Fin class
