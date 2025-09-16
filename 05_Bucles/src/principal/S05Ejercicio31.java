package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
 * El programa pedirá la altura. El palo horizontal de la L tendrá una longitud
 * de la mitad (división entera entre 2) de la altura más uno.
 *
 */
public class S05Ejercicio31 {

    public static void main(String[] args) {
        int altura;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        altura = teclado.nextInt();

        for (int i = 1; i <= altura - 1; i++) {
            System.out.println("*");
        } // Fin for

        for (int i = 1; i <= (altura / 2) + 1; i++) {
            System.out.print("* ");
        } // Fin for

        System.out.println("");

    } // Fin main

} // Fin class
