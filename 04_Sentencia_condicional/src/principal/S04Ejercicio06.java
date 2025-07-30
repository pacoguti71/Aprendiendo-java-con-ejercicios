package principal;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√(2ℎ/g)
 */
public class S04Ejercicio06 {

    public static void main(String[] args) {
        final double GRAVEDAD = 9.81;

        double altura;
        double tiempo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        altura = teclado.nextDouble();

        tiempo = Math.sqrt(2 * altura / GRAVEDAD);

        System.out.printf("El tiempo que tarda un objeto en caer desde una altura %.2f metros\ndada una aceleración de la gravedad de %.2f m/s2 es de %.2f segundos\n", altura, GRAVEDAD, tiempo);

    } // Fin main

} // Fin class
