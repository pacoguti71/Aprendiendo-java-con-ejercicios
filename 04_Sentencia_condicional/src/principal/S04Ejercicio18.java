package principal;

import java.util.Scanner;

/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 */
public class S04Ejercicio18 {

    public static void main(String[] args) {
        int numero;
        int primeraCifra=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número entero de 5 cifras como máximo: ");
        numero=teclado.nextInt();
        
        if (numero<10) {
            primeraCifra=numero;
        } else if (numero<100) {
            primeraCifra=numero/10;
        }else if (numero<1000) {
            primeraCifra=numero/100;
        }else if (numero<10000) {
            primeraCifra=numero/1000;
        }else if (numero<100000) {
            primeraCifra=numero/10000;
        } else {
            System.err.println("El número introducido tiene más de cinco cifras.");
        }
        
        System.out.println("La primera cifra es: "+(primeraCifra>0?primeraCifra:"no puedo calcularla"));

        System.out.println("\n***************** OTRAFORMA *****************\n");
        String primeraCifraString = String.valueOf(numero);
        System.out.printf("La primera cifra del número es: %s\n",primeraCifraString.charAt(0));
        
    } // Fin main

} // Fin class
