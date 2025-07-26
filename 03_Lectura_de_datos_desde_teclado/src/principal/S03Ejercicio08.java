package principal;

import java.util.Scanner;

public class S03Ejercicio08 {

    public static void main(String[] args) {

        int costeHora = 12;
        int diasTrabajados;
        int horaTrabajadas;
        int salario;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce cuántos días has trabajado este semana: ");
        diasTrabajados = teclado.nextInt();
        System.out.print("Introduce cuántas horas has trabajado cada día: ");
        horaTrabajadas = teclado.nextInt();
        salario = diasTrabajados * horaTrabajadas * costeHora;
        System.out.printf("Tu salario de esta semana es de: %d €\n", salario);

    } // Fin main

} // Fin class
