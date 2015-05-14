
package Ejercicio27;

import java.util.Scanner;

/**
 *Realizar la tabla de multiplicar de un numero entre 0 y 10
 * @author j3llyic3
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x,y,z;
        System.out.println("Ingrese el numero a multiplicar");
        x= scan.nextInt();
        while(x<0||x>10)
        {System.out.println("Ese numero no esta en esta tabla porfavor ingrese otro numero");
        x= scan.nextInt();
        }
          for(int i=0;i<11;i++)
             {
              y=i*x;
              System.out.println(x+"x"+i+"="+y);
             }
    }
}
