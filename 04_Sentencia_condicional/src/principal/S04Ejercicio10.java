/*
 * Aries: del 21 de marzo al 19 de abril.
 * Tauro: del 20 de abril al 20 de mayo.
 * Géminis: del 21 de mayo al 20 de junio.
 * Cáncer: del 21 de junio al 22 de julio.
 * Leo: del 23 de julio al 22 de agosto.
 * Virgo: del 23 de agosto al 22 de septiembre.
 * Libra: del 23 de septiembre al 22 de octubre.
 * Escorpio: del 23 de octubre al 21 de noviembre.
 * Sagitario: del 22 de noviembre al 21 de diciembre.
 * Capricornio: del 22 de diciembre al 19 de enero.
 * Acuario: del 20 de enero al 18 de febrero.
 * Piscis: del 19 de febrero al 20 de marzo.
 */
package principal;

import java.util.Scanner;

/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 *
 */
public class S04Ejercicio10 {

    public static void main(String[] args) {
        int dia;
        int mes;
        String horoscopo = "";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número del día en que naciste (1-31): ");
        dia = teclado.nextInt();
        System.out.print("Introduce el número del mes en que naciste (1-12): ");
        mes = teclado.nextInt();

        if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.printf("El mes %d no puede tener 31 días", mes);
        } else {
            switch (mes) {
                case 1 ->
                    horoscopo = (dia < 20) ? "capricornio" : "acuario";
                case 2 ->
                    horoscopo = (dia < 19) ? "acuario" : "piscis";
                case 3 ->
                    horoscopo = (dia < 21) ? "piscis" : "aries";
                case 4 ->
                    horoscopo = (dia < 20) ? "aries" : "tauro";
                case 5 ->
                    horoscopo = (dia < 21) ? "tauro" : "géminis";
                case 6 ->
                    horoscopo = (dia < 21) ? "géminis" : "cáncer";
                case 7 ->
                    horoscopo = (dia < 23) ? "cáncer" : "leo";
                case 8 ->
                    horoscopo = (dia < 23) ? "leo" : "virgo";
                case 9 ->
                    horoscopo = (dia < 23) ? "virgo" : "libra";
                case 10 ->
                    horoscopo = (dia < 23) ? "libra" : "escorpio";
                case 11 ->
                    horoscopo = (dia < 22) ? "escorpio" : "sagitario";
                case 12 ->
                    horoscopo = (dia < 22) ? "sagitario" : "capricornio";
            }
            System.out.println("Tu horóscopo es " + horoscopo);

        }

    } // Fin main

} // Fin class
