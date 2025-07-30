package principal;

/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 *
 */
import java.util.Scanner;

public class S04Ejercicio04 {

    public static void main(String[] args) {
        final int COSTE_HORA = 12;
        final int COSTE_HORA_EXTRA = 16;
        final int MAX_HORAS_NORMALES = 40;

        int numHoras;
        int numHorasExtra;
        int salario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, intruzca el número de horas trabajadas durante la semana: ");
        numHoras = teclado.nextInt();

        if (numHoras <= MAX_HORAS_NORMALES) {
            salario = numHoras * COSTE_HORA;
        } else {
            numHorasExtra = numHoras - MAX_HORAS_NORMALES;
            salario = (MAX_HORAS_NORMALES * COSTE_HORA) + (numHorasExtra * COSTE_HORA_EXTRA);
        }

        System.out.printf("El sueldo semanal que le corresponde es de %d euros.\n", salario);

    } // Fin main

} // Fin class
