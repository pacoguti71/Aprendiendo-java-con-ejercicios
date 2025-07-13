package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pida dos números y que luego muestre el resultado de
 * su multiplicación.
 */
public class S03Ejercicio01 {

    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Introduzca el primer número: ");
        double primerNumero=teclado.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        double primerSegundo=teclado.nextDouble();
        
        double resultado=primerNumero*primerSegundo;
        System.out.printf("El resultado de multiplicar %.2f por %.2f es %.2f\n",primerNumero,primerSegundo,resultado);
        
    } // Fin main

} // Fin class
