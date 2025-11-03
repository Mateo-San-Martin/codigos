package guia4;

public class Fecha {
    int dia;
    int mes;
    int año;

    public int diaHasta(Fecha fecha){
        int dias = 0;
        dias += (this.año - fecha.año) * 365;
        dias += (this.mes - fecha.mes) * 30;
        dias += (this.dia - fecha.dia);
        return dias;
    }
    public int diaEntreFechas(Fecha fecha1, Fecha fecha2){
        int dias = 0;
        dias += (fecha2.año - fecha1.año) * 365;
        dias += (fecha2.mes - fecha1.mes) * 30;
        dias += (fecha2.dia - fecha1.dia);
        return dias;
    }
    public DiaSemana diaDeLaSemana() {
        int numero = (dia - 1) % 7;
        return DiaSemana.values()[numero];
    }
}

//Crear una clase Fecha con atributos atributos enteros día, mes y un atributo del tipo Año. Agregar
//un método0 toString que devuelva la fecha en formato dd/mm/aaaa y un método0 diasHasta(Fecha f)
//que reciba otro objeto Fecha y devuelva la cantidad de días que faltan hasta la fecha ingresada.