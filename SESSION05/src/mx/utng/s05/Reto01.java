package mx.utng.s05;

import java.util.Scanner;

public class Reto01 {
    public static void main(String[] args) {
        String mensaje = " ";
        //Defino objeto scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea una calificación: ");
        int calif = scanner.nextInt();

        if (calif == 10) {
            mensaje = "Excelente";
        }else if (calif ==8 || calif==9) {
            mensaje = "Muy bien";
        }else if (calif == 7) {
            mensaje = "Bien hecho";
            
        }else if (calif == 6) {
            mensaje = "Pasaste";
            
        }else if (calif == 5) {
            mensaje = "Mejor vuelve a intentarlo";
            
        } else {
            mensaje = "Nota invalida";
        }

        System.out.println(mensaje);
    }
}
