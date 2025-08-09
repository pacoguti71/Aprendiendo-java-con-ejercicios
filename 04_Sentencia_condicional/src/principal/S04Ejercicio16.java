package principal;

import java.util.Scanner;

/**
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. A
 * continuación se listan las preguntas del test.
 *
 */
public class S04Ejercicio16 {

    public static void main(String[] args) {
        final int PUNTOS_VERDAD = 3;
        int puntosObtenidos = 0;
        char respuestaChar;
        String respuesta;

        Scanner teclado = new Scanner(System.in);

        System.out.println("TEST DE FIDELIDAD");
        System.out.println("Este programa te dirá si hay probabilidad de que tu pareja está siendo infiel.\n");

        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
        respuestaChar = teclado.nextLine().toUpperCase().charAt(0);
        if (respuestaChar == 'V') {
            puntosObtenidos += PUNTOS_VERDAD;
        }

        System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
        respuestaChar = teclado.nextLine().toUpperCase().charAt(0);
        switch (respuestaChar) {
            case 'V':
                puntosObtenidos += PUNTOS_VERDAD;
                break;
            default:
                break;
        }

        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
        respuestaChar = teclado.nextLine().toUpperCase().charAt(0);
        puntosObtenidos += respuestaChar == 'V' ? PUNTOS_VERDAD : 0;

        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v)erdadero o (f)also: ");
        respuesta = teclado.nextLine().toUpperCase().charAt(0) + "";
        if (respuesta.equals("V")) {
            puntosObtenidos += PUNTOS_VERDAD;
        }

        System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ");
        respuesta = teclado.nextLine();
        if (respuesta.toUpperCase().equals("V")) {
            puntosObtenidos += PUNTOS_VERDAD;
        }

        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v)erdadero o (f)also: ");
        respuesta = teclado.nextLine();
        if (respuesta.toUpperCase().substring(0, 1).equals("V")) {
            puntosObtenidos += PUNTOS_VERDAD;
        }

        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n(v)erdadero o (f)also: ");
        respuesta = teclado.nextLine();
        if (respuesta.matches("[Vv]")) {
            puntosObtenidos += PUNTOS_VERDAD;
        }

        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v)erdadero o (f)also: ");
        respuesta = teclado.nextLine();
        if (respuesta.toUpperCase().matches("[V]")) {
            puntosObtenidos += PUNTOS_VERDAD;
        }

        System.out.print("9. Has notado que últimamente se perfuma más.\n(v)erdadero o (f)also: ");
        respuesta = teclado.nextLine();
        if (respuesta.matches("[Vv]")) {
            puntosObtenidos += PUNTOS_VERDAD;
        }

        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ");
        respuesta = teclado.nextLine();
        if (respuesta.matches("[Vv]")) {
            puntosObtenidos += PUNTOS_VERDAD;
        }

        if (puntosObtenidos > 21) {
            System.out.println("\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra\npersona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        } else if (puntosObtenidos > 10) {
            System.out.println("\nQuizás exista el peligro de otra persona en su vida o en su mente, aunque\nseguramente será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }

    } // Fin main

} // Fin class
