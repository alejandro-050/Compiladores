
package Ejercicio14;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que imprima el mayor y el menor de una serie de
cinco numeros que vamos introduciendo por teclado
 * @author j3llyic3
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int array[]= new int[4];
        
        for(int i=0;i<=4;i++){
        System.out.println("Ingrese un numero");
        array[i]=in.nextInt();
        }
        
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if (array[j] < array[j + 1])
                {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        System.out.println("El numero mayor es: "+array[4]);
        System.out.println("El numero menor es: "+array[0]);
    }
    
}
