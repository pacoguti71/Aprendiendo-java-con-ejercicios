package principal;

import java.util.Scanner;

/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 */
public class S04Ejercicio20 {

    public static void main(String[] args) {
        int numero;
        boolean esCapicua = false;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero de cinco cifras como máximo: ");
        numero = teclado.nextInt();

        if (numero < 10) {
            esCapicua = true;
        } else if (numero < 100) {
            // 65 -> /10=6 %10=5
            esCapicua = (numero / 10 == numero % 10);
        } else if (numero < 1000) {
            // 121 -> /100=1 %10=5
            esCapicua = (numero / 100 == numero % 10);
        } else if (numero < 10000) {
            // 1221 -> /1000=1 %10=1
            esCapicua = (numero / 1000 == numero % 10) && ((numero / 100) % 10) == ((numero / 10) % 10);
        } else if (numero < 100000) {
            // 12321 -> /1000=1 %10=1
            esCapicua = (numero / 10000 == numero % 10) && ((numero / 1000) % 10) == ((numero / 10) % 10);
        } else {
            System.err.println("El número introducido tiene más de cinco cifras.");
        }

        System.out.printf("El número %s es capicua.\n", (esCapicua ? "si" : "no"));

        System.out.println("\n************** OTRA FORMA **************\n");
        String numeroString = String.valueOf(numero);
        int longitud = numeroString.length();

        if (longitud < 6) {

            switch (longitud) {
                case 1 ->
                    esCapicua = true;
                case 2 ->
                    esCapicua = (numeroString.charAt(0) == numeroString.charAt(1));
                case 3 ->
                    esCapicua = (numeroString.charAt(0) == numeroString.charAt(2));
                case 4 ->
                    esCapicua = (numeroString.charAt(0) == numeroString.charAt(3)
                            && numeroString.charAt(1) == numeroString.charAt(2));
                case 5 ->
                    esCapicua = (numeroString.charAt(0) == numeroString.charAt(4)
                            && numeroString.charAt(1) == numeroString.charAt(3));
            }
        } else {
            System.err.println("El número introducido tiene más de cinco cifras.");
        }

        System.out.printf("El número %s es capicua.\n", (esCapicua ? "si" : "no"));

    } // Fin main

} // Fin class
