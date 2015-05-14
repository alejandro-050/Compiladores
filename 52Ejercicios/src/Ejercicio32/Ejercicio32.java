
package Ejercicio32;

import java.util.Scanner;

/**
 *Hacer un programa que nos permita introducir un numero por teclado y sobre
el se realicen las siguientes operaciones: comprobar si es primo, hallar
su factorial o imprimir su tabla de multiplicar.
 * @author j3llyic3
 */
public class Ejercicio32 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int x= scan.nextInt();
        System.out.println("1 Revisar si el numero es primo");
        System.out.println("2 Factorial del numero");
        System.out.println("3 Tabla de multiplicar del numero");
        int z= scan.nextInt();
        switch(z)
        {
             case 1: 
                 int flag=0;
                 for(int i=2;i<x;i++)
                     {
                      if(x%i==0)
                        {
                         flag=1;
                        }
                     }
                     if(flag==1)
                       System.out.println("Ese numero no es primo");
                     else
                        System.out.println("Ese numero si es primo");
                    break;
             case 2: 
                        int aux=x;           
                    for(int i=x;i>1;i--)     
                    {
                       int y= (aux*(i-1));   
                       aux=y;    
                    }
                    System.out.println("El numero factorial es: "+aux);
                    break;            
             case 3: 
                    for(int i=0;i<11;i++)
                        {
                         int y=i*x;
                         System.out.println(x+"x"+i+"="+y+"\n");
                        }
                    break;        
              
        }
}
}