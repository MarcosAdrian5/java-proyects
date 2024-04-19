import mx.utng.s07.Lector;
import mx.utng.s07.ListasTareas;
import mx.utng.s07.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();

        byte opcionSeleccionada = 0;

        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();

            System.out.println("\n\n La opción seleccionada es:"+ opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();
                    break;
                case 2:
                    lista.verListaDeTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actulizarListaTareas();
                    break;
                case 5:
                    lista.eliminarListaTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación...Adiós");
                default:
                    System.out.println("Opción desconocida");
                    break;
            }
        } while (opcionSeleccionada != 6);
    }
}
