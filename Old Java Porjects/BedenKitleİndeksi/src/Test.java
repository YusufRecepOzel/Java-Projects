
import java.util.Scanner;



public class Test {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu yazın: ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu yazın (Örnek 1,70): ");
        scanner.hasNextLine();
        Double boy= scanner.nextDouble();
        System.out.println("Beden Kitle İndeksniz Şudur:" + kilo / (boy*boy));
        
    }   
}
