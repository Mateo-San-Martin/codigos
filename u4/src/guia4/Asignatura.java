package guia4;

public class Asignatura {
    private String nombre;
    private int calificacion;

    public Asignatura(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.calificacion = 7;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s/nCalificación: %d", nombre, calificacion);
    }
    public boolean estaAprobada(){
        return calificacion > 6;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(int calificacion) {
        if(calificacion<0){
            throw new IllegalArgumentException("La nota minima asignable es 10");
        }
        if (calificacion > 10){
            throw new IllegalArgumentException("La nota maxima asignable es 10");
        }
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }
    public static boolean estaAprobada(int calificacion){
        return calificacion > 6;
    }
}


//Modificar la clase Asignatura para que sus atributos sean privados. Implementar métodos getters
//para ambos atributos y un setter para la calificación que valide que esté entre 1 y 10.
