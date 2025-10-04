package principal;

/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 */
public class S02Ejercicio05 {

    public static void main(String[] args) {

        double tipoConversion = 166.386;
        int cantPesetas = 1000;

        double resultado = cantPesetas / tipoConversion;

        System.out.printf("%d pesetas son %.2f euros\n", cantPesetas, resultado);

    } // Fin main

} // Fin class
