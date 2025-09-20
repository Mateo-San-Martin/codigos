package guia3;


import static guia3.ejercicio1.imprimirVector;
import static guia3.ejercicio11.sumaDeVectores;

public class ejercicio15 {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5};
        int[] vector2 = {6,7,8,9,10};
        imprimirVector(sumaDeVectores(vector,vector2));

    }
}

//Realice una función que reciba como parámetros dos vectores de enteros. La función debe
//retornar un tercer vector con los elementos que se encuentran en ambos vectores ordenados de
//menor a mayor. Considere que los vectores ingresados ya se encuentran ordenados de menor a
//mayor.
