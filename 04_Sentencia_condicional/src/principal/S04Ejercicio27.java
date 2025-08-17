package principal;

import java.util.Scanner;

/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la
 * tarta: manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de
 * fresa 16. En caso de seleccionar la tarta de chocolate, el programa debe
 * preguntar además si el chocolate es negro o blanco; la primera opción vale 14
 * euros y la segunda 15. Por último se pregunta si se añade nata y si se
 * personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 *
 */
public class S04Ejercicio27 {

    public static void main(String[] args) {
        final double PRECIO_MANZANA = 18;
        final double PRECIO_FRESA = 16;
        final double PRECIO_CHOCOLATE_NEGRO = 14;
        final double PRECIO_CHOCOLATE_BLANCO = 15;
        final double NATA = 2.5;
        final double NOMBRE = 2.75;

        char sabor;
        char tipoChocolate = 0;
        boolean quiereNata;
        boolean quiereNombre;
        String tarta;
        double precioTarta = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Elige el sabor (<M> manzana, <F> fresa o <C> chocolate): ");
        sabor = teclado.nextLine().toUpperCase().charAt(0);
        if (sabor == 'C') {
            System.out.print("¿Qué tipo de chocolate quieres? (<N> negro o <B> blanco):");
            tipoChocolate = teclado.nextLine().toUpperCase().charAt(0);
            precioTarta = tipoChocolate == 'N' ? PRECIO_CHOCOLATE_NEGRO : PRECIO_CHOCOLATE_BLANCO;
        }
        System.out.print("¿Quieres nata? (s/n): ");
        quiereNata = teclado.nextLine().toUpperCase().charAt(0) == 'S';
        System.out.print("¿Quieres ponerle un nombre? (s/n): ");
        quiereNombre = teclado.nextLine().toUpperCase().charAt(0) == 'S';

        switch (sabor) {
            case 'M':
                tarta = "Tarta de manzana";
                precioTarta = PRECIO_MANZANA;
                break;
            case 'F':
                tarta = "Tarta de fresa";
                precioTarta = PRECIO_FRESA;
                break;
            case 'C':
                tarta = "Tarta de chocolate " + (tipoChocolate == 'N' ? "negro" : "blanco");
                break;
            default:
                System.err.println("No ha elegido un tipo de tarta correcto.");
                return;
        }

        System.out.println("");
        System.out.printf(tarta + ": %.2f €%n", precioTarta);

        if (quiereNata) {
            precioTarta += NATA;
            System.out.printf("Con nata: %.2f €%n", NATA);
        }
        if (quiereNombre) {
            precioTarta += NOMBRE;
            System.out.printf("Con nombre: %.2f €%n", NOMBRE);
        }

        System.out.printf("Total: %.2f €%n", precioTarta);

    } // Fin main

} // Fin class
