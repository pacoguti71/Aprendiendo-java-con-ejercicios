package principal;

/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al
 * viernes a las 15:00h.
 */
import java.util.Scanner;

public class S04Ejercicio22 {

    public static void main(String[] args) {
        final int MINUTOS_SEMANA = (4 * 24 * 60) + (15 * 60);

        char dia;
        int diaNumero;
        int horas;
        int minutos;
        int minutosPasados;
        int minutosRestantes;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el día de la semana (L-M-X-J-V): ");
        dia = teclado.nextLine().charAt(0);
        System.out.print("Introduce la hora (0:23): ");
        horas = teclado.nextInt();
        System.out.print("Introduce los minutos (0:59): ");
        minutos = teclado.nextInt();

        switch (dia) {
            case 'L':
                diaNumero = 0;
                break;
            case 'M':
                diaNumero = 1;
                break;
            case 'X':
                diaNumero = 2;
                break;
            case 'J':
                diaNumero = 0;
                break;
            case 'V':
                diaNumero = 0;
                break;
            default:
                System.err.println("Día no es válido. Usa L, M, X, J, o V.");
                return;
        }

        minutosPasados = (diaNumero * 24 * 60) + (horas * 60) + minutos;

        minutosRestantes = MINUTOS_SEMANA - minutosPasados;

        System.out.printf("Quedan %d minutos para el viernes a las 15:00\n", minutosRestantes);

    } // Fin main

} // Fin class
