package principal;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula 𝑉=1/3
 * 𝜋𝑟^2 ℎ
 *
 */
public class S03Ejercicio09 {

    public static void main(String[] args) {
        double radio;
        double altura;
        double volumen;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio de la base del cono: ");
        radio = teclado.nextDouble();
        System.out.print("Introduce la altura del cono: ");
        altura = teclado.nextDouble();
        volumen = Math.PI * Math.pow(radio, 2) * altura / 3;
        System.out.printf("El volumen de un cono de radio %.2f y altura %.2f es %.2f\n", radio, altura, volumen);

    } // Fin main

} // Fin class
