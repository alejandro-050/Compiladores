
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
        int intervalo=101;
        int array[][]= new int[5][4];
        
        for(int i=0;i<5;i++){
            System.out.print("\t"); 
           for(int j=0;j<4;j++){
           array[i][j]=(int) rnd.nextDouble()*intervalo;
           System.out.print(array[i][j]+" ");
           }

        }

    }
    
}
