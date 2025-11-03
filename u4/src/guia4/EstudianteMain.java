package guia4;

public class EstudianteMain {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Mateo San Martín";

        System.out.println("Promedio: " + estudiante.calcularPromedio());
        estudiante.estadoDeLasMaterias();
    }
}

//Crear una clase Estudiante con atributos nombre y un array de objetos Asignatura. Implementar
//un métodoo calcularPromedio que devuelva el promedio de las calificaciones de las asignaturas y
//otro métodoo estadoDeLasAsignaturas que imprima en pantalla el nombre de cada asignatura y si
//está aprobada o no.

