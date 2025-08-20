package principal;

import java.util.Scanner;

/**
 * La piedra gana a la tijera, la tijera gana al papel y el papel gana a la
 * piedra. Si ambos jugadores eligen la misma opción, es un empate.
 *
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una
 * opción incorrecta, el programa deberá mostrar un mensaje de error.
 *
 */
public class S04Ejercicio28 {

    public static void main(String[] args) {
        int ganador;
        String jugada1;
        String jugada2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduce piedra, papel o tijera): ");
        jugada1 = teclado.nextLine().toUpperCase();
        if (!jugada1.equals("PIEDRA") && !jugada1.equals("PAPEL") && !jugada1.equals("TIJERA")) {
            System.err.println("Opción incorrecta.");
            return;
        }
        System.out.print("Turno del jugador 2 (introduce piedra, papel o tijera): ");
        jugada2 = teclado.nextLine().toUpperCase();
        if (!jugada2.equals("PIEDRA") && !jugada2.equals("PAPEL") && !jugada2.equals("TIJERA")) {
            System.err.println("Opción incorrecta.");
            return;
        }

        if (jugada1.equals(jugada2)) {
            System.out.println("Empate");
        } else {
            ganador = 2;
            switch (jugada1) {
                case "PIEDRA":
                    if (jugada2.equals("TIJERA")) {
                        ganador = 1;
                    }
                    break;
                case "PAPEL":
                    if (jugada2.equals("PIEDRA")) {
                        ganador = 1;
                    }
                    break;
                case "TIJERA":
                    if (jugada2.equals("PAPEL")) {
                        ganador = 1;
                    }
                    break;
            }
            
            System.out.println("Gana el jugador "+ganador);
        }

    } // Fin main

} // Fin class
