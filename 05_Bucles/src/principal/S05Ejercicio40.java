package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 *
 */
public class S05Ejercicio40 {

    public static void main(String[] args) {
        final int LIMITE = 3;
        int altura;
        int mitad;

        boolean entradaCorrecta;

        Scanner teclado = new Scanner(System.in);

        do {
            entradaCorrecta = true;
            System.out.println("Introduce la altura: ");
            altura = teclado.nextInt();
            if (altura < LIMITE || altura % 2 == 0) {
                System.err.println("Debes introducir un número impar mayor o igual a " + LIMITE);
                entradaCorrecta = false;
            }
        } while (!entradaCorrecta);

        mitad = altura / 2;

//| línea resultante | fila | espacios antes | primer asterisco | espacios entre | segundo asterisco |
//                            mitad-fila                          (2*fila)-1
//| ---------------- | ---- | ---------------| ---------------- | -------------- | ----------------- |
//| `  *`            | 0    | 2              | *                | -              | -                 |
//| ` * *`           | 1    | 1              | *                | 1              | *                 |
//| `*   *`          | 2    | 0              | *                | 3              | *                 |
        for (int fila = 0; fila <= mitad; fila++) {
            for (int columna = 0; columna < mitad - fila; columna++) {
                System.out.print(" ");
            } // Fin for
            System.out.print("*");
            if (fila > 0) {
                for (int columna = 0; columna < (2 * fila) - 1; columna++) {
                    System.out.print(" ");
                } // Fin for
                System.out.print("*");
            }
            System.out.println();
        } // Fin for

        for (int fila = mitad-1; fila >= 0; fila--) {
            for (int columna = 0; columna < mitad - fila; columna++) {
                System.out.print(" ");
            } // Fin for
            System.out.print("*");
            if (fila > 0) {
                for (int columna = 0; columna < (2 * fila) - 1; columna++) {
                    System.out.print(" ");
                } // Fin for
                System.out.print("*");
            }
            System.out.println();
        } // Fin for
        
        
        

    } // Fin main

} // Fin class
