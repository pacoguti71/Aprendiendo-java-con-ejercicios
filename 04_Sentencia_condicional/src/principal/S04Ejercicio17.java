package principal;

/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 */
import java.util.Scanner;

public class S04Ejercicio17 {

    public static void main(String[] args) {
        int numero;
        int ultimaCifra;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        numero = teclado.nextInt();

        // 65748 divido entre 10, el resultado es 6574 y el resto 8
        ultimaCifra = numero % 10;

        System.out.printf("La última cifra del número %d es %d\n", numero, ultimaCifra);

    } // Fin main

} // Fin class
