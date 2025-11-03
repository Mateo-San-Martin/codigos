package guia4;

import java.util.ArrayList;

public class Resistor {


    private double resistencia;

    public static double calcularEquivalenteSerie(Resistor[] resistor){
        double total = 0;
        for (int i = 0; i < resistor.length; i++) {
            total =+ resistor[i].getResistencia();
        }
        return total;
    }
    public static double calcularEquivalenteParalelo(Resistor[] resistor){
        double total = 0;
        for (int i = 0; i < resistor.length; i++) {
            total =+ resistor[i].getResistencia();
        }
        return 1.0/total;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getResistencia() {
        return resistencia;
    }

    public double calcularEquivalenteSerie(ArrayList<Resistor>resistors){
        double total = 0;
        for (int i = 0; i < resistors.size(); i++) {
            total += resistors.get(i).getResistencia();
        }
        return total;
    }
    public static double calcularEquivalenteParalelo(ArrayList<Resistor>resistors){
        double total = 0;
        for (int i = 0; i < resistors.size(); i++) {
            total +=resistors.get(i).getResistencia();
        }
        return 1.0/total;
    }
}


//Crear una clase Resistor con un atributo privado resistencia (en ohms).
//Implementar métodos estáticos calcularEquivalenteSerie que reciba un array de objetos Resistor
//y devuelva la resistencia equivalente en serie, y calcularEquivalenteParalelo
// que devuelva la resistencia equivalente en paralelo.
