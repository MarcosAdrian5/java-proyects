package mx.utng.rs11;

import java.time.LocalDate;

public class Empleado extends Persona {
    private float salario;

    public Empleado(byte edad, String nombre, LocalDate fechaNacimiento, float salario) {
        super(edad, nombre, fechaNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
    public void mostrarSalario(){
        System.out.println("El salario del empleado es: " + salario);
    }
}
