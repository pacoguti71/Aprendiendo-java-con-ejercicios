package principal;

import java.util.Scanner;

/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 */
public class S04Ejercicio13 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int auxiliar;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        System.out.print("Introduce el tercer número: ");
        numero3 = teclado.nextInt();

        if (numero1 > numero2) {
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }

        if (numero2 > numero3) {
            auxiliar = numero2;
            numero2 = numero3;
            numero3 = auxiliar;
        }

        if (numero1 > numero2) {
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }

        System.out.printf("El orden de los números es %d -> %d -> %d\n", numero1, numero2, numero3);

    } // Fin main

} // Fin class
