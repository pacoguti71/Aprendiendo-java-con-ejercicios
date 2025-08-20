package principal;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 *
 */
public class S04Ejercicio29 {

    public static void main(String[] args) {

        final double PRECIO_PALMERA = 1.4;
        final double PRECIO_DONUT = 1;
        final double PRECIO_PITUFO_CON_ACEITE = 1.2;
        final double PRECIO_PITUFO_CON_TORTILLA = 1.6;
        final double PRECIO_ZUMO = 1.5;
        final double PRECIO_CAFE = 1.2;

        char opcion;
        String comida;
        double precio;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿Qué has tomado de comer? (<P> palmera), <D> donut o <F> pitufo): ");
        opcion=teclado.nextLine().toUpperCase().charAt(0);
        if (opcion=='F') {
            System.out.print("¿Con qué te has tomado el pitufo? (<A> aceite o <T> tortilla): ");
            opcion=teclado.nextLine().toUpperCase().charAt(0);
        }
        switch (opcion) {
            case 'P':
                comida="Palmera";
                precio=PRECIO_PALMERA;
                break;
            case 'D':
                comida="Donut";
                precio=PRECIO_DONUT;
                break;
            case 'A':
                comida="Pitufo con aceite";
                precio=PRECIO_PITUFO_CON_ACEITE;
                break;
            case 'T':
                comida="Pitufo con tortilla";
                precio=PRECIO_PITUFO_CON_TORTILLA;
                break;
            default:
                System.err.println("La opción elegida no es válida.");
                return;
        }
        
        System.out.print("¿Qué has tomado de beber? (<Z> zumo o <C> café): ");
        opcion=teclado.nextLine().toUpperCase().charAt(0);
        
        System.out.println("");
        System.out.printf("%s: %.2f%n",comida,precio);
        if (opcion=='Z') {
            System.out.println("Zumo: "+PRECIO_ZUMO);
            precio+=PRECIO_ZUMO;
        } else {
            System.out.println("Café: "+PRECIO_CAFE);
            precio+=PRECIO_CAFE;
        }
        
        System.out.printf("Total desayuno: %.2f%n",precio);

    } // Fin main

} // Fin class
