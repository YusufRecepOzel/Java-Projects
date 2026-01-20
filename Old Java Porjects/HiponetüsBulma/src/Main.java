
import java.util.Scanner;





public class Main {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Üçgenin Birinci Kenarını Girin");
       double a = scanner.nextDouble();
       System.out.println("Üçgenin İkinci Kenarını Girin");
       scanner.hasNextLine();
       double b = scanner.nextDouble();
       System.out.println("Üçgenin Hipotenüsü Şudur" + Math.sqrt(a*a + b*b));
       
       }
       
    }
    

