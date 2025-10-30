package guia4;

public class TiempoMain {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();
        tiempo.sumarSegundos(2);
        tiempo.sumarMinutos(60);
        tiempo.sumarHoras(24);
        tiempo.sumarDias(3);

        System.out.println(tiempo);


    }
}

//Crear una clase Tiempo con atributos dias, hora, minutos y segundos. Implementar los métodos
//sumarSegundos, sumarMinutos, sumarHoras y sumarDias que modifiquen la hora actual del objeto
//teniendo en cuenta los límites (60 segundos, 60 minutos, 24 horas).
