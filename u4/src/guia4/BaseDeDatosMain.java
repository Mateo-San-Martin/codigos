package guia4;

import java.util.ArrayList;

import static guia4.Asignatura.obtenerAsignaturasAprobadas;

public class BaseDeDatosMain {
    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();
        e1.nombre = "mateo";
        e2.nombre = "ezequiel";
        e1.materias = new ArrayList<>();
        e2.materias = new ArrayList<>();
        e1.materias.add(new Asignatura("matematicas", 10));
        e1.materias.add(new Asignatura("lengua", 6));
        e2.materias.add(new Asignatura("matematicas", 6));
        e2.materias.add(new Asignatura("lengua", 10));
        e1.estadoDeLasMaterias();
        e2.estadoDeLasMaterias();
        System.out.println();
        System.out.println(obtenerAsignaturasAprobadas(e1));
        System.out.println(obtenerAsignaturasAprobadas(e2));
    }
}
