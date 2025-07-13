package principal;

/**
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asígnales los valores 144 y 999 respectivamente. A continuación, muestra por
 * pantalla el valor de cada variable, la suma, la resta, la división y la
 * multiplicación.
 */
public class S02Ejercicio01 {

    public static void main(String[] args) {
        
        int x=144;
        int y;
        y=999;
        
        System.out.println("El valor de la variable x es "+x);
        System.out.println("El valor de la variable y es "+y);
        
        System.out.println("La suma de x y de y es "+(x+y));
        
        int resta=x-y;
        System.out.println("La resta de x menos y es "+resta);
        
        System.out.printf("La multiplicación de %s por %s es %s\n",x,y,(x*y));
        
        System.out.println("La división de x entre y es "+((double)x/(double)y));
    } // Fin main

} // Fin class
