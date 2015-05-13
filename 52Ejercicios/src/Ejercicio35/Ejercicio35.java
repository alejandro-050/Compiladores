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
        int i;
        double[] numeros = new double[10]; 
        double suma = 0;
        
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
 
        for (i = 0; i < 10; i++) {
              suma += numeros[i];
            }
         System.out.println("Media es: " + suma/10);
        
    }
} 