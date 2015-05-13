
package Ejercicio41;

import java.util.Scanner;

/**
 *Se dispone de una tabla de 5 paginas, 10 filas y 20 columnas, que se
refieren al centro, al curso y al numero de alumnos de un colegio
respectivamente. Imprimir la nota media por curso y la nota media maxima y
su centro de pertenencia
 * @author j3llyic3
 */
public class Ejercicio41 {
    Scanner sc = new Scanner(System.in);

    String cursos[]= new String[5];
    int array1[][]= new int[5][4];
    int array2[][]= new int[5][4];
    int array3[][]= new int[5][4];
    int array4[][]= new int[5][4];
    int array5[][]= new int[5][4];
    double media1=0;
    double media2=0;
    double media3=0;
    double media4=0;
    double media5=0;
   
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Nombre del curso");
            cursos[i]=sc.next();
            for(i=0;i<5;i++){
             System.out.println("Nota "+i+": ");
            
           }
    }
    
}
