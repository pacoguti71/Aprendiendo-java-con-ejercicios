package principal;

import java.util.Scanner;

/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 *
 */
public class S05Ejercicio29 {

    public static void main(String[] args) {
        int numero;
        int numeroOriginal;
        int divisor;

        Scanner teclado = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
        numeroOriginal = numero;
        System.out.print("Introduce el número que no puede ser un divisor: ");
        divisor = teclado.nextInt();

        while (numero > 0) {
            numero -= 1;
            if (numero % divisor != 0) {
                resultado.append(numero).append(" ");
            }
        }

        System.out.printf("Los número enteros positivos menores que %d que no son divisibles por %d son:%n%s%n",
                numeroOriginal,
                divisor,
                resultado);

    } // Fin main

} // Fin class
