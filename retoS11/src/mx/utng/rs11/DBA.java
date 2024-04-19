package mx.utng.rs11;

import java.time.LocalDate;

public class DBA extends Empleado {
    private String herraminetaConsultas;

    public DBA(byte edad, String nombre, LocalDate fechaNacimiento, float salario, String herraminetaConsultas) {
        super(edad, nombre, fechaNacimiento, salario);
        this.herraminetaConsultas = herraminetaConsultas;
    }

    public String getHerraminetaConsultas() {
        return herraminetaConsultas;
    }

    public void mostrarHerramineta(){
        System.out.println("La herramienta cosultas es :" + herraminetaConsultas);
    }
}
