package guia4;

public class CuentaBancaria {
    private double saldo;
    static double tasaDeInteres = 1.5;

    public static void setTasaDeInteres(double tasaDeInteres) {
        if(tasaDeInteres < 0){
            throw new IllegalArgumentException("El interes no puede ser negativo");
        }
        CuentaBancaria.tasaDeInteres = tasaDeInteres;
    }

    public void depositar(double monto){
        saldo = saldo + monto;
    }
    public double retirar(double monto){
        if(saldo < monto){
            throw new IllegalArgumentException("No puede retirar mas de lo que posee de saldo");
        }
        saldo = saldo - monto;
        return monto;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo + "a una tasa del" + tasaDeInteres +
                '}';
    }
    public double calcularInteres(){
        return saldo * tasaDeInteres;
    }
}

//Crear una clase CuentaBancaria con un atributo privado saldo y métodos
//públicos depositar(double monto) y retirar(double monto).
//Implementar validaciones para evitar que el saldo sea negativo.

//Agregar un atributo estático tasaDeInteres a la clase CuentaBancaria.
//Agregar un método0 calcularInteres() que devuelva el interés generado en base al saldo actual y
//la tasa de interés estática.