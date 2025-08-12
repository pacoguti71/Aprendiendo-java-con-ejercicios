package principal;

/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de
 * la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la
 * nota media anterior.
 */
import java.util.Scanner;

public class S04Ejercicio21 {

    public static void main(String[] args) {
        final double NOTA_SUFICIENTE = 5;

        double notaPrimerControl;
        double notaSegundoControl;
        double notaMedia;
        String recuperacion;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la nota del primer control: ");
        notaPrimerControl = teclado.nextDouble();
        System.out.print("Introduce la nota del segundo control: ");
        notaSegundoControl = teclado.nextDouble();

        teclado.nextLine();

        notaMedia = (notaPrimerControl + notaSegundoControl) / 2;

        if (notaMedia >= 5) {
            System.out.println("Tu nota se programación es " + notaMedia);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            recuperacion = teclado.nextLine();
            if (recuperacion.toUpperCase().equals("APTO")) {
                System.out.println("Tu nota de programación es " + NOTA_SUFICIENTE);
            } else {
                System.out.println("Tu nota de proramación es " + notaMedia);
            }
        }

    } // Fin main

} // Fin class
