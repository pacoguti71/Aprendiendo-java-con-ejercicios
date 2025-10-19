package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que
 * comprobar que tanto la anchura como la altura sean mayores o iguales que 2,
 * en caso contrario se debe mostrar un mensaje de error.
 *
 */
public class S05Ejercicio46 {

    public static void main(String[] args) {
        int anchura;
        int altura;

        Scanner teclado = new Scanner(System.in);

        anchura = pedirMedida(teclado, "anchura");
        altura = pedirMedida(teclado, "altura");

        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < anchura; columna++) {
                if (fila == 0 || fila == altura - 1 || columna == 0 || columna == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } // Fin for
            System.out.println("");
        } // Fin for

    } // Fin main

    public static int pedirMedida(Scanner teclado, String variable) {
        int valor;
        do {
            System.out.print("Introduzca la " + variable + ": ");
            valor = teclado.nextInt();
            if (valor < 2) {
                System.err.println("Debes introducir un número mayor o igual que 2.");
            }
        } while (valor < 2);
        return valor;
    }

} // Fin class
