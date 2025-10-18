package principal;

import java.util.Scanner;

/**
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por el
 * 1. Suponemos que el usuario introduce correctamente los datos, es decir, el
 * número introducido tiene dos dígitos como mínimo y la posición en la que se
 * parte el número está entre 2 y la longitud del número. No se permite en este
 * ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 *
 */
public class S05Ejercicio43 {

    public static void main(String[] args) {
        int numero;
        int longitud;
        int posicion;
        int numeroIzquierda;
        int numeroDerecha;
        boolean entradaCorrecta;

        Scanner teclado = new Scanner(System.in);

        do {
            entradaCorrecta = true;
            System.out.print("Introduce un número entero positivo con, al menos dos cifras: ");
            numero=teclado.nextInt();
            if (numero<10) {
                entradaCorrecta=false;
                System.err.println("Debes introducir un número positivo con dos cifras.");
            }
        } while (!entradaCorrecta);
        
        longitud=(int) Math.log10(numero)+1;
        
        do {      
            entradaCorrecta=true;
            System.out.printf("Introduce la posición a partir de la cual quieres parrir el número (min=2. max=%d): ",longitud);
            posicion=teclado.nextInt();
            if (posicion<2 || posicion>longitud) {
                entradaCorrecta=false;
                System.err.printf("Debes introducir un número con 2 cifras o más, pero menoes de %d cifras.%n",longitud);
            }
        } while (!entradaCorrecta);
        
        numeroIzquierda=(int) (numero/Math.pow(10, longitud-posicion+1));
        numeroDerecha=(int) (numero%Math.pow(10, longitud-posicion+1));
        
        System.out.printf("Los números partidos son el %d y el %d%n",numeroIzquierda,numeroDerecha);

    } // Fin main

} // Fin class
