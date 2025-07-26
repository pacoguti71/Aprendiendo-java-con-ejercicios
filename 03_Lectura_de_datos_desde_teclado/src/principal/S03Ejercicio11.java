package principal;

/**
 * Realiza un conversor de Kb a Mb.
 *
 */
import java.util.Scanner;

public class S03Ejercicio11 {

    public static void main(String[] args) {
        int tasa = 1024;
        double mb;
        double kb;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad de kilobytes que quieres convertir: ");
        kb = teclado.nextDouble();
        mb = kb / tasa;
        System.out.printf("%.2f Kb son %.4f Mb\n", kb, mb);

    } // Fin main

} // Fin class
