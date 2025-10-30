package guia4;

import static guia4.Año.esBisiesto;

public class AñoMain {
    public static void main(String[] args) {
        Año año = new Año();
        año.año = -2025;
        System.out.println(esBisiesto(año.año));
        System.out.println(año);
    }
}
