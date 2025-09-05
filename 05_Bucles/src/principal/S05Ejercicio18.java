package principal;

import java.util.Scanner;

/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 *
 */
public class S05Ejercicio18 {

    public static void main(String[] args) {
        int numero1;
        int numero2;

        boolean entradaCorrecta;

        Scanner teclado = new Scanner(System.in);

        do {
            entradaCorrecta = true;
            System.out.print("Introduce el primer número: ");
            numero1 = teclado.nextInt();
            System.out.print("Introduce el segundo número: ");
            numero2 = teclado.nextInt();
            if (numero1 == numero2) {
                System.err.println("Los dos números no pueden ser iguales");
                entradaCorrecta = false;
            }
        } while (!entradaCorrecta);

        if (numero1 > numero2) {
            int auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }

        for (int i = numero1; i <= numero2; i += 7) {
            System.out.print(i + " - ");
        } // Fin for

    } // Fin main

} // Fin class
