package principal;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 */
public class S03Ejercicio07 {

    public static void main(String[] args) {
        double IVA = 21 / 100.0;
        double baseImponible;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la base imponible: ");
        baseImponible = teclado.nextDouble();
        double importeIVA = baseImponible * IVA;
        double importeTotal = baseImponible + importeIVA;

        System.out.printf("El impuesto del IVA es del %.2f%%\n", IVA * 100);
        System.out.printf("El importe a devengar en concepto de IVA es: %.2f €\n", importeIVA);
        System.out.println("El importe total IVA incluido es de: " + importeTotal + " €");

    } // Fin main

} // Fin class
