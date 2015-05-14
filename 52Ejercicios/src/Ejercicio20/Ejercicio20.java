
package Ejercicio20;

import java.util.Scanner;

/**
 *Calcular el factorial de un numero, mediante subprogramas
 * @author j3llyic3
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        int var1;
        Ejercicio20 prob = new Ejercicio20();
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introducir numero que quiera el factorial");
        var1= escaner.nextInt();
        System.out.println("El factorial es: "+prob.factorial(var1));
    }
    
    /**
     * Metodo que calcula el factorial
     */
    private double factorial(int a){
        double var1=a;
        for (int i = a; i > 2; i--) {
            var1 = var1*(i-1);
            
        }
        return var1;
    }
}
