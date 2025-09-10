package principal;

/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 */
public class S05Ejercicio22 {

    public static void main(String[] args) {
        final int NUMERO_INICIO=2;
        final int NUMERO_FINAL=100;
        int numero=NUMERO_INICIO;
        boolean esPrimo=true;
        
        while (numero<NUMERO_FINAL) {
            
            for (int i = 2; i <= numero-1; i++) {
                if (numero%i==0) { // es divisible y no es primo
                    esPrimo=false;
                }
            } // Fin for
            
            System.out.print(esPrimo?numero+" es primo.\n":"");
            numero++;
            esPrimo=true;
        }
        

    } // Fin main

} // Fin class
