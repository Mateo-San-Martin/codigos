package guia3;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        int [][]matriz = new int[2][2];
        matriz [0][0] = 1;
        matriz [0][1] = 2;
        matriz [1][0] = 3;
        matriz [1][1] = 4;

        imprimirMatriz(matriz);
    }
    public static void imprimirMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf( "%-18d",matriz[i][j]);

            }
            System.out.println();
        }
    }
}


//Realice una función imprimirMatriz() que reciba como parámetro una matriz de enteros y que
//imprima la matriz en pantalla en forma de tabla.
