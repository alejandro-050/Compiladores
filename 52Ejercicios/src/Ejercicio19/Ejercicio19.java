
package Ejercicio19;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que simule el funcionamiento de un reloj digital y
que permita ponerlo en hora
 * @author j3llyic3
 */
public class Ejercicio19 {
       public static void main(String[] args) throws InterruptedException {
        int i = 0;  
        int j = 0; 
        int bucle=1;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        i= escaner.nextInt();
        System.out.println("Introduce los minutos: ");
        j= escaner.nextInt();
        
        while(bucle == 1){
            for( i = i; i <= 23; i++ ) { 
                for( j = j; j <= 59; j++ ) { 
                if( i < 10 & j >= 10 ) 
                    System.out.println("Son las: 0" +i+ ":" +j+" Hrs"); 
                else if( i < 10 & j < 10 ) 
                    System.out.println("Son las 0" +i+ ":" + "0" +j+" Hrs"); 
                else 
                    System.out.println("Son las " +i+ ":" +j+ " Hrs"); 

                Thread.sleep(1000);
                }j=0;
            }i=0;
        }  
    } 
}
