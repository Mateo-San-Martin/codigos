package guia4;

import java.util.ArrayList;

public class BaseDeDatos {
    ArrayList<Estudiante>listaEstudiantes;


    public void eliminarEstudiante(ArrayList<Estudiante>listaEstudiantes, int numero){
        listaEstudiantes.remove(numero);
    }
    public void agregarEstudiante(ArrayList<Estudiante>listaEstudiantes, int numero){
        listaEstudiantes.remove(numero);
    }
}
