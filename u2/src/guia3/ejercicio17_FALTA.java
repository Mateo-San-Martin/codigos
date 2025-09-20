package guia3;

public class ejercicio17_FALTA {
    public static void main(String[] args) {
        String [][] nombres = new String[2][2];
        nombres [0][0] = "Nombre";
        nombres [0][1] = "Apellido";
        nombres [1][0] = "Mateo";
        nombres [1][1] = "San Martin";

        imprimirMatrizNombres(nombres);
    }
    public static void imprimirMatrizNombres(String[][] nombres) {
        for (String[] fila : nombres) {
            for (String elemento : fila) {
                System.out.printf("%-18d ", elemento);
            }
            System.out.println();
        }
    }
}

//Realice una matriz del tipo String de dos filas y dos columnas. Guarde manualmente la siguiente
//información tal como se indica a continuación:
//En la primer fila y primer columna: La palabra “Nombre”.
//En la primer fila y segunda columna: La palabra “Apellido”.
//En la segunda fila y primer columna: Escriba su propio nombre.
//En la segunda fila y segunda columna: Escriba su propio apellido.
