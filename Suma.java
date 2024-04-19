public class Suma{
  public static void main(String... args){
    Addition s = new Addition();
    s.ejecutar(3,4);
    System.out.println(s.resultado);
  }
}
class Addition{
 private int numero1 = 0;
 private int numero2 = 0;
 public int resultado = 0;
 
 public void ejecutar(int n1, int n2){
   numero1 = n1;
   numero2 = n2;
   resultado = numero1 + numero2;
 } 
}