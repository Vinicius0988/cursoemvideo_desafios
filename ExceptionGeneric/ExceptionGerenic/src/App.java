
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        try {
            System.out.println("Digite um numero decimal");
            double num = leNumero();
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }
        
       
}
 public static double leNumero() throws Exception {
            Scanner sc = new Scanner(System.in);

            double numero = sc.nextDouble();
            return numero;
        }
}
