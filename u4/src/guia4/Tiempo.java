package guia4;

public class  Tiempo {
    int dias;
    int horas;
    int minutos;
    int segundos;

    int suma;
    int suma2;
    int suma3;
    int suma4;
    @Override
    public String toString() {
        return "Tiempo{" +
                "dias=" + dias +
                ", horas=" + horas +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }

    public void sumarSegundos(int suma){
        segundos = segundos + suma;
        if(segundos > 59){
            segundos = segundos - 60;
            sumarMinutos(suma2 + 1);
        }

    }
    public void sumarMinutos(int suma2){
        minutos = minutos + suma2;
        if(minutos>59){
            minutos = minutos - 60;
            sumarHoras(suma3 + 1);
        }
    }
    public void sumarHoras(int suma3){
        horas = horas + suma3;
        if (horas > 23){
            horas = horas - 24;
            sumarDias(suma4 + 1);
        }
    }
    public void sumarDias(int suma4){
        dias = dias + suma4;
    }

}

//Crear una clase Tiempo con atributos dias, hora, minutos y segundos. Implementar los métodos
//sumarSegundos, sumarMinutos, sumarHoras y sumarDias que modifiquen la hora actual del objeto
//teniendo en cuenta los límites (60 segundos, 60 minutos, 24 horas).
