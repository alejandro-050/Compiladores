
package Ejercicio08;

import java.io.IOException;

/**
 *Hacer un pseudocodigo que solo nos permita introducir S o N.
 * @author j3llyic3
 */
public class Ejercicio08 {
    public static void main(String[] args) throws IOException {
        char ch = ' ';
      while(ch != 'S' && ch != 'N'){
        System.out.println("Ingrese una S o una N para continuar : ");
	ch = (char) System.in.read();
      }
      System.out.println("Gracias por leer bien !!! ");	
}
}
	

