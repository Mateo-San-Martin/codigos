package guia3;

import static guia3.ejercicio1.imprimirVector;

public class ejercicio11 {
    public static void main(String[] args) {
        int [] vector = {1,2,3,4,5};
        int[] vector2 = {6,7,8,9,10};
        imprimirVector(sumaDeVectores(vector, vector2));

    }
    public static int[] sumaDeVectores(int[] vector, int[] vector2){
        int largo = vector.length + vector2.length;
        int [] suma = new int[largo];
        int i = 0;
        for (i = 0; i < vector.length; i++) {
            suma [i] = vector[i];

        }
        for (int j = 0; j < vector2.length; j++,i++) {
            suma[i] = vector2[j];
        }
        return suma;
    }
}


//Realice una función que reciba como parámetro dos vectores de enteros de la misma dimensión.
//La función debe retornar un vector con la suma (elemento a elemento) de los elementos de los dos
//vectores recibidos.