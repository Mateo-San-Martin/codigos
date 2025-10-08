package guia3;

import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio28 {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 2;
        int min = 1;
        int max = 10;
        int [][] mat = matrizAleatoria(filas,columnas,min,max);
        System.out.println("matriz original");
        imprimirMatriz(mat);
        System.out.println("matriz transpuesta");
        imprimirMatriz(transponer(mat));

    }
    public static int[][] transponer(int [][] mat){
        int [][] resultado = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultado[j][i] = mat[i][j];
            }
        }
        return resultado;
    }

}


//Realice una función transponer() que reciba como parámetro una matriz de enteros y que
//devuelva la matriz transpuesta de la matriz recibida.
