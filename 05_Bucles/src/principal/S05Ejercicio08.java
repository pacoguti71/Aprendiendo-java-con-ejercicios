package principal;

import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 */
public class S05Ejercicio08 {

    public static void main(String[] args) {
        int numTabla;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la tabla de multiplicar que quieres ver: ");
        numTabla=teclado.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%2d x %2d = %2d%n",numTabla,i,(numTabla*i));
        } // Fin for

    } // Fin main

} // Fin class
