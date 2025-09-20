package guia3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nombreYapellido = new String[2];
        nombreYapellido [0] = sc.next();
        nombreYapellido [1] = sc.next();
        System.out.println(nombreYapellido [0]);
        System.out.println(nombreYapellido [1]);
    }
}


//Realice un programa donde se declare un vector de 2 elementos del tipo String. Luego manual-
//mente, asigne su nombre a la posición 0 y su apellido a la posición 1. Para finalizar, imprima el
//vector en la pantalla.
