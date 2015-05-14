
package Ejercicio11;

import java.util.Scanner;

/**
 *Imprimir y contar los multiplos de 3 desde la unidad hasta un numero que
introducimos por teclado
 * @author j3llyic3
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a,b=0;
        System.out.println("Ingrese un numero");
        a=in.nextInt();
        
        for(int i=0;i<=a;i++){
           if(i%3==0)
            {
               b=b+1;
               System.out.println("El numero es par");
            }
        }
        System.out.println("La cantidad de multiplos fueron: "+b);
        
    }
   
}
