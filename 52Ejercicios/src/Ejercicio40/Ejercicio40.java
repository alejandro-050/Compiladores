
package Ejercicio40;

/**
 *Crear una tabla de 3 paginas, 4 filas y 5 columnas donde el primer
elemento valga 1, el segundo 2, el tercero 3 y as¡ sucesivamente, e
imprimirla
 * @author j3llyic3
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        int array[][]= new int[5][4];
        int cont=1;
        
        for(int i=0;i<3;i++){
           
            for(i=0;i<5;i++){
             System.out.print("/t ");
             for(int j=0;j<4;j++){
             array[i][j]=cont;
             System.out.print(array[i][j]+ " ");
             cont=cont+1;
           }
    }
}
    }
}
