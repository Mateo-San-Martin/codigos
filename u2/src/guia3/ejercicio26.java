package guia3;

import static guia3.ejercicio1.imprimirVector;
import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio26 {
    public static void main(String[] args) {
        int fila = 4;
        int columna = 4;
        int min = 1;
        int max = 10;
        int filaSumar = 1;
        int [][] mat = matrizAleatoria(fila,columna,min,max);
        System.out.println("matriz");
        imprimirMatriz(mat);
        System.out.println("resultado");
        imprimirVector(sumaFilas(mat,filaSumar));


    }
    public static int [] sumaFilas(int [][] mat, int filaSumar){
        int [] resultado = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultado[i] = resultado[i] + mat[i][j];
            }
        }


        return resultado;
    }
}

//Realice una función sumaFilas() que reciba como
// parámetros una matriz de enteros. La función
//debe retornar un vector con la suma de los elementos
// de cada fila de la matriz.
