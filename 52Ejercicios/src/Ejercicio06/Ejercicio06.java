
package Ejercicio06;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que imprima todos los numeros naturales que hay
desde la unidad hasta un numero que introducimos por teclado.
 * @author j3llyic3
 */
public class Ejercicio06 {
        public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=0,b;
        System.out.println("Introduce el numero");
        b=in.nextInt();
     while(a<b)
      {
        a=a+1;
        System.out.println("El numero natural es: "+a);
      }
    }
   
    
}
