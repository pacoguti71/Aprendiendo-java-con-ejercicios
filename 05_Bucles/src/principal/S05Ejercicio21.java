package principal;

import java.util.Scanner;

/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el
 * cómputo.
 *
 */
public class S05Ejercicio21 {

    public static void main(String[] args) {
        int numero;

        int cantNumeros = 0;

        int cantImpares = 0;
        int sumaImpares = 0;
        double mediaImpares;

        int mayorPares = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce un número (negativo para salir): ");
            numero = teclado.nextInt();

            if (numero > 0) {
                cantNumeros++;

                if (numero % 2 != 0) { //número impar
                    sumaImpares += numero;
                    cantImpares++;
                } else { // número par
                    if (numero > mayorPares) {
                        mayorPares = numero;
                    }
                }
            }

        } while (numero > 0);

        mediaImpares = (double) sumaImpares / cantImpares;

        System.out.printf("Se han introducido %d números.%n", cantNumeros);
        System.out.printf("La media de los números impares es %.2f.%n", mediaImpares);
        System.out.printf("El mayor de los números pares es %d.%n", mayorPares);

    } // Fin main

} // Fin class
