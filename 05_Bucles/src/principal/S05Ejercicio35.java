package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */
public class S05Ejercicio35 {

    public static void main(String[] args) {
        final int LIMITE = 3;
        int altura;
        boolean entradaCorrecta;

        Scanner teclado = new Scanner(System.in);
        do {
            entradaCorrecta = true;
            System.out.print("Introduce la altura: ");
            altura = teclado.nextInt();
            if (altura < LIMITE || altura % 2 == 0) {
                System.err.println("Debe introducir un número impar mayor o igual a " + LIMITE);
                entradaCorrecta = false;
            }
        } while (!entradaCorrecta);

        //altura=5
        //cl 01234
        //f0 *   *      //f0c0            f0c4 altura-fila-1 // 5-0-1=4
        //f1  * *       //    f1c1    f1c3     altura-fila-1 // 5-1-1=3
        //f2   *        //        f2c2
        //f3  * *       //    f3c1    f3c3     altura-fila-1 // 5-3-1=1
        //f4 *   *      //f4c0            f4c4 altura-fila-1 // 5-4-1=0
        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < altura; columna++) {
                if (columna == fila || columna == (altura - fila - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } // Fin for
            System.out.println("");
        } // Fin for

    } // Fin main

} // Fin class
