package mx.utng.rs11;

import java.time.LocalDate;

public class Persona {
    private byte edad;
    private String nombre;
    private final LocalDate fechaNacimiento;
    

    
    public Persona(byte edad, String nombre, LocalDate fechaNacimiento) {
        this.edad = edad;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public byte getEdad() {
        return edad;
    }
    public void mostrarDatos(){
        System.out.println("La persona se llama: "+nombre+ "su edad es: "+edad+ "su fecha de nacimiento es: "+fechaNacimiento);
    }
}
