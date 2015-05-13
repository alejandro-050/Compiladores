/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio39;

import java.util.Scanner;

/**
 *Ordenar una matriz de M filas y N columnas por la primera columna
utilizando el m‚todo SHELL (por insercion)
 * @author j3llyic3
 */
public class Ejercicio39 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int a=0; //columnas
        int b=0; //filas
        int array[][]= new int[a][b];
        System.out.println("Cuantas columnas seran?");
        b=sc.nextInt();
        System.out.println("Cuantas filas seran?");
        a=sc.nextInt();
        
        for(int i=0;i<b;i++){
           for(int j=0;j<a;j++){
           System.out.println("Ingresa el dato "+j+":");
           array[i][j]=sc.nextInt();
           }

        }
}
