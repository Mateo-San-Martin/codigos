package ejercicios.guia3;

import static ejercicios.guia3.ejercicio7.imprimirVector;
import static ejercicios.guia3.ejercicio7.vectorAleatorio;

public class ejercicio8 {
    public static void main(String[] args) {
        int n = 10;
        int [] vector = new int[n];
        int min = 7;
        int max = 21;
        imprimirVector(vectorAleatorio(min,max,n));
        
    }

}


//Realice un programa que cargue un vector de diez elementos con números enteros aleatorios per-
//tenecientes al intervalo [7; 21]. Posteriormente imprimir el vector en pantalla y el mayor elemento
//de dicho vector.
