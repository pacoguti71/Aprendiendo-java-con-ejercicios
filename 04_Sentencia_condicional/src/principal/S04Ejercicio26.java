package principal;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros.
 * Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11
 * euros. Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves,
 * un grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 *
 */
public class S04Ejercicio26 {

    public static void main(String[] args) {

        final double PRECIO_BASE = 8;
        final double PRECIO_MIERCOLES = 5;
        final double PRECIO_PAREJAS = 11;
        final double DESCUENTO_TARJETA = 10 / 100.0;

        int numEntradas;
        char diaSemana;
        boolean tieneTarjeta;

        int numParejas = 0;
        int numNoParejas = 0;
        double precioSinDescuento = 0;
        double descuento;
        double total;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Venta de entradas CineCampa");
        System.out.print("¿Cuántas entradas quieres? ");
        numEntradas = teclado.nextInt();
        teclado.nextLine();
        System.out.print("¿Para qué día de la semana? (L-M-X-J-V-S-D)");
        diaSemana = teclado.nextLine().toUpperCase().charAt(0);
        System.out.print("¿Tienes tarjeta CineCampa? (s/n)");
        tieneTarjeta = teclado.nextLine().toUpperCase().charAt(0) == 'S';

        System.out.println("");
        System.out.println("Aquí tienes las entradas. Gracias por tu compra.");

        switch (diaSemana) {
            case 'L':
            case 'M':
            case 'V':
            case 'S':
            case 'D':
                precioSinDescuento = numEntradas * PRECIO_BASE;
                System.out.printf("Entradas individuales: %d%n", numEntradas);
                System.out.printf("Precio por entrada individual: %.2f €%n", PRECIO_BASE);
                break;
            case 'X':
                precioSinDescuento = numEntradas * PRECIO_MIERCOLES;
                System.out.printf("Entradas individuales: %d%n", numEntradas);
                System.out.printf("Precio por entrada individual: %.2f €%n", PRECIO_MIERCOLES);
                break;
            case 'J':
                numParejas = numEntradas / 2;
                numNoParejas = numEntradas % 2;
                precioSinDescuento = (numParejas * PRECIO_PAREJAS) + (numNoParejas * PRECIO_BASE);
                if (numParejas > 0) {
                    System.out.printf("Entradas de pareja: %d%n", numParejas);
                    System.out.printf("Precio por entrada de parejas: %.2f €%n", PRECIO_PAREJAS);
                }
                if (numNoParejas > 0) {
                    System.out.printf("Entradas individuales: %d%n", numNoParejas);
                    System.out.printf("Precio por entrada individual: %.2f €%n", PRECIO_BASE);
                }
                break;
            default:
                System.err.println("El día de la semana indicado no puede aplicarse");
                return;
        }

        descuento = tieneTarjeta ? precioSinDescuento * DESCUENTO_TARJETA : 0;
        total = precioSinDescuento - descuento;

        System.out.printf("Total: %.2f €%n", precioSinDescuento);
        System.out.printf("Descuento: %.2f €%n", descuento);
        System.out.printf("A pagar: %.2f €%n", total);

    } // Fin main

} // Fin class
