package guia4;

import static guia4.Resistor.calcularEquivalenteParalelo;
import static guia4.Resistor.calcularEquivalenteSerie;

public class ResistorMain {
    public static void main(String[] args) {
        Resistor[] resistor = new Resistor[3];
        resistor[0] = new Resistor();
        resistor[0].setResistencia(1000);
        resistor[1] = new Resistor();
        resistor[1].setResistencia(1000);
        resistor[2] = new Resistor();
        resistor[2].setResistencia(1000);
        System.out.println(calcularEquivalenteParalelo(resistor));

    }
}
