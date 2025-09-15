package ejercicios.guia3;

public class ejercicio1 {
    public static void main(String[] args) {
        int [] vector ={1,2,3,4,5};
        imprimirVector(vector);


    }
    public static void imprimirVector(int [] vector) {
        for (int elemento : vector) {   // For-each o for mejorado
            System.out.print(elemento + " ");
        }
    }

}


//Realice un programa donde se declare un vector de elementos enteros. Asígnele mediante llaves a
//cada posición un dígito de su documento de identidad. Luego imprimir el vector en pantalla.