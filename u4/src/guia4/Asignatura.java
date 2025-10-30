package guia4;

public class Asignatura {
    String nombre;
    int calificacion;

    public Asignatura(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s/nCalificación: %d", nombre, calificacion);
    }
    public boolean estaAprobada(){
        return calificacion > 6;
    }
}
