package mx.utng.s29;

import java.util.function.Function;

public class Ejercicio1 {

   /*  forma 1
   private final StringToInteger parser = new StringToInteger() {
        public Integer convertir(String s){
        return Integer.parseInt(s);
        }
    };
    */
    //forma 2
   // private final StringToInteger parser = s -> Integer.parseInt(s);
   //forma 3
   //private final StringToInteger parser = Integer::parseInt;

   //para no usar la interface StringToInteger 
   private final Function<String, Integer> parser = Integer::parseInt;
    Integer sumar(String a, String b){
        return parser.apply(a)+ parser.apply(b);
    }
}
