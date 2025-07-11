package principal;

/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */
public class S02Ejercicio04 {

    public static void main(String[] args) {

        double tipoConversion = 166.386;
        int cantPesetas = 1000;

        System.out.printf("%d pesetas son %.2f euros\n", cantPesetas, cantPesetas / tipoConversion);

    } // Fin main

} // Fin class
