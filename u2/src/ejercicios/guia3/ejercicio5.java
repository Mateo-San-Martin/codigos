package ejercicios.guia3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int [] tabla = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero por el cual quiera calcular la tabla de multiplicar");
        int numero = sc.nextInt();
        for (int i = 1; i < tabla.length; i++) {
            tabla [i] = numero*i;

        }
        for (int i = 1; i < tabla.length; i++) {
            System.out.println(tabla [i]);

        }
    }
}


//(a) Realice un programa donde declare un vector de enteros llamado tabla de 10 elementos.
//Diseñe un algoritmo que permita calcular la tabla de multiplicar del 4 y guarde cada valor
//en una posición del vector tabla. Imprima el vector tabla
//(b) Al inciso anterior agregarle una variable entera llamada numero. Permita al usuario ingresar
//un valor para la variable numero y calcule la tabla de multiplicar del número ingresado.
