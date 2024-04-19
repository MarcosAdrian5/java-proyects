public class Sobrecarga {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Gladiadores", "San Felipe", 5);
        Equipo equipo2 = new Equipo("CDMX");

        System.out.println("El equipo dos es: " + equipo1);
        System.out.println("El equipo dos es: " + equipo2);

        equipo2.actualiza(10);
        equipo2.actualiza("Vencedores");
        System.out.println(equipo2);
    }
}
