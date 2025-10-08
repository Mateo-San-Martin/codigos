package guia3;

import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio27 {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        int min = 1;
        int max = 10;
        int[][] mat = matrizAleatoria(filas, columnas, min, max);
        System.out.println("matriz 1");
        imprimirMatriz(mat);
        System.out.println("resultado");
        System.out.print(sumaDiagonal(mat));

    }

    public static int sumaDiagonal(int[][] mat) {
        int resultado = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    resultado = resultado + mat[i][j];
                }
            }
        }
        return resultado;
    }
}

//Realice una función sumaDiagonal() que reciba como parámetro una matriz cuadrada de enteros.
//La función debe retornar la suma de los elementos de la diagonal principal de la matriz. Si la
//matriz no es cuadrada, la función debe retornar -1.