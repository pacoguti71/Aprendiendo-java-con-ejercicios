package principal;

import java.util.Scanner;

/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 */
public class S04Ejercicio08 {

    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;
        double notaMedia;
        String calificacion;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Introduce la tercera nota: ");
        nota3 = teclado.nextDouble();

        notaMedia = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La nota media de %.2f, %.2f y %.2f es %.2f\n", nota1, nota2, nota3, notaMedia);

        if (notaMedia > 9) {
            calificacion = "sobresaliente";
        } else if (notaMedia > 7) {
            calificacion = "notable";
        } else if (notaMedia > 6) {
            calificacion = "bien";
        } else if (notaMedia > 5) {
            calificacion = "suficiente";
        } else {
            calificacion = "insuficiente";
        }

        System.out.println("Has sacado una calificación de " + calificacion);
    } // Fin main

} // Fin class
