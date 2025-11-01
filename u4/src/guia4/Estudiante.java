package guia4;

import java.util.Arrays;

public class Estudiante {
    String nombre;
    Asignatura[] materias;

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < materias.length ; i++) {
            suma += materias[i].getCalificacion();
        }
        return suma / materias.length;
    }
    public void estadoDeLasMaterias(){
        for (int i = 0; i < materias.length; i++) {
            System.out.printf("Materia:%s Aprobada:%b \n", materias[i].getNombre(), materias[i].estaAprobada());


        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", materias=" + Arrays.toString(materias) +
                '}';
    }
}

//Crear una clase Estudiante con atributos nombre y un array de objetos Asignatura. Implementar
//un métodoo calcularPromedio que devuelva el promedio de las calificaciones de las asignaturas y
//otro métodoo estadoDeLasAsignaturas que imprima en pantalla el nombre de cada asignatura y si
//está aprobada o no.
