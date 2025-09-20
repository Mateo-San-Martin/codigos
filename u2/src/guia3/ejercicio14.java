package guia3;

public class ejercicio14 {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector.length-i;
        }
        for (int j = 0; j < vector.length ; j++) {
            System.out.println(vector[j]);
        }
    }
}
