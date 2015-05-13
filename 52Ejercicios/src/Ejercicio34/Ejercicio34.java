package Ejercicio34;

/**
 * Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas,
 * las almacene en un vector y calcule e imprima su media
 *
 * @author j3llyic3
 */
public class Ejercicio34 {

    public static void main(String[] args) {
        String[] asignaturas = {"Matematica", "Biologia", "Quimica", "Lenguaje", "Fisica", "Ingles", "Historia", "E. Fisica", "E. musical",
            "Computacion"};
        double suma = 0;
        double notas[] = new double[10];
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Ingrese una nota para " + asignaturas[i] + " : ");
            notas[i] = Double.parseDouble(read());
            suma += notas[i];
        }
    }

    private static String read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
