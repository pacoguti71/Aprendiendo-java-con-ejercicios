package principal;

/**
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 *
 */
public class S05Ejercicio06 {

    public static void main(String[] args) {
        
        final int NUMERO_INICIAL=320;
        final int NUMERO_FINAL=160;
        final int SALTO=20;
        int contador=NUMERO_INICIAL;
        
        do {            
            System.out.println(contador);
            contador-=SALTO;
        } while (contador>=NUMERO_FINAL);

    } // Fin main

} // Fin class
