package principal;

import java.util.Scanner;

/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 *
 */

public class S05Ejercicio41 {

    public static void main(String[] args) {
        long numero;
        int longitud;
        int digito;
        int cantPares=0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero=teclado.nextLong();
        
        longitud=(int) Math.log10(numero)+1;

        for (int i = 1; i <= longitud; i++) {
            digito=(int) (numero/Math.pow(10, longitud-i));
            if (digito%2==0) {
                cantPares++;
            }
        } // Fin for

        System.out.printf("El número %d contiene %d digitos pares y %d digitos impares.%n",numero,cantPares,longitud-cantPares);
    } // Fin main

} // Fin class
