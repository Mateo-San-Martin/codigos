package guia3;

import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio7.enteroAleatorio;

public class ejercicio20 {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;
        int min = 1;
        int max = 100;
        int [][] matriz = matrizAleatoria(filas,columnas,min,max);
        imprimirMatriz(matriz);
    }
    public static int[][] matrizAleatoria(int filas, int columnas, int min, int max){
        int [][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = enteroAleatorio(min,max);
            }
        }
        return matriz;
    }
}


//Realice una función matrizAleatoria() que reciba como parámetros cuatro valores enteros filas,
//columnas, min y max. La función debe retornar una matriz de filas filas y columnas columnas con
//números enteros aleatorios entre min y max (incluyendo a ambos).