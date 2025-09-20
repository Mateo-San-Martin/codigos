package guia3;

import static guia3.ejercicio1.imprimirVector;

public class ejercicio10 {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5,6};
        System.out.println("los numeros pares ingresados son: ");
        imprimirVector(paresEnVector(vector));
    }
    public static int[] paresEnVector(int[] vector){
        int num;
        for (int i = 0; i < vector.length; i++) {
            num = vector[i] % 2;

            if (num>0){
                vector[i]=0;
            }

        }
        return vector;
    }
}


//Realice una función que reciba como parámetro un vector de enteros. La función debe retornar la
//cantidad de elementos pares dentro del vector.
