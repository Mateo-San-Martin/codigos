package guia4;

public class Persona {
    public String nombre;
    public int edad;
    public double altura;


    @Override
    public String toString(){
        return String.format("Nombre : %s\nEdad: %d\nAltura: %.2f", nombre, edad, altura);

    }
    public static boolean esMayorDeEdad(int edad){
      return edad > 17;
}
}
