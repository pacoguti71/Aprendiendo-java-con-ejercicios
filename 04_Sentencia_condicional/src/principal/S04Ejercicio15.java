package principal;

/**
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un símbolo como
 * *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú
 * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo,
 * hacia la izquierda o hacia la derecha.
 *
 */
import java.util.Scanner;

public class S04Ejercicio15 {

    public static void main(String[] args) {
        char c;
        int direccion;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el carcater que quieres usar para dibujar la pirámide: ");
        c = teclado.nextLine().charAt(0);

        System.out.println("Indica la dirección del vértice de la pirámide\n"
                + "1. Hacia arriba\n"
                + "2. Hacia abajo\n"
                + "3. Hacia la derecha\n"
                + "4. Hacia la izquierda");
        direccion = teclado.nextInt();

        switch (direccion) {
            case 1:
                System.out.println("  " + c);
                System.out.println(" " + c + c + c);
                System.out.println("" + c + c + c + c + c);
                break;
            case 2:
                System.out.println("" + c + c + c + c + c);
                System.out.println(" " + c + c + c);
                System.out.println("  " + c);
                break;
            case 3:
                System.out.println("    " + c);
                System.out.println("  " + c + " " + c);
                System.out.println(c + " " + c + " " + c);
                System.out.println("  " + c + " " + c);
                System.out.println("    " + c);
                break;
            case 4:
                System.out.println("" + c);
                System.out.println(c + " " + c);
                System.out.println(c + " " + c + " " + c);
                System.out.println(c + " " + c);
                System.out.println("" + c);
                break;
        }

    } // Fin main

} // Fin class
