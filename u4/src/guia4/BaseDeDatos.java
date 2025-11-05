package guia4;

import java.util.ArrayList;

public class BaseDeDatos {
    ArrayList<Estudiante>listaEstudiantes;

    public void eliminarEstudiante(int numero){
        listaEstudiantes.remove(numero);
    }
    public void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "BaseDeDatos{" +
                "listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
