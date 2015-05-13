package Ejercicio35;

import java.util.Scanner;

/**
 * Usando el segundo ejemplo, hacer un programa que busque una nota en el vector
 *
 * @author j3llyic3
 */
public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a,b=0,p=0;
        double[] numeros = new double[10]; 
        double suma = 0;
        
        System.out.println("Ingresa los datos del arreglo: ");
        for (i = 0; i < 10; i++) {
            System.out.print("Numero[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
        System.out.println("Que numero deseas buscar");
        a= sc.nextInt();
        
        for (i = 0; i < 10; i++) {
             if(numeros[i]==a){
                 b=1;
                 p=i;
             }
            }
        if(b==1){
          System.out.println("El dato si esta en el arreglo y se encuentra en la posicion"+p);
        }
        
    }
} 