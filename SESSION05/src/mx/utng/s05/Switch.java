package mx.utng.s05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String mensaje;
        //Defino objeto scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea una calificación: ");
        int calif = scanner.nextInt();

        switch (calif) {
            case 10:
              //mensaje = "Excelente";
                System.out.println("Excelente");
                break;

            case 9:
                System.out.println("Muy bien");
                break;
            case 8:
                System.out.println("Muy bien");
                break;    
            case 7:
                System.out.println("Bien hecho");
                break;
            case 6:
                System.out.println("Pasaste");
                break;
            case 5:
                System.out.println("Mejor vuelve a intentarlo");
        
            default:
                System.out.println("Calificación invalida");
                break;
        }
    }

}
