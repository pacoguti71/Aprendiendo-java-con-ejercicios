package principal;

import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita el
 * tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 *
 */
public class S05Ejercicio36 {

    public static void main(String[] args) {
        long numero;
        long numeroOriginal;
        int longitud;
        int discriminador;
        int digitoIzquierda;
        int digitoDerecha;
        boolean esCapicua=true;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero=teclado.nextLong();
        numeroOriginal=numero;
        
        longitud=(int) Math.log10(numero)+1;
        
        //2019102
        // izquierda = 2019102/100000 = 2 019102
        // derecha = 2019102&10 = 2
        // numero = 2019102 %100000 -> 019102 -> /10 -> 01910

        for (int i = 0; i < longitud/2 && esCapicua; i++) {
            discriminador=(int) Math.pow(10, longitud-i-1);
            digitoIzquierda = (int) ((numeroOriginal/discriminador)%10);
            digitoDerecha = (int) numero%10;
            if (digitoIzquierda!= digitoDerecha) {
                esCapicua=false;
            }
            numero=(numero%discriminador)/10;
        } // Fin for
        
        System.out.printf("El número %d %s es capicúa.%n",numeroOriginal, (esCapicua?"si":"no"));
        
    } // Fin main

} // Fin class
