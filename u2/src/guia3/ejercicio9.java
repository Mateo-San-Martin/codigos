package guia3;

public class ejercicio9 {
    public static void main(String[] args) {
        int[] vector = {8,8,8,8,8,8,8,8,8,8};
        double resultado = promedioVectores(vector);

        System.out.println(resultado);
    }
    public static double promedioVectores ( int[] vector){
        int suma = 0;
        int resultado = 0;
        int divisor = vector.length;
            for (int i = 0; i < vector.length; i++) {
                suma = suma + vector[i];
            }
        resultado = suma / divisor;
        return resultado;
    }
}




//Realice una función que reciba como parámetro un vector de enteros. La función debe retornar
//el promedio de los elementos del vector.
