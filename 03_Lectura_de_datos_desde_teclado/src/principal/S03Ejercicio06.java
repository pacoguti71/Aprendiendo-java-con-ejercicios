package principal;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un triángulo.
 *
 */
public class S03Ejercicio06 {

    public static void main(String[] args) {
        
        double base;
        double altura;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la base del triángulo: ");
        base=teclado.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        altura=teclado.nextDouble();
        
        double areaTriangulo1=(base*altura)/2;
        System.out.printf("El area de un triángulo de base %.2f y altura %.2f es %.2f\n",base,altura,areaTriangulo1);
        double areaTriangulo2=base*altura/2;
        System.out.printf("El area de un triángulo de base %.2f y altura %.2f es %.2f\n",base,altura,areaTriangulo2);

        
        //PEMDAS
        System.out.println(base+altura/2);
        System.out.println((base+altura)/2);
        
    } // Fin main

} // Fin class
