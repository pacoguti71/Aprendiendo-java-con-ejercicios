package principal;

/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for.
 *
 */
public class S05Ejercicio04 {

    public static void main(String[] args) {

        int numInicial = 320;
        int numFinal = 160;
        int salto = 20;

        for (int i = numInicial; i >= numFinal; i -= salto) {
            System.out.println(i);
        } // Fin for

    } // Fin main

} // Fin class
