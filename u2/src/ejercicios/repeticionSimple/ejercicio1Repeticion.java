package ejercicios.repeticionSimple;

import java.util.Scanner;

public class ejercicio1Repeticion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        while (teclado.nextInt() == 1){
            System.out.println(10);
            System.out.println(10);
            System.out.println(10);
            System.out.println(10);
            System.out.println(10);
        }
    }
}
