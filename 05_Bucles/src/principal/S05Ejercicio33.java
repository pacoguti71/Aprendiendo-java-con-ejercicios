package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
 * El programa pedirá la altura. Fíjate que el programa inserta un espacio y
 * pinta dos asteriscos menos en la base para simular la curvatura de las
 * esquinas inferiores.
 *
 */
public class S05Ejercicio33 {

    public static void main(String[] args) {
        int altura;
        int ancho;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        altura = teclado.nextInt();
        ancho = altura - 2;

        // col 1 2 3 4 5
        // f1  *       *
        // f2  *       *
        // f3  *       *
        // f4  *       *
        // f5    * * *  
        for (int i = 1; i <= altura - 1; i++) {
            System.out.println("* " + "  ".repeat(ancho) + "*");
        } // Fin for

        System.out.println("  " + "* ".repeat(ancho));

        System.out.println("");
        System.out.println("-------------------");
        System.out.println("");

        for (int i = 1; i <= altura - 1; i++) {
            System.out.print("* ");
            for (int j = 2; j <= altura - 1; j++) {
                System.out.print("  ");
            } // Fin for
            System.out.println("*");
        } // Fin for

        System.out.print("  ");
        for (int j = 2; j <= altura - 1; j++) {
            System.out.print("* ");
        } // Fin for

        System.out.println("");
    } // Fin main

} // Fin class
