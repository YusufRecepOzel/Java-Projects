
import java.util.Scanner;


public class Test {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayýnýzý Giriniz");
        int a = scanner.nextInt();
        int toplam = 0;
        do{
            toplam = toplam + (a % 10);
            a = a / 10;
        }
        while(a > 0);
        System.out.println("Rakamlarý Toplamý: " + toplam);
    }
}
