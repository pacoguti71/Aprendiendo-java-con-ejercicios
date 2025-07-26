package principal;

import java.util.Scanner;

/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay que
 * tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo
 * examen un 60%.
 *
 */
public class S03Ejercicio12 {

    public static void main(String[] args) {
        double porcentajePrimerExamen = 40 / 100.0;
        double porcentajeSegundoExamen = 60 / 100.0;
        double notaPrimerExamen;
        double notaSegundoExamen;
        double notaTrimestre;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        notaPrimerExamen = teclado.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        notaTrimestre = teclado.nextDouble();

        //nota=nota1*40%+nota2*60
        // nota2=(nota-nota1*40%)/60
        notaSegundoExamen = (notaTrimestre - (notaPrimerExamen * porcentajePrimerExamen)) / porcentajeSegundoExamen;

        System.out.printf("Para tener un %.1f en el trimestre necesitas sacar un %.1f en el segundo examen.\n", notaTrimestre, notaSegundoExamen);
    } // Fin main

} // Fin class
