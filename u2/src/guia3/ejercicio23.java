package guia3;


import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio23 {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        int min = 1;
        int max = 10;
        int [][] mat = matrizAleatoria(filas,columnas,min,max);
        System.out.println("matriz 1");
        imprimirMatriz(mat);
        int [][] mat2 = matrizAleatoria(filas,columnas,min,max);
        System.out.println("matriz 2");
        imprimirMatriz(mat2);
        int [][] resultado = sumaMatrices(mat,mat2);
        System.out.println("resultado");
        imprimirMatriz(resultado);

    }

    public static int[][] sumaMatrices(int[][] mat, int[][] mat2) {
        int [][] resultado = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultado [i][j] = mat [i][j] + mat2 [i][j];
            }
        }
       return resultado;
    }
}



//Realice una función sumaMatrices() que reciba como parámetros dos matrices de enteros. La función
//debe retornar una nueva matriz que sea el resultado de sumar las dos matrices recibidas. Considere
//que ambas matrices deben tener la mismas dimensiones.