package principal;

import java.util.Scanner;

/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide
 * hueca.
 */
public class S05Ejercicio20 {

    public static void main(String[] args) {
        int altura;
        char caracter;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        altura = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Introduce el caracter a usar: ");
        caracter = teclado.nextLine().charAt(0);

        // altura=5
        //    *     i=1 -> (4 +1*        ) -> altura-i + (i*2)-1
        //   * *    i=2 -> (3 +1* 1*     ) -> altura-i + * + espacios+ (i*2)-1
        //  *   *   i=3 -> (2 +1*  1*    ) -> altura-i + * + espacios+ (i*2)-1
        // *     *  i=4 -> (1 +1*   1*   ) -> altura-i + * + espacios+ (i*2)-1
        //********* i=5 -> (0 +*******  ) -> altura-i + *
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            } // Fin for
            for (int j = 1; j <= (2 * i) - 1; j++) {

                if (j == 1 || j == (2 * i) - 1 || i == altura) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            } // Fin for
            System.out.println();
        } // Fin for

    } // Fin main

} // Fin class
