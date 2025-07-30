package principal;

import java.util.Scanner;

/**
 * Realiza un programa que calcule la media de tres notas.
 *
 */
public class S04Ejercicio07 {

    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;
        double notaMedia;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Introduce la tercera nota: ");
        nota3 = teclado.nextDouble();

        notaMedia = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La nota media de %.2f, %.2f y %.2f es %.2f\n", nota1, nota2, nota3, notaMedia);

    } // Fin main

} // Fin class
