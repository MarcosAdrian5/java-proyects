package mx.utng.rs11;

import java.time.LocalDate;

public class Programador extends Empleado {
    private String lenguajePrincipal;

    public Programador(byte edad, String nombre, LocalDate fechaNacimiento, float salario, String lenguajePrincipal) {
        super(edad, nombre, fechaNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void mostrarLenguaje(){
        System.out.println("El lenguaje principal es :" + lenguajePrincipal);
    }
}
