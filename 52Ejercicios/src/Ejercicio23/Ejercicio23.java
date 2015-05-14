
package Ejercicio23;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que imprima los n£meros del 0 al 100, controlando
las filas y las columnas
 * @author j3llyic3
 */
public class Ejercicio23 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero de columnas:");
        int x= sc.nextInt();
        System.out.print("Ingrese numero de filas");
        int y= sc.nextInt();
        int[][] array = new int[x][y];
       
       while(x*y>101||x<=0||y<=0)
        {
        System.out.print("Recuerde que el area de la matriz no debe exceder 101\n");
        System.out.print("\nIngrese el tamano de columnas(no ingrese zero ni negativos):");
        x= sc.nextInt();
        System.out.print("Ingrese el tamano de filas(no ingrese zero ni negativos):");
        y= sc.nextInt();
        }
         int n = x*y;
         int k=0;
         for(int i=0;i<x;i++)
         {
          System.out.print("\n ");
         for(int j=0;j<y;j++)
         {
          if(k<=n)
          {array[i][j]=k;
          k++;
        System.out.print("("+array[i][j]+")");
          }
         }
         }
         
         
         
    }
}
