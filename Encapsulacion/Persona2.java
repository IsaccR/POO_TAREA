package Encapsulacion;

public class Persona2 {

	String nombre;
    String apellido;
    int edad;

    public Persona2(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellido + " Edad: " + edad;
    }
}

