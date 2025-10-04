package principal;

import java.util.Scanner;

/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo o
 * no.
 *
 */
public class S05Ejercicio42 {

    public static void main(String[] args) {
        int numero;
        boolean esPrimo;
        boolean entradaCorrecta;
        
        Scanner teclado = new Scanner(System.in);
        
        do {            
            entradaCorrecta=true;
            System.out.print("Introduce un número entero positivo: ");
            numero=teclado.nextInt();
            if (numero<=0) {
                entradaCorrecta=false;
                System.err.println("Debes introducir un número entero positivo.");
            }
        } while (!entradaCorrecta);
        
        for (int i = 0; i <5; i++) {
            esPrimo=true;
            for (int j = 2; j <= numero-1 && esPrimo; j++) {
                if (numero%j==0) {
                    esPrimo=false;
                }
            } // Fin for
            System.out.printf("%d%s es primo%n",numero,(esPrimo?"":" no"));
            numero++;
        } // Fin for

    } // Fin main

} // Fin class
