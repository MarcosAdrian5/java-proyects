package mx.utng.s20;

public class Ciudadano {
    public static void main(String[] args) {
        Gobierno gobierno = Gobierno.getInstance();
        gobierno.darApoyo();

        Gobierno pseudoOtro = Gobierno.getInstance();
        pseudoOtro.darApoyo();
    }
}
