
package Ejercicio44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *Hacer un programa que nos permita dar bajas en el fichero DATOS.DAT.
 * @author j3llyic3
 */
public class Ejercicio44 {
     public static void main(String[] arg) {
        int salir = 0, x, i = 0;
        String[] datos1 = new String[5];
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner esc = new Scanner(System.in);
        try {
            archivo = new File("DATOS.dat");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                datos1[i] = linea;
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Dato que desea eliminar");
        x = esc.nextInt();
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("DATOS.dat");
            pw = new PrintWriter(fichero);

            for (int y = 0; y < 5; y++) {
                if (y != (x - 1) && datos1[y] != null) {
                    pw.println(datos1[y]);
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
