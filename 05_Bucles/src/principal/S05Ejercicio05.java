package principal;

/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle while.
 *
 */
public class S05Ejercicio05 {

    public static void main(String[] args) {
        final int NUMERO_INICIAL=320;
        final int NUMERO_FINAL=160;
        final int SALTO=20;
        int contador=NUMERO_INICIAL;
        
        while (contador>=NUMERO_FINAL) {
            System.out.println(contador);
            contador-=SALTO;
        }

    } // Fin main

} // Fin class
