package principal;

/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */
public class S02Ejercicio04 {

    public static void main(String[] args) {

        double tipoConversion = 166.386;
        double cantEuros = 10.56;

        double resultado=cantEuros*tipoConversion;

        System.out.printf("%.2f euros son %.2f pesetas\n", cantEuros, resultado);

    } // Fin main

} // Fin class
