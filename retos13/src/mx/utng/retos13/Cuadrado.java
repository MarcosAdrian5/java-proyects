package mx.utng.retos13;
/**
 * @author Marcos Adrian Alvarado
 * @category GDS0622
 * @since 07/02/24
 */
public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del cuadrado es: "+ (lado * lado));
    }
}
