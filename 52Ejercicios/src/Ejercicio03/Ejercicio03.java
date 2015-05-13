
package Ejercicio03;

/**
 *Hacer un pseudocodigo que imprima los numeros pares entre 0 y 100.
 * @author j3llyic3
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int b;
        for(int i=0;i<=100;i++)
        {
          if(i%2==0)
          {
            b=i;
            System.out.println("El numero par es "+b);
          }
        }
    }
}
