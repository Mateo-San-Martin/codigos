package guia4;

import java.util.ArrayList;

public class SistemaSensores {
    ArrayList<SensorTemperatura>sistemaSensores;

    public double promedioTemperatura(){
        double promedio = 0;
        for (int i = 0; i < sistemaSensores.size(); i++) {
            promedio += sistemaSensores.get(i).getTemperatura();
        }
        return promedio/sistemaSensores.size();
    }
}
