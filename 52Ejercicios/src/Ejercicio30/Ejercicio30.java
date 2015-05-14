package Ejercicio30;

import java.util.Random;
import java.util.Scanner;

/**
 *Simular una carrera de dos caballos si cada uno tiene igual probabilidad
de ganar
 * @author j3llyic3
 */
public class Ejercicio30 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese 'Y' si desea jugar carreras");
        String option= scan.nextLine();
        String gano;
        while(option.equals("Y")||option.equals("y") )
        {
            int x=random.nextInt();
            if(x%2==0){
            gano="Caballo negro!";
            }else{
                gano="Caballo blanco!";
                }
            System.out.println("El ganador de esta carrera es el "+gano);
            System.out.println("Desea otra carrera Y/N");
            option= scan.nextLine();
        }
    
    
    } 
}
