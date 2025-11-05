package guia4;

public class Notas {
    double [][] calificaciones;

    public double calcularPromedioPorEstudiante(double [][] calificaciones, int numero){
        double promedio = 0;
        for (int i = 0; i < calificaciones[numero].length; i++) {
            promedio += calificaciones[numero][i];
        }
        return promedio/calificaciones[numero].length;
    }
    public double calcularPromedioPorMateria(double [][] calificaciones, int numero){
        double promedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i][numero];
        }
        return promedio/calificaciones.length;
    }
}
