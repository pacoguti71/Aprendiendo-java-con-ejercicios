package principal;

/**
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada
 * asignatura de un color diferente.
 */
public class S01Ejercicio05 {

    public static void main(String[] args) {
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "Lunes", "Martes", "Miérc.", "Jueves", "Viernes");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "======", "======", "======", "======", "======");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "\u001B[32mPROG", "\u001B[32mPROG", "\u001B[32mPROG", "\u001B[32mPROG ", "\u001B[31mSIN");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "\u001B[32mPROG", "\u001B[32mPROG", "\u001B[32mPROG", "\u001B[32mPROG", "\u001B[31mSIN");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "\u001B[36mED", "\u001B[31mSIN", "\u001B[31mSIN", "\u001B[37mLM", "\u001B[35mBDATO");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "\u001B[33mFOL", "\u001B[31mSIN", "\u001B[31mSIN", "\u001B[37mLM", "\u001B[35mBDATO");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "\u001B[33mFOL", "\u001B[35mBDATO", "\u001B[36mED", "\u001B[35mBDATO", "\u001B[36mED");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "\u001B[33mFOL", "\u001B[35mBDATO", "\u001B[36mED", "\u001B[35mBDATO", "\u001B[36mED");
    } // Fin main

} // Fin class
