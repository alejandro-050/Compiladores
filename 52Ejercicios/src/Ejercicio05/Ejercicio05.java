
package Ejercicio05;

/**
 *Hacer un pseudocódigo que imprima los numeros impares hasta el 100 y que
imprima cuantos impares hay
 * @author j3llyic3
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int b,a=0;
        for(int i=0;i<=100;i++)
        {
          if(i%2==1)
          {
            b=i;
            System.out.println("El numero impar es "+b);
            a=a+1;
          }
        }
        System.out.println("La cantidad de numeros impares son: "+a);
    }
}
