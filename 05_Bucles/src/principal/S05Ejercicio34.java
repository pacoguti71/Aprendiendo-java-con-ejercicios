package principal;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito del segundo número, segundo dígito del primer número, segundo dígito
 * del segundo número, tercer dígito del primer número… Para facilitar el
 * ejercicio, podemos suponer que el usuario introducirá dos números de la misma
 * longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en
 * lugar de int donde sea necesario para admitir números largos.
 *
 */
public class S05Ejercicio34 {

    public static void main(String[] args) {
        long numero1;
        long numero2;

        int longitud;
        int digito;
        int discriminador;

        StringBuilder pares = new StringBuilder();
        StringBuilder impares = new StringBuilder();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextLong();
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextLong();

        longitud = (int) Math.log10(numero1) + 1;

        // 123456 (longitud=6)
        // 1 -- 23456
        // discriminador=100000
        //digito =numero/discriminador
        // numero%discriminador
        for (int i = longitud - 1; i >= 0; i--) {
            discriminador = (int) Math.pow(10, i);
            digito = (int) (numero1 / discriminador);
            numero1 = numero1 % discriminador;
            if (digito % 2 == 0) {
                pares.append(digito);
            } else {
                impares.append(digito);
            }
            digito = (int) (numero2 / discriminador);
            numero2 = numero2 % discriminador;
            if (digito % 2 == 0) {
                pares.append(digito);
            } else {
                impares.append(digito);
            }
        } // Fin for

        System.out.printf("El número formado por los dígitos pares es %s%n", pares);
        System.out.printf("El número formado por los dígitos impares es %s%n", impares);
    } // Fin main

} // Fin class
