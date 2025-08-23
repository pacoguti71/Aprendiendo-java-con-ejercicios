package principal;

/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *
 */
public class S05Ejercicio03 {

    public static void main(String[] args) {
        int contador = 0;

        do {
            System.out.println(contador);
            contador += 5;
        } while (contador <= 100);

    } // Fin main

} // Fin class
