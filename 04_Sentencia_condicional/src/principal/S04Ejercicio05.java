package principal;

import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b
 * =0).
 */
public class S04Ejercicio05 {

    public static void main(String[] args) {
        int a;
        int b;
        double x;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax+b=0");
        System.out.print("Por favor, introduzca el valor de a: ");
        a = teclado.nextInt();
        System.out.print("Ahora introduzca el valor de b: ");
        b = teclado.nextInt();

        // ax=-b
        // x=-b/a
        if (a == 0) {
            System.err.println("Esa ecuación no tiene solución real");
        } else {
            x = (double) -b / a;
            System.out.printf("X = %.2f\n", x);
        }

    } // Fin main

} // Fin class
