package principal;

import java.util.Scanner;

/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */
public class S03Ejercicio02 {

    public static void main(String[] args) {
        double tipoConversion=166.386;
        double cantEuros;
        double resultado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca la cantidad de euros a convertir: ");
        cantEuros=teclado.nextDouble();
        
        resultado=cantEuros*tipoConversion;
        
        System.out.printf("%.2f euros son %.2f pesetas\n",cantEuros,resultado);

    } // Fin main

} // Fin class
