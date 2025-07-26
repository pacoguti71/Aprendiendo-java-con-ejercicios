package principal;

/**
 * Realiza un conversor de Mb a Kb.
 *
 */
import java.util.Scanner;

public class S03Ejercicio10 {

    public static void main(String[] args) {
        int tasa = 1024;
        double mb;
        double kb;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad de megabytes que quieres convertir: ");
        mb = teclado.nextDouble();
        kb = mb * tasa;
        System.out.printf("%.2f Mb son %.2f Kb\n", mb, kb);

    } // Fin main

} // Fin class
