
package Ejercicio26;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *Introducir una frase por teclado. Imprimirla en el centro de la pantalla
 * @author j3llyic3
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce frase");
        String text = scan.nextLine();
        JOptionPane.showMessageDialog(null, text);
    }
}
