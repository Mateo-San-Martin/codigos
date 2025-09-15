package ejercicios.operadores;
import java.util.Scanner;
public class operador2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numerador: ");
        num1 = teclado.nextInt();
        System.out.println("ingrese el cociente: ");
        num2 = teclado.nextInt();
        resultado = num1/num2;
        System.out.println("el resultado de la division es: " + resultado);

    }
}
