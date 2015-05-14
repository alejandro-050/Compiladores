
package Ejercicio12;

/**
 *Hacer un pseudocodigo que imprima los numeros del 1 al 100. Que calcule la
suma de todos los numeros pares por un lado, y por otro, la de todos los
impares.
 * @author j3llyic3
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int a=0,b=0;
        
        for (int i = 1; i <= 100; i++) {
            if(i%2==0)
            {
             a=a+i;
            }else if(i%2==1)
            {
             b=b+i;
            }
            
            System.out.println(i);
        }
        System.out.println("La suma de todos los numeros pares son: "+a);
        System.out.println("La suma de todos los numeros impares son: "+b);
    }
  
}
