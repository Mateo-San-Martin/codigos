package guia4;

public class Año {
    int año;

    public static boolean esBisiesto(int año){
        if(año<0){
            año = año*-1;
        }
        double chequeo1 = año%4;
        double chequeo2 = año%100;
        double chequeo3 = año%400;
        if(chequeo1==0) {
            return true;
        }
        if(chequeo2 == 0){
            return chequeo3 == 0;
        }
        return false;
    }

    @Override
    public String toString() {
        if(año<0){
            return String.format("Año:%d antes de cristo", año*(-1));
        }
        return String.format("Año:%d ", año);
    }

}

//Crear una clase Año (si hay problemas con la ‘ñ’ usar Anio o Year) con un atributo año (entero).
//Implementar un métodoo esBisiesto que devuelva true si el año es bisiesto y false en caso contrario
//y un métodoo toString que devuelva el año como cadena de texto y si el año es negativo indicar
//que es antes de Cristo (a.C.).