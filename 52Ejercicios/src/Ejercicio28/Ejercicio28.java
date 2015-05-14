
package Ejercicio28;

import java.util.Random;
import java.util.Scanner;

/**
 *Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara
o cruz
 * @author j3llyic3
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese 'Y' si desea voltear la moneda");
        String option= scan.nextLine();
        String moneda;
        while(option.equals("Y")||option.equals("y") )
        {
            int x=random.nextInt();
            if(x%2==0)
            moneda="Aguila";
            else
            {moneda="Sello";}
            System.out.println("La moneda callo en: "+moneda);
            System.out.println("Desea otro lanzamiento Y/N");
            option= scan.nextLine();
        }
}
}