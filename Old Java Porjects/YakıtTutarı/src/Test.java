
import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Araç 1 kilometrede ne kadar yakıyor");
        double a= scanner.nextDouble();
        System.out.println("Araç 1 kilometrede ne kadar yol yapıyor");
        scanner.hasNextLine();
        double b = scanner.nextDouble();
        System.out.println("Aracınıza bu kadar ödeme yapmalısınız:" + a*b + "tl dir...");
        
    }
    
}
