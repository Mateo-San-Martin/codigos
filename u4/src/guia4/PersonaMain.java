package guia4;

import static guia4.Persona.esMayorDeEdad;

public class PersonaMain {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "pepe";
        persona.edad = 10;
        persona.altura = 1.75;
        System.out.println(persona);
        System.out.println(esMayorDeEdad(persona.edad));
    }
}
