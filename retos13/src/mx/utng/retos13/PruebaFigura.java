package mx.utng.retos13;
/**
 * @author Marcos Adrian Alvarado
 * @category GDS0622
 * @since 07/02/24
 */
public class PruebaFigura {
    public static void main(String[] args) {
        Figura figura;

        figura = new Triangulo(8, 6);
        figura.calcularArea();

        figura = new Rectangulo(9, 8);
        figura.calcularArea();

        figura = new Cuadrado(6);
        figura.calcularArea();
    }
}
