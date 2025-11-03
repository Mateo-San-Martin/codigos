package guia4;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public static void Saludar(){
        System.out.println("hola ");
    }

    public static void Saludar(Persona persona){
        System.out.println("hola " + persona.nombre);
    }

    public static void Saludar(String nombre){
        System.out.println("hola " + nombre);
    }

    @Override
    public String toString(){
        return String.format("Nombre : %s\nEdad: %d\nAltura: %.2f", nombre, edad, altura);

    }
    public static boolean esMayorDeEdad(int edad){
      return edad > 17;
}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if (edad > 120){
            throw new IllegalArgumentException("paraaa que sos un fosil?");
        }
        this.edad = edad;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            throw new IllegalArgumentException("La altura no puede ser negativa");
        }
        if(altura > 2.50){
            throw new IllegalArgumentException("que sos el humano mas alto de la tierra o que");
        }
        this.altura = altura;
    }
}
