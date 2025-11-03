package guia4;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(){
        this.base = 1;
        this.altura = 1;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int calcularArea(){
        return base*altura;
    }
}


//Crear una clase Rectangulo con atributos base y altura. Implementar dos constructores: uno que
//reciba ambos atributos como parámetros y otro que no reciba parámetros y asigne valores pre-
//determinados (base = 1, altura = 1). Agregue métodos setters y getters para los atributos y un
//método0 calcularArea() que devuelva el área del rectángulo.
