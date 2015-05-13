
package Ejercicio07;

import java.io.IOException;

/**
 * Introducir tantas frases como queramos y contarlas
 * @author j3llyic3
 */
public class Ejercicio07 {
    public static void main(String[] args) throws IOException {
       int a=0;
        char ch = ' ';
       
       while(ch != 'S' && ch != 'N'){
	   System.out.println("Escriba una frase");
           a=a+1;       
	   System.out.println("Ingrese una S o una N para continuar : ");
	   ch = (char) System.in.read();
       }
       
       System.out.println("Las frases ingresadas fueron: "+a);
    }
}
