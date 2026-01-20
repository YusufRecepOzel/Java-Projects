
import java.util.Scanner;


public class Test {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sayýnýzý Giriniz");
        int c = scanner.nextInt();
        int a = 1;
        int b = 1;
        while(a<=c){
        b =a*b;            
        a++;
        }
        System.out.println("Faktoriyeliniz: " + b);
    }
}
