package principal;

import java.util.Scanner;

/**
 * Realiza un programa que pida primero un número y a continuación un dígito. El
 * programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 *
 */
public class S05Ejercicio26 {

    public static void main(String[] args) {
        long numero;
        long numeroOriginal;
        int longitud;
        int digitoEncontrar;
        int resto;

        Scanner teclado = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        System.out.print("Introduce un número: ");
        numero = teclado.nextLong();
        numeroOriginal = numero;
        System.out.print("Introduce un dígito a encontrar: ");
        digitoEncontrar = teclado.nextInt();

        // 254785412 4-> 3 7
        // El logaritmo en base 10 responde a la pregunta: a qué potencia de 10 hay que elevar para obtener el número
        // Ejemplo: log (1000)=3 porque 10^3=1000;
        // Mide el orden de magnitud porque te dice la potencia de 10 más cercana por debajo del número
        // y eso coincide con la longitud del número -1
        longitud = (int) Math.log10(numero) + 1;

        for (int i = longitud; i >= 1; i--) {
            resto = (int) numero % 10;
            if (resto == digitoEncontrar) {
                resultado.insert(0, i + " ");
            }
            numero /= 10;
        } // Fin for

        System.out.printf("El dígito %d aparece en el número %d en las posiciones %s%n", digitoEncontrar, numeroOriginal, resultado);

    } // Fin main

} // Fin class
