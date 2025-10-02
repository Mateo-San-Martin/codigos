package guia3;

import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio22 {
    public static void main(String[] args) {
        int n = 10;
        int [][] matriz = new int[0][0];
        matriz = identidad(n, matriz);
        imprimirMatriz(matriz);



    }
    public static int [][] identidad(int n, int [][] matriz){
        matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j){
                    matriz [i][j] = n;
                }
            }
        }
        return matriz;
    }
}


//(*) Realice una función identidad() que reciba como parámetro un valor entero n. La función debe
//retornar una matriz de n filas y n columnas que sea la matriz identidad de orden n.