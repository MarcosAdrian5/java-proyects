package mx.utng.retos13;
/**
 * @author Marcos Adrian Alvarado
 * @category GDS0622
 * @since 07/02/24
 */
public class Rectangulo implements Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es: "+ (base * altura));
    }
}
