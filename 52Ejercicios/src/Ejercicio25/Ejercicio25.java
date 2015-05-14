
package Ejercicio25;

import java.util.Scanner;

/**
 *
 * @author j3llyic3
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, i;
        int MDecimal[] = {5000, 4000, 1000, 900, 500, 400,100, 90, 50, 40,10, 9, 5, 4, 1};
        String MRomano[] = {"V", "MV", "M", "CM", "D", "CD","C", "XC", "L", "XL","X", "IX", "V", "IV", "I"};

        System.out.println("Introduzca un numero: ");
         x = scan.nextInt();
        if (x<=5000) 
           {
            i = 0;
            System.out.println("Numero Romano: ");
             while (x > 0) 
                {
                 if (x >= MDecimal[i])
                    { 
                      System.out.print(MRomano[i]);
                      x = x - MDecimal[i]; 
                    } 
                 else 
                       i++; 
                }
            
    }
  }
}
