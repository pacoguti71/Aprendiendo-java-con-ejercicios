package principal;

import java.util.Scanner;

/**
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y
 * el resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan
 * de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 *
 */
public class S05Ejercicio45 {

    public static void main(String[] args) {
        long numero;
        int longitud;
        int digito;
        int posicion;
        long numeroIzquierda;
        long numeroDerecha;
        long numeroDefinitivo;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce un número entero positivo con, al menos dos cifras: ");
            numero = teclado.nextLong();
            if (numero < 10) {
                System.err.println("Debes introducir un número positivo con al menos dos cifras.");
            }
        } while (numero < 10);

        longitud = (int) Math.log10(numero) + 1;

        System.out.print("Introduce el nuevo dígito: ");
        digito = teclado.nextInt();

        do {
            System.out.printf("Introduce la posición del dígito que quieres modificar(min=2. max=%d): %n", longitud);
            posicion = teclado.nextInt();
            if (posicion < 2 || posicion > longitud) {
                System.err.printf("Debes introducir un número con dos cifras o más, pero menos de %d cifras.%n", longitud);
            }
        } while (posicion < 2 || posicion > longitud);

        int cantidadCeros = (int) Math.pow(10, longitud - posicion);
        numeroIzquierda = numero / cantidadCeros;
        int cambiarCifra = (int) numeroIzquierda % 10;
        numeroIzquierda = (numeroIzquierda - cambiarCifra + digito) * cantidadCeros;

        numeroDerecha = numero % cantidadCeros;

        numeroDefinitivo = numeroIzquierda + numeroDerecha;

        System.out.printf("El número resultante es %d%n", numeroDefinitivo);

    } // Fin main

} // Fin class
