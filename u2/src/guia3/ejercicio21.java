package guia3;

import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio21 {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;
        int min = 1;
        int max = 2;
        int [][] matriz = matrizAleatoria(filas,columnas,min,max);
        int escalar = 2;
        escalar(matriz, escalar);
        imprimirMatriz(matriz);
    }

    public static int[][] escalar(int [][] matriz, int escalar){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = matriz [i][j] * escalar;
            }
        }
        return matriz;
    }
}


//Realice una función escalar() que reciba como parámetros una matriz de enteros y un valor
//entero escalar. La función debe retornar una nueva matriz que sea el resultado de multiplicar
//cada elemento de la matriz por el valor escalar.
