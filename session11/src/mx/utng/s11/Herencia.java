package mx.utng.s11;

public class Herencia {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(4.0, 5.0, "Estilo 1");
        System.out.println("Información sobre el tringulo ");
        triangulo1.mostrarEstilo();
        triangulo1.mostrarDimension();
        System.out.println("El area del tringulo es: "+ triangulo1.area());

        Triangulo triangulo2 = new Triangulo(7.0, 5.0, "Estilo 2");
        System.out.println("Información sobre el tringulo ");
        triangulo2.mostrarEstilo();
        triangulo2.mostrarDimension();
        System.out.println("El area del tringulo es: "+ triangulo2.area());

        Triangulo triangulo3 = new Triangulo(4.0, 9.0, "Estilo 3");
        System.out.println("Información sobre el tringulo ");
        triangulo3.mostrarEstilo();
        triangulo3.mostrarDimension();
        System.out.println("El area del tringulo es: "+ triangulo3.area());
    }
}
