package principal;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un rectángulo.
 *
 */
public class S03Ejercicio05 {

    public static void main(String[] args) {

        double lado1;
        double lado2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un lado del rectángulo: ");
        lado1 = teclado.nextDouble();
        System.out.print("Introduce el otro lado del rectángulo: ");
        lado2 = teclado.nextDouble();

        double areaRectangulo = lado1 * lado2;

        System.out.printf("El area de un rectángulo de lados %.2f y %.2f es %.2f\n", lado1, lado2, areaRectangulo);

    } // Fin main

} // Fin class
