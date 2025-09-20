package guia3;

public class ejercicio12 {
    public static void main(String[] args) {
        int [] vector = {1,2,3,4,5,6,7,8,9,10};
        int num = 9;
        System.out.println(indiceDeNum(vector, num));
    }
    public static int indiceDeNum(int[]vector, int num){
        int indice = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num){
                indice = i;
            }

        }
        return indice;
    }
}
