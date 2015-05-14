
package Ejercicio24;

import java.util.Scanner;

/**
 *Comprobar si un numero mayor o igual que la unidad es primo.
 * @author j3llyic3
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero a revisar si es primo");
        int x=scan.nextInt();  
        int flag=0;
        for(int i=2;i<x;i++){
               if(x%i==0){
                   flag=1;
                 }         
           }
           if(flag==1)
            System.out.println("El numero no es primo");
           else
            System.out.println("El numero si es primo");   
        
        }

    }        

        
    

