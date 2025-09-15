package ejercicios.operadores;
import java.util.Scanner;
public class operador1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        resultado = num1+num2;
        System.out.println("resultado: " + resultado);
    }
}
