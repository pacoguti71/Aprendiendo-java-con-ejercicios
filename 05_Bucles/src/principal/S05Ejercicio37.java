package principal;

import java.util.Scanner;

/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 *
 */
public class S05Ejercicio37 {

    public static void main(String[] args) {
        long numero;
        long numeroOriginal;
        int longitud;
        int discriminador;
        int digito;
        
        StringBuilder resultado = new StringBuilder();
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero=teclado.nextLong();
        numeroOriginal=numero;
        
        longitud=(int) Math.log10(numero)+1;
        
        while (longitud>0) {
            discriminador=(int) Math.pow(10, longitud-1);
            digito=(int) (numero/discriminador);
            
            for (int i = 0; i <digito; i++) {
                resultado.append("|");
            } // Fin for
            
            if (longitud>1) {
                resultado.append("-");
            }
            
            numero=numero%discriminador;
            longitud--;
        }
        
        System.out.printf("El número %d en decimal es %s en el sistema de palotes.%n",numeroOriginal,resultado);

    } // Fin main

} // Fin class
