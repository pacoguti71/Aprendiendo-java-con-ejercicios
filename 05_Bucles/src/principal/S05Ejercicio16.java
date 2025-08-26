package principal;

import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *
 */
public class S05Ejercicio16 {

    public static void main(String[] args) {
        int numero;
        boolean esPrimo=true;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        numero=teclado.nextInt();
        
        for (int i = numero-1; i >1; i--) {
            if (numero%i==0 && esPrimo) {
                System.out.println("Es divisible por "+i);
                esPrimo=false;
            }
            
        } // Fin for
        
        System.out.printf("El número %d %s primo.%n",numero,(esPrimo?"es":"no es"));

    } // Fin main

} // Fin class
