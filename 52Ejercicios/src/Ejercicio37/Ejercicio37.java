
package Ejercicio37;

import java.util.Random;

/**
 *Generar una matriz de 4 filas y 5 columnas con n£meros aleatorios entre 1
y 100, y hacer su matriz transpuesta
 * @author j3llyic3
 */
public class Ejercicio37 {
    public static void main(String[] args) {
        Random rnd = new Random();
        
        int array[][]= new int[5][4];
        
        for(int i=0;i<5;i++){
           System.out.print("\t"); 
           for(int j=0;j<4;j++){
           System.out.print(array[i][j]+rnd.nextDouble()*100);
           }

        }
        System.out.println("La matriz transpuesta es: ");
        for(int j = 0; j < 4; j++){
            System.out.print("\t"); 
            for(int i = 0; i < 5; i++){
                System.out.print(array[j][i]);
            }
        }
    }
}
