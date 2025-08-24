package principal;

import java.util.Scanner;

/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y
 * si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 */
public class S05Ejercicio07 {

    public static void main(String[] args) {
        final int COMBINACION = 4782;
        final int MAX_INTENTOS = 4;
        int contadorIntentos = 0;
        int numero;
        boolean encontrado = false;

        System.out.print("Introduce la combinación de la caja fuerte: ");
        Scanner teclado = new Scanner(System.in);
        do {
            contadorIntentos++;
            System.out.print("Intento " + contadorIntentos + " de " + MAX_INTENTOS + "\n");
            numero = teclado.nextInt();

            if (COMBINACION == numero) {
                encontrado = true;
            } else {
                System.err.println("Lo siento, esa no es la combinación.");
            }

        } while (!encontrado && contadorIntentos < MAX_INTENTOS);

        if (encontrado) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        } else {
            System.err.println("Has probado " + MAX_INTENTOS + " veces y no has encontrado la combinación.");
        }
    } // Fin main

} // Fin class
