package principal;

/**
 * Escribe un programa que declare 5 variables de tipo char. A continuación,
 * crea otra variable como cadena de caracteres y asígnale como valor la
 * concatenación de las anteriores 5 variables. Por último, muestra la cadena de
 * caracteres por pantalla ¿Qué problemas te encuentras? ¿cómo lo has
 * solucionado?
 */
public class S02Ejercicio08 {

    public static void main(String[] args) {
        
        char var1='C';
        char var2='U';
        char var3='R';
        char var4='S';
        char var5='O';
        
        String variableTexto;
        
        //variableTexto=var1+var2+var3+var4+var5;
        variableTexto=""+var1+var2+var3+var4+var5;
        
        System.out.println(variableTexto);
        
        //char variableNumero=var1+var2+var3+var4+var5;
        
        int variableNumero=var1+var2+var3+var4+var5;
        
        System.out.println(variableNumero);
        
        char var6= (char) variableNumero;
        
        System.out.println(var6);

    } // Fin main

} // Fin class
