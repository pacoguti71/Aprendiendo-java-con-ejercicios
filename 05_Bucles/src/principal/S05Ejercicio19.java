package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 *
 */
public class S05Ejercicio19 {

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
        //    *     i=1 -> (4 +1*) -> altura-i + (i*2)-1
        //   ***    i=2 -> (3 +3*) -> altura-i + (i*2)-1
        //  *****   i=3 -> (2 +5*) -> altura-i + (i*2)-1
        // *******  i=4 -> (1 +7*) -> altura-i + (i*2)-1
        //********* i=5 -> (0 +9*) -> altura-i + (i*2)-1
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            } // Fin for
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(caracter);
            } // Fin for
            System.out.println();
        } // Fin for
        
        for (int i = 1; i <= altura; i++) {
            String espacios=" ".repeat(altura-i);
            String caracteres=String.valueOf(caracter).repeat((2 * i) - 1);
            System.out.println(espacios+caracteres);
        } // Fin for

    } // Fin main

} // Fin class
