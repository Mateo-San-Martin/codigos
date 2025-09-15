package ejercicios.guia3;

public class ejercicio7 {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int n = 3;
        imprimirVector(vectorAleatorio(min,max,n));
    }

    public static int[] vectorAleatorio(int min, int max, int n) {
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = enteroAleatorio(min, max);


        }
        return vector;
    }

    public static int enteroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);

    }

    public static void imprimirVector(int[] vector) {
        for (int elemento : vector) {   // For-each o for mejorado
            System.out.print(elemento + " ");

        }
    }
}







//Realice una función que reciba como parámetros de entrada tres valores enteros min y max y n.
//La función debe retornar un vector de n elementos con números enteros aleatorios entre min y max
//(incluyendo a ambos).