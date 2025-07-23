package principal;

import java.util.Scanner;

/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
public class S03Ejercicio04 {

    public static void main(String[] args) {

        double numero1;
        double numero2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextDouble();
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextDouble();

        double resultadoSuma = numero1 + numero2;
        double resultadoResta = numero1 - numero2;
        double resultadoMultiplicacion = numero1 * numero2;
        double resultadoDivision = numero1 / numero2;

        System.out.println("");
        System.out.printf("El resultado de sumar %.2f y %.2f es %.2f\n", numero1, numero2, resultadoSuma);
        System.out.printf("El resultado de restar %.2f a %.2f es %.2f\n", numero2, numero1, resultadoResta);
        System.out.printf("El resultado de multiplicar %.2f por %.2f es %.2f\n", numero1, numero2, resultadoMultiplicacion);
        System.out.printf("El resultado de dividir %.2f entre %.2f es %.8f\n", numero1, numero2, resultadoDivision);

    } // Fin main

} // Fin class
