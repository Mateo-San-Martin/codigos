package guia4;

public class SensorTemperatura {
    private double temperatura;
    static boolean enGradosCelcius = true;

    public void setTemperatura(double temperatura) {
        if (enGradosCelcius){
            if(temperatura<-273){
                throw new IllegalArgumentException("La temperatura no puede estar por debajo del 0 absoluto");
            }
            this.temperatura = temperatura;
        }
        if (enGradosCelcius == false){
            this.temperatura = temperatura * 1.8 + 32;
        }
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        if(enGradosCelcius) {
            return String.format("Temperatura:%.2f Grados Celcius", temperatura);
        }
        return String.format("Temperatura:%.2f Grados Farenheit", temperatura);
    }
}

//Crear una clase SensorTemperatura con un atributo privado temperatura y un atributo estático
//booleano enGradosCelcius. Implementar un método0 setter para la temperatura y un método0 getter
//que devuelva la temperatura. Si el atributo estático enGradosCelcius es true, la temperatura se
//asigna y se devuelve en grados Celsius; si es false, se asigna y se devuelve en grados Fahrenheit.