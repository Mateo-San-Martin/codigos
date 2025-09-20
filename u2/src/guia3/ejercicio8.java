package guia3;

import static guia3.ejercicio7.enteroAleatorio;
import static guia3.ejercicio7.imprimirVector;

public class ejercicio8 {
    public static void main(String[] args) {
        int n = 10;
        int min = 7;
        int max = 21;
        int [] vector;
        vector = new int[n];
        imprimirVector(vectorAleatorio(min,max,n,vector));
        int temp = 0;
        for (int i = 0; i < vector.length; i++) {
            if (temp<vector[i]){
                temp = vector[i];
            }
        }
        System.out.println();
        System.out.println("el numero mas grande es el " + temp);

    }


    public static int[] vectorAleatorio(int min, int max, int n, int[] vector) {

        for (int i = 0; i < n; i++) {
            vector[i] = enteroAleatorio(min, max);


        }
        return vector;
    }

}


//Realice un programa que cargue un vector de diez elementos con números enteros aleatorios per-
//tenecientes al intervalo [7; 21]. Posteriormente imprimir el vector en pantalla y el mayor elemento
//de dicho vector.
