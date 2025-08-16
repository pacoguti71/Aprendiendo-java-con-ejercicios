package principal;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el precio final de un producto según su base
 * imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si
 * se muestran los valores correctos, aunque los números no estén tabulados.
 *
 */

public class S04Ejercicio23 {

    public static void main(String[] args) {
        final double IVA_GENERAL = 21 / 100.0;
        final double IVA_REDUCIDO = 10 / 100.0;
        final double IVA_SUPERREDUCIDO = 4 / 100.0;
        final int DESCUENTO_meno5 = 5;
        final double DESCUENTO_5porc = 5 / 100.0;

        double baseImponible;
        char tipoIVA;
        String codPromocion;

        int tipoIVAaplicado;

        double IVAaplicado;
        double precioConIVA;
        double descuento = 0;
        double precioFinal;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        baseImponible = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Introduce el tipo de IVA (general<G>, reducido<R> o superreducido<S>: ");
        tipoIVA = teclado.nextLine().toUpperCase().charAt(0);
        System.out.print("Introduce el código promocional (nopro, mitad, meno5, 5porc): ");
        codPromocion = teclado.nextLine().toLowerCase();

        switch (tipoIVA) {
            case 'G':
                IVAaplicado = baseImponible * IVA_GENERAL;
                tipoIVAaplicado = (int) (IVA_GENERAL * 100);
                break;
            case 'R':
                IVAaplicado = baseImponible * IVA_REDUCIDO;
                tipoIVAaplicado = (int) (IVA_REDUCIDO * 100);
                break;
            case 'S':
                IVAaplicado = baseImponible * IVA_SUPERREDUCIDO;
                tipoIVAaplicado = (int) (IVA_SUPERREDUCIDO * 100);
                break;
            default:
                System.err.println("Tipo de IVA es incorrecto.");
                return;
        }

        switch (codPromocion) {
            case "nopro":
                break;
            case "mitad":
                descuento = baseImponible / 2;
                break;
            case "meno5":
                descuento = DESCUENTO_meno5;
                break;
            case "5porc":
                descuento = baseImponible * DESCUENTO_5porc;
                break;
            default:
                System.err.println("Descuento es incorrecto.");
                return;
        }

        precioConIVA = baseImponible + IVAaplicado;
        precioFinal = precioConIVA - descuento;

        System.out.printf("%-30s %10.2f%n", "Base imponible", baseImponible);
        System.out.printf("%-30s %10.2f%n", "IVA (" + tipoIVAaplicado + "%)", IVAaplicado);
        System.out.printf("%-30s %10.2f%n", "Precio con IVA", precioConIVA);
        System.out.printf("%-30s %10.2f%n", "Código promocional (" + codPromocion + ")", descuento);
        System.out.printf("%-30s %10.2f%n", "TOTAL", precioFinal);

    } // Fin main

} // Fin class
