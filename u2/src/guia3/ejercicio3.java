package guia3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int n;
        int [] vector;
        System.out.println("ingrese un numero positivo");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n<0){
            while (n<0) {
                System.out.println("el numero ingresado es negativo, ingrese otro nuevamente");
                n = sc.nextInt();
            }
        }
        vector = new int[n];

    }
}


//(a) Realice un programa donde se declare un vector sin inicializar y una variable entera llamada
//n.
//(b) A continuación pídale al usuario que ingrese un número entero positivo y lo guarde en la
//variable.
//(c) Para finalizar, inicialice el vector asignándole una dimensión de n. Si el valor de n no es
//positivo, entonces notifíquele al usuario que el número es erróneo y permita ingresar el valor
//nuevamente.
