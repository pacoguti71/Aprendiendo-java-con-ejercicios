package principal;

import java.util.Scanner;

/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 *
 */
public class S05Ejercicio30 {

    public static void main(String[] args) {
        String diaInicio;
        int diaInicioNumero = 0;
        String diaFinal;
        int diaFinalNumero = 0;

        int horaInicio;
        int horaFinal;

        int horas;

        boolean entradaCorrecta;

        Scanner teclado = new Scanner(System.in);

        do {
            entradaCorrecta = true;
            System.out.print("Introduce el día de inicio (lunes,martes,etc) o (1,2,etc): ");
            diaInicio = teclado.nextLine().toUpperCase();
            System.out.print("Introduce la hora de inicio (1-23): ");
            horaInicio = teclado.nextInt();
            teclado.nextLine();

            switch (diaInicio) {
                case "LUNES":
                case "1":
                    diaInicioNumero = 1;
                    break;
                case "MARTES":
                case "2":
                    diaInicioNumero = 2;
                    break;
                case "MIERCOLES":
                case "MIÉRCOLES":
                case "3":
                    diaInicioNumero = 3;
                    break;
                case "JUEVES":
                case "4":
                    diaInicioNumero = 4;
                    break;
                case "VIERNES":
                case "5":
                    diaInicioNumero = 5;
                    break;
                case "SABADO":
                case "SÁBADO":
                case "6":
                    diaInicioNumero = 6;
                    break;
                case "DOMINGO":
                case "7":
                    diaInicioNumero = 7;
                    break;
                default:
                    System.err.println("No has introducido un día correcto.");
                    entradaCorrecta = false;
            }

            if (horaInicio < 0 || horaInicio > 23) {
                System.err.println("No has introducido una hora correcta.");
                entradaCorrecta = false;
            }

        } while (!entradaCorrecta);

        do {
            entradaCorrecta = true;
            System.out.print("Introduce el día final (lunes,martes,etc) o (1,2,etc): ");
            diaFinal = teclado.nextLine().toUpperCase();
            System.out.print("Introduce la hora final (1-23): ");
            horaFinal = teclado.nextInt();
            teclado.nextLine();

            switch (diaFinal) {
                case "LUNES":
                case "1":
                    diaFinalNumero = 1;
                    break;
                case "MARTES":
                case "2":
                    diaFinalNumero = 2;
                    break;
                case "MIERCOLES":
                case "MIÉRCOLES":
                case "3":
                    diaFinalNumero = 3;
                    break;
                case "JUEVES":
                case "4":
                    diaFinalNumero = 4;
                    break;
                case "VIERNES":
                case "5":
                    diaFinalNumero = 5;
                    break;
                case "SABADO":
                case "SÁBADO":
                case "6":
                    diaFinalNumero = 6;
                    break;
                case "DOMINGO":
                case "7":
                    diaFinalNumero = 7;
                    break;
                default:
                    System.err.println("No has introducido un día correcto.");
                    entradaCorrecta = false;
            }

            if (horaFinal < 0 || horaFinal > 23) {
                System.err.println("No has introducido una hora correcta.");
                entradaCorrecta = false;
            }

        } while (!entradaCorrecta);

        if (diaFinalNumero < diaInicioNumero) {
            System.err.println("El día de finalización no puede ser anterior al día inicial.");
        } else {
            horas = ((diaFinalNumero * 24) + horaFinal) - ((diaInicioNumero * 24) + horaInicio);
            System.out.printf("Entre las %d:00 del día %s y las %d:00 del día %s han pasado %d horas.%n",
                    horaInicio,
                    diaInicio.toLowerCase(),
                    horaFinal,
                    diaFinal.toLowerCase(),
                    horas);
        }
        
        teclado.close();

    } // Fin main

} // Fin class
