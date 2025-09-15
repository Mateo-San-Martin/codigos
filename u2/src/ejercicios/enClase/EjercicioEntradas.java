package ejercicios.enClase;
import  java.util.Scanner;
public class EjercicioEntradas {
    /*
    Diseñe un programa que permita cargar: la altura, la edad y el nombre del usuario
    exactamente en ese orden, y que luego imprima toda la información del usuario en la
    consola.
     */

    // Import para el scanner: import java.util.Scanner;
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su altura");
        double altura = teclado.nextDouble();
        System.out.println("ingrese su edad");
        int edad = teclado.nextInt();
        System.out.println("ingrese su nombre");
        teclado.nextLine();
        String nombre = teclado.nextLine();
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.print("altura: " + altura);

    }
}
