package ejercicios.guia3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int [] vector = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();

        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}


//Declare e incialice un vector de 10 elementos enteros. Diseñe un algoritmo que permita llenar
//automáticamente el vector con los números del 1 al 10 (incluyendo a ambos) e imprima el vector
//resultante en pantalla.