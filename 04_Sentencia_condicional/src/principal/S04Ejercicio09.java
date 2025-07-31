package principal;

import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * 𝑎𝑥^2 + 𝑏𝑥 + 𝑐 = 0).
 *
 */
public class S04Ejercicio09 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double resultado;
        double resultado1;
        double resultado2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        a = teclado.nextInt();
        System.out.print("Introduce el valor de b: ");
        b = teclado.nextInt();
        System.out.print("Introduce el valor de c: ");
        c = teclado.nextInt();

        double discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            resultado1 = (-b + Math.sqrt(discriminante) / (2.0 * a));
            resultado2 = (-b - Math.sqrt(discriminante) / (2.0 * a));
            System.out.println("La ecuación tiene dos soluciones reales:");
            System.out.println("x1 = " + resultado1);
            System.out.println("x2 = " + resultado2);
        } else if (discriminante == 0) {
            resultado = -b / (2.0 * a);
            System.out.println("La ecuación tiene una solución real:");
            System.out.println("x = " + resultado);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
            System.out.println("Las soluciones son complejas o imaginarias.");
            double parteReal = -b / (2.0 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }

    } // Fin main

} // Fin class
