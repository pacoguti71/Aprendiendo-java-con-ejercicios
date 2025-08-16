package principal;

import java.util.Scanner;

/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
 *
 */
public class S04Ejercicio25 {

    public static void main(String[] args) {
        final double PRECIO_BASE = .01;
        final double ESCUDO_BORDADO = 2.5;
        final double GASTOS_ENVIO = 3.25;

        int altura;
        int ancho;
        int superficie;
        boolean escudo;

        double importeBandera;
        double suplementoEscudo;
        double total;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura de la bandera en cm: ");
        altura = teclado.nextInt();
        System.out.print("Introduce el ancho de la bandera en cm: ");
        ancho = teclado.nextInt();
        teclado.nextLine();
        System.out.println("¿Quieres escudo bordado (s/n)?: ");
        escudo = teclado.nextLine().toUpperCase().equals("S");

        superficie = altura * ancho;
        importeBandera = superficie * PRECIO_BASE;
        suplementoEscudo = escudo ? ESCUDO_BORDADO : 0;
        total = importeBandera + suplementoEscudo + GASTOS_ENVIO;

        System.out.println("");
        System.out.println("Gracias. Aquí tienes el desglose de la compra.");
        System.out.printf("%-20s %6.2f €%n", "Bandera de " + superficie + " cm2:", importeBandera);
        System.out.printf("%-20s %6.2f €%n", (escudo ? "Con " : "Sin " )+ " escudo", suplementoEscudo);
        System.out.printf("%-20s %6.2f €%n", "Gastos de envío:", GASTOS_ENVIO);
        System.out.printf("%-20s %6.2f €%n", "TOTAL:", total);

    } // Fin main

} // Fin class
