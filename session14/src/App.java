import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author Marcos Adrian Alvarado Zarazúa
 * @category GDS0622
 * @since 10/02/2024
 */
public class App {
    public static void main(String[] args) throws Exception {
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Platanos");
        listaFrutas.add("Sandia");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        System.out.println(listaFrutas);

        Collections.reverse(listaFrutas);
        System.out.println(listaFrutas);
        System.out.println("Mas pequeño: "+Collections.min(listaFrutas));
        System.out.println("Mas grande: "+Collections.max(listaFrutas));
        Collections.sort(listaFrutas);
        System.out.println(listaFrutas);
        System.out.println("La pera esta en la posicion: "+(Collections.binarySearch(listaFrutas, "Pera")+1));
        System.out.println("La naranja esta en la posicion: "+(Collections.binarySearch(listaFrutas, "Naranja")+1));
        Collections.addAll(listaFrutas, "Manzana", "Manzana", "Manzana");
        System.out.println(listaFrutas);
        Collections.shuffle(listaFrutas);
        System.out.println(listaFrutas);
        System.out.println("Hay "+Collections.frequency(listaFrutas, "Manzana") + " Manzanas en la lista");
    }
}
