
package Ejercicio36;

import java.util.Random;

/**
 *Generar una matriz de 4 filas y 5 columnas con numeros aleatorios entre 1
y 100, e imprimirla
 * @author j3llyic3
 */
public class Ejercicio36 {
    public static void main(String[] args) {
        Random rnd = new Random();
        
        int array[][]= new int[5][4];
        
        for(int i=0;i<5;i++){
           for(int j=0;j<4;j++){
           System.out.println(array[i][j]+rnd.nextDouble()*100);
           }

        }

    }
    
}
