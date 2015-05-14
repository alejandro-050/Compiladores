
package Ejercicio21;

/**
 *Hacer un programa que calcule independientemente la suma de los pares y
los impares de los numeros entre 1 y 1000, utilizando un switch.
 * @author j3llyic3
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        int temporal, par=0, impar=0;
        
        for (int i = 0; i <= 1000; i++) {
            temporal=i % 2;
            switch (temporal) {
                case 0:
                    par+=i;
                    break;
                default:
                    impar+=i;
            }
        }
        System.out.println("Suma de pares "+par);
        System.out.println("Suma de impares "+impar);
    }
}
