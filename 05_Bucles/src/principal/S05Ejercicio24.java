package principal;

import java.util.Scanner;

/**
 *Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:

    1
   121
  12321
 1234321
123454321
* 
* altura=5
*    1     i=1 ->(4 +1)            -> altura-i + j
*   121    i=2 ->(3 +12    +[1)    -> altura-i + j,j+1              [i-1
*  12321   i=3 ->(2 +123   +[21)   -> altura-i + j,j+1,j+2          [i-1,i-2
* 1234321  i=4 -> (1 +1234 +[321)  -> altura-i + j,j+1,j+2,i+3     +[i-1,i-2,i-3
*123454321 i=5 -> (0 +12345+[4321) -> altura-i + j,j+1,j+2,i+3,i+4 +[i-1,i-2,i-3,i-4
 */

public class S05Ejercicio24 {

    public static void main(String[] args) {
        int altura;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce cuántas filas quieres ver: ");
        altura=teclado.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            
            for (int j = 1; j <= altura-i; j++) {
                System.out.print(" ");
            } // Fin for
            
            // Ascendente
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            } // Fin for
            
            // Descendente
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j);
            } // Fin for
            
            System.out.println("");
        } // Fin for
        

    } // Fin main

} // Fin class