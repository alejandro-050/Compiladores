/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *Introducir un numero por teclado. Que nos diga si es par o impar.
 * @author j3llyic3
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int i=0;
        System.out.println("Ingrese un numero");
        i=in.nextInt();
        
        if(i%2==0)
        {
            System.out.println("El numero es par");
        }else if(i%2==1)
          {
            System.out.println("El numero es impar");
          }
    }
}
