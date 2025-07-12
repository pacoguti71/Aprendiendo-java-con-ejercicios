package principal;

/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 */

public class S02Ejercicio06 {

    public static void main(String[] args) {
        
        double baseImponible=1234.45;
        System.out.println("La base imponible es: "+baseImponible);
        
        double tasaIVA=16/100.0;
        System.out.println("La tasa de IVA es: "+tasaIVA);
        
        double IVA=baseImponible*tasaIVA;
        System.out.println("El IVA a repercutir es: "+IVA);
        
        double importe=baseImponible+IVA;
        System.out.println("El importe con IVA es: "+importe);

    } // Fin main

} // Fin class
