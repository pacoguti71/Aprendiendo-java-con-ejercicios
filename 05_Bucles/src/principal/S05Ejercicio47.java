package principal;

import java.util.Scanner;

/**
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
 * encargado realizar un programa que pinte un 8 por pantalla usando la letra M.
 * Se pide al usuario la altura, que debe ser un número entero impar mayor o
 * igual que 5. Si el número introducido no es correcto, el programa deberá
 * mostrar un mensaje de error. A continuación se muestran algunos ejemplos. La
 * anchura de la figura siempre será de 6 caracteres.
 *
 */
public class S05Ejercicio47 {

    public static void main(String[] args) {
        final int MIN_ALTURA = 5;
        int altura;
        boolean entradaCorrecta;
        int mitad;

        Scanner teclado = new Scanner(System.in);

        do {
            entradaCorrecta = true;
            System.out.print("Introduce la altura (impar mayor o igual que " + MIN_ALTURA + ": ");
            altura = teclado.nextInt();
            if (altura < MIN_ALTURA || altura % 2 == 0) {
                System.err.println("La altura introducida no es correcta");
                entradaCorrecta = false;
            }
        } while (!entradaCorrecta);

        mitad = altura / 2;

        for (int fila = 0; fila < altura; fila++) {
            if (fila == 0 || fila == mitad || fila == altura - 1) {
                System.out.println("MMMMMM");
            } else {
                System.out.println("M    M");
            }
        } // Fin for

    } // Fin main

} // Fin class
