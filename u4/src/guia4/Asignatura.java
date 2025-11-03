package guia4;

import java.util.ArrayList;

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
        return String.format("Nombre: %s\nCalificación: %d", nombre, calificacion);
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



    public static ArrayList obtenerAsignaturasAprobadas(Estudiante estudiante){
        ArrayList<Asignatura>materiasAprobadas = new ArrayList<>();
        for (int i = 0; i < estudiante.materias.size(); i++) {
            Asignatura asignatura = estudiante.materias.get(i);
            if (asignatura.calificacion > 6){
                materiasAprobadas.add(asignatura);
            }
        }
        return materiasAprobadas;
    }
}


//Modificar la clase Asignatura para que sus atributos sean privados. Implementar métodos getters
//para ambos atributos y un setter para la calificación que valide que esté entre 1 y 10.

//En la clase Estudiante modifique el atributo que almacena las asignaturas para que sea un
//ArrayList<Asignatura> en lugar de un array. Agregue también los métodos agregarAsignatura
//que permita agregar una asignatura a la lista y obtenerAsignaturasAprobadas que devuelva un
//ArrayList<Asignatura> con las asignaturas aprobadas.