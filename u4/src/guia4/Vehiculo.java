package guia4;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidad;
    @Override
    public String toString(){
        return String.format("Marca : %s\nModelo: %d\nVelocidad: %.2f", marca, modelo, velocidad);

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }
}

//Crear una clase Vehiculo con atributos marca, modelo y velocidad. Implementar métodos toString,
//acelerar(int kmh) y frenar(int kmh) que modifiquen la velocidad.