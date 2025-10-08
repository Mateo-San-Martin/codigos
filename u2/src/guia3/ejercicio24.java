package guia3;

import static guia3.ejercicio1.imprimirVector;
import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio24 {
    public static void main(String[] args) {
        int fila = 4;
        int columna = 4;
        int min = 1;
        int max = 10;
        int filaObtener = 1;
        int [][] mat = matrizAleatoria(fila,columna,min,max);
        System.out.println("matriz");
        imprimirMatriz(mat);
        System.out.println("resultado");
        imprimirVector(obtenerFila(mat,filaObtener));


    }
    public static int [] obtenerFila(int [][] mat, int filaObtener){
        int [] resultado = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultado [i] = mat[filaObtener][i];
            }
        }
        return resultado;
    }
}

//Realice una función obtenerFila() que reciba como
//parámetros una matriz de enteros y un valor
//entero fila. La función debe retornar un vector con
//los elementos de la fila fila de la matriz.
