
package Ejercicio52;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author j3llyic3
 */
public class Ejercicio52 {
  public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int x = 0;
        Scanner escaner = new Scanner(System.in);
        Ejercicio52 eje = new Ejercicio52();

        eje.consulta();

    }

    private void consulta() {

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

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
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

        System.out.println("Dato que desea consultar indicar linea");
        x = esc.nextInt();

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {

            for (int y = 0; y < 5; y++) {
                if (y == (x - 1) && datos1[y] != null) {
                    System.out.print(datos1[y]);
                    System.out.println(" ");
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
