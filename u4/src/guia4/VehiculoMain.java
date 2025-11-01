package guia4;

public class VehiculoMain {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.marca = "volkswagen";
        vehiculo.modelo = "gol 2018";
        vehiculo.velocidad = 90;
        System.out.println(vehiculo.velocidad);
        vehiculo.setVelocidad(acelerar(vehiculo.velocidad));
        System.out.println(vehiculo.velocidad);
        vehiculo.setVelocidad(frenar(vehiculo.velocidad));
        System.out.println(vehiculo.velocidad);
    }
    public static int acelerar(int velocidad){
        velocidad = velocidad + 10;
        return velocidad;
    }
    public static int frenar(int velocidad){
        velocidad = velocidad - 10;
        return velocidad;
    }
}
