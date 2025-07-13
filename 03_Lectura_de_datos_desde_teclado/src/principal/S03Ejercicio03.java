package principal;

import java.util.Scanner;

/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */
public class S03Ejercicio03 {

    public static void main(String[] args) {
        double tipoConversion=166.386;
        int cantPesetas;
        double resultado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca la cantidad de pesetas a convertir: ");
        cantPesetas=teclado.nextInt();
        
        resultado=cantPesetas/tipoConversion;
        
        System.out.printf("%d pesetas son %.2f euros.\n",cantPesetas,resultado);

    } // Fin main

} // Fin class
