
package Ejercicio09;

import java.util.Scanner;

/**
 *Introducir un numero por teclado. Que nos diga si es positivo o negativo
 * @author j3llyic3
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int i=0;
        System.out.println("Ingrese un numero");
        i=in.nextInt();
        if(i>=0){
        System.out.println("El numero ingresado es positivo");
        }else
        System.out.println("El numero ingresado es negativo");
    }
}
