package guia3;

import static guia3.ejercicio1.imprimirVector;
import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio25 {
    public static void main(String[] args) {
        int fila = 4;
        int columna = 4;
        int min = 1;
        int max = 10;
        int columnaObtener = 1;
        int [][] mat = matrizAleatoria(fila,columna,min,max);
        System.out.println("matriz");
        imprimirMatriz(mat);
        System.out.println("resultado");
        imprimirVector(obtenerColumna(mat,columnaObtener));


    }
    public static int [] obtenerColumna(int [][] mat, int columnaObtener){
        int [] resultado = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultado [i] = mat[i][columnaObtener];
            }
        }
        return resultado;
    }
}

//Realice una función obtenerColumna() que reciba como
// parámetros una matriz de enteros y un
//valor entero columna. La función debe retornar un
// vector con los elementos de la columna columna
//de la matriz.