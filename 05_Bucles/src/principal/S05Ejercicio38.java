package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
 * El programa debe pedir la altura. Se debe comprobar que la altura sea un
 * número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
 * de error.
 *
 */
public class S05Ejercicio38 {

    public static void main(String[] args) {
        final int LIMITE = 3;
        int altura;
        int mitad;
        int numAsteriscos;
        int numEspacios;
        boolean entradaCorrecta;

        Scanner teclado = new Scanner(System.in);
        do {
            entradaCorrecta = true;
            System.out.print("Introduce la altura: : ");
            altura = teclado.nextInt();
            if (altura<LIMITE || altura%2==0) {
                System.err.println("Debe introducir un número mayor que "+LIMITE+" y debe ser impar.");
                entradaCorrecta=false;
            }
        } while (!entradaCorrecta);
        
        //***** -> fila=0 -> 0 espacio + 5 asteriscos -> altura -(2*fila) -> 5-(2*0)
        // ***  -> fila=1 -> 1 espacio + 3 asteriscos -> altura -(2*fila) -> 5-(2*1)
        //  *   -> fila=2 -> 2 espacio + 1 asteriscos -> altura -(2*fila) -> 5-(2*2)
        // ***  -> fila=3 -> 1 espacio 5-3-1 + 3 asteriscos 2*(3-2)+1->
        //***** -> fila=4 -> 0 espacios 5-4-1 + 5 asteriscos 2(4-2)+1
        
        mitad =altura/2;
        
        for (int fila = 0; fila <altura; fila++) {
            
            if (fila<=mitad) {
                numAsteriscos=altura-(2*fila);
                numEspacios=fila;
            } else {
                numAsteriscos=(2*(fila-mitad))+1;
                numEspacios=altura-fila-1;
            }
            
            for (int i = 0; i <numEspacios; i++) {
                System.out.print(" ");
            } // Fin for
            for (int i = 0; i <numAsteriscos; i++) {
                System.out.print("*");
            } // Fin for
            
            System.out.println("");
            
        } // Fin for
        
    } // Fin main

} // Fin class
