package principal;

import java.util.Scanner;

/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y
 * positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *
 */
public class S05Ejercicio17 {

    public static void main(String[] args) {
        final int CANTIDAD_NUMEROS = 100;
        int numero;
        int resultado=0;
        String suma="";
        boolean entradaCorrecta;

        Scanner teclado = new Scanner(System.in);

        do {
            entradaCorrecta = true;
            System.out.print("Introduce un número: ");
            numero=teclado.nextInt();
            if (numero<0) {
                System.err.println("Debe introducir un número positivo.");
                entradaCorrecta=false;
            }
        } while (!entradaCorrecta);
        
        for (int i = 1; i <= CANTIDAD_NUMEROS; i++) {
            suma=suma+(numero+i)+"+";
            resultado+=(numero+i);
        } // Fin for
        
        System.out.printf("El resultado de%s%nes: %d%n",suma,resultado);

    } // Fin main

} // Fin class
