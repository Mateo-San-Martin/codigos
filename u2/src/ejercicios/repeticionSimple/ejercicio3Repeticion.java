package ejercicios.repeticionSimple;

import java.util.Scanner;

public class ejercicio3Repeticion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        double numero4;
        double numero5;
        double numero6;
        double numero7;
        numero1 = teclado.nextDouble();
        numero2 = teclado.nextDouble();
        numero3 = teclado.nextDouble();
        numero4 = teclado.nextDouble();
        numero5 = teclado.nextDouble();
        numero6 = teclado.nextDouble();
        numero7 = teclado.nextDouble();
        double resultado = (numero1+numero2+numero3+numero4+numero5+numero6+numero7)/7;
        System.out.println("el resultado de los promedios es: "+ resultado);

        }
    }
