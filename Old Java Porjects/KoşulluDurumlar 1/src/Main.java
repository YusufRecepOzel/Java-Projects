
import java.util.Scanner;


public class Main {
public static void main(String [] args){
    /*
        if (koşul) {
             Koşul sağlanınca(true) bu blok çalışır
        }
        else {
             Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
        }
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı Girin");
        int sayı = scanner.nextInt();
        
        if (sayı >= 0){
            System.out.println("Kabul edildi");
            
        }
        else {
            System.out.println("Lütfen pozitif veya 0 giriniz");
            scanner.hasNextInt();
            int sayı1 = scanner.nextInt();
            System.out.println("Kabul edildi");
        }
                
    }    
}
    
        
