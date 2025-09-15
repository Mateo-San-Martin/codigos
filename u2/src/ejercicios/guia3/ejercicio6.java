package ejercicios.guia3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector [i] = 10-i;

        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }



    }
}


//Declare e incialice un vector de 10 elementos enteros. Diseñe un algoritmo que permita llenar el
//vector con los números del 10 al 1 (incluyendo a ambos), en orden descendente. Imprima el vector
//resultante en pantalla.
