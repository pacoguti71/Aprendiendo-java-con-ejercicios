package principal;

import java.util.Scanner;

/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 *
 */
public class S04Ejercicio11 {

    public static void main(String[] args) {

        int horas;
        int minutos;
        int segundosPasados;
        int segundosRestantes;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la hora (0-23): ");
        horas = teclado.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        minutos = teclado.nextInt();

        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            System.err.println("Error: La hora o los minutos introducidos no son válidos.");
        } else {
            segundosPasados = (horas * 60 * 60) + (minutos * 60);
            segundosRestantes = (24 * 60 * 60) - segundosPasados;

            System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos\n", horas, minutos, segundosRestantes);
        }

    } // Fin main

} // Fin class
