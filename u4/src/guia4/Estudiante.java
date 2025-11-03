package guia4;

import java.util.ArrayList;
import java.util.Arrays;

public class Estudiante {
    String nombre;
    ArrayList<Asignatura>materias;

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < materias.size() ; i++) {
            suma += materias.get(i).getCalificacion();
        }
        return suma / materias.size();
    }
    public void estadoDeLasMaterias(){
        for (int i = 0; i < materias.size(); i++) {
            System.out.printf("Materia:%s Aprobada:%b \n", materias.get(i).getNombre(), materias.get(i).estaAprobada());


        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", materias=" + materias +
                '}';
    }

    public void agregarAsignatura(Asignatura asignatura){
        if(asignatura == null){
            throw new RuntimeException("debe crear una lista primero");
        }
        materias.add(asignatura);
    }
}


//Crear una clase Estudiante con atributos nombre y un array de objetos Asignatura. Implementar
//un métodoo calcularPromedio que devuelva el promedio de las calificaciones de las asignaturas y
//otro métodoo estadoDeLasAsignaturas que imprima en pantalla el nombre de cada asignatura y si
//está aprobada o no.


//En la clase Estudiante modifique el atributo que almacena las asignaturas para que sea un
//ArrayList<Asignatura> en lugar de un array. Agregue también los métodos agregarAsignatura
//que permita agregar una asignatura a la lista y obtenerAsignaturasAprobadas que devuelva un
//ArrayList<Asignatura> con las asignaturas aprobadas.
