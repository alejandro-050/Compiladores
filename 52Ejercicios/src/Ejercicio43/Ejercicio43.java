
package Ejercicio43;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *Hacer un programa que nos permita dar altas en el fichero secuencial
DATOS.DAT, cuyos campos son: DNI, NOMBRE, APELLIDOS, DIRECCION y
PROVINCIA
 * @author j3llyic3
 */
public class Ejercicio43 {
     public static void main(String[] args) {
        int salir = 0, x;
        
        String[] datos = new String[5];
        String[] campos = {"DNI", "Nombre", "Apellidos", "Direccion", "Provincia"};

        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter("DATOS.dat");
            pw = new PrintWriter(fichero);

            while (salir != 1) {
                Scanner escaner = new Scanner(System.in);
                int i=0;
                for (i = 0; i < 5; i++) {
                    System.out.println("Introduce " + campos[i] + " :");
                    datos[i] = escaner.nextLine();
                }
                
                for (int y = 0; y < 5; y++) {
                    pw.print(datos[y]);
                    pw.print(" ");
                }
                pw.println("");
                
                System.out.println("Deseas ingresar otro Dato?\n1) Si \n2) No");
                x=escaner.nextInt();
                    if(x==2){
                        salir=1;
                    }
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
