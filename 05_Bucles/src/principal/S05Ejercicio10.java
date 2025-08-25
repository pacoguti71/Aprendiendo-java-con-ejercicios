package principal;

import java.util.Scanner;

/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 */
public class S05Ejercicio10 {

    public static void main(String[] args) {

        int numero = 0;
        double suma = 0;
        int contador = -1;
        double media;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce un número (negativo para salir): ");
            suma += numero;
            contador++;
        } while ((numero = teclado.nextInt()) >= 0);

        media = suma / contador;
        System.out.println("La media es: " + media);

    } // Fin main

} // Fin class
