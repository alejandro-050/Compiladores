
package Ejercicio18;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que cuente las veces que aparece una determinada
letra en una frase que introduciremos por teclado.
 * @author j3llyic3
 */
public class Ejercicio18 {
     public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String Cadena="";
        char Compara = ' ';
        
        System.out.println("Introduce la cadena: ");
        Cadena = escaner.nextLine();
        System.out.println("Introduce la letra a buscar: ");
        Compara = escaner.nextLine().charAt(0);
	
	int veces=0;
	char []caracteres = Cadena.toCharArray();
        for(int i=0;i<=caracteres.length-1;i++){
            if(Compara ==caracteres[i]){
            veces++;
            }
	}
        System.out.println("Se encontro la letra ("+Compara+"): "+veces+" veces");
    }
}
