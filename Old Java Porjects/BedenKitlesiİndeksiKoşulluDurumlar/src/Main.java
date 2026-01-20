
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Kilonuzu Yazın");
        double a = scanner.nextDouble();
        System.out.println("Boyunuzu Yazın");
        scanner.hasNextLine();
        double b = scanner.nextDouble();
        double c = (a / (b*b));
        System.out.println("Beden Kitle İndeksiniz: " + c);
        if (c < 18.5) {
            System.out.println("Zayıf");
           }
         else if(c >=18.5 && 25 >= c){
            System.out.println("Normal");
    }
         else if(c>=25 && 30 >= c){
             System.out.println("Fazla Kilolu");
         }
         else if (c >= 30){
             System.out.println("Obez");
         }
    }    
    
}
