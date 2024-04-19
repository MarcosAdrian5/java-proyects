package mx.utng.s13;

public class Polimorfismo {
    public static void main(String[] args) {
        Venado v = new Venado();
        Animal a = v;
        Hervivoro h = v;
        Object o = v;

        System.out.println("Venado : "+ (v instanceof Venado));
        System.out.println("Animal : "+ (v instanceof Animal));
        System.out.println("Hervivoro : "+ (v instanceof Hervivoro));
        System.out.println("Objeto : "+ (v instanceof Object));

    }
}
