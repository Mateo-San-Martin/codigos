package guia3;

import static guia3.ejercicio19.imprimirMatriz;
import static guia3.ejercicio20.matrizAleatoria;

public class ejercicio30 {
    public static void main(String[] args) {
        int n = 5;
        imprimirMatriz(diagonalN(n));
    }

    public static int[][] diagonalN(int n) {
        int[][] resultado = new int[n][n];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                resultado[i][0] = n + i;
                if (i == j) {
                    resultado[i][j] = n;
                } else {
                    resultado[0][i] = n - i;

                }
            }
        }
        return resultado;
    }
}

//Realice una función que reciba un valor entero positivo n correspondiente a la dimensión de una
//matriz y que devuelva una matriz cuadrada de tal forma que cada diagonal contenga el mismo
//valor comenzando por 1 e incrementando en 1 en cada diagonal.