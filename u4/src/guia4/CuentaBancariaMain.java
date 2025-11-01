package guia4;

public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.depositar(2000);
        System.out.println(cuentaBancaria);
        cuentaBancaria.retirar(1500);
        System.out.println(cuentaBancaria);
        System.out.println(cuentaBancaria.calcularInteres());
    }
}
