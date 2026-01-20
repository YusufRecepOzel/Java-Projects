
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Lütfen Vize1 Notunuzu Giriniz");
        double a = scanner.nextDouble();
        System.out.println("Lütfen Vize2 Notunuzu Giriniz");
        scanner.hasNextLine();
        double b = scanner.nextDouble();
        System.out.println("Lütfen Final Notunuzu Giriniz");
        scanner.hasNextLine();
        double c = scanner.nextDouble();
        System.out.println("Okul Genel Ortalamanızı Yazınız");
        double d = scanner.nextDouble();
        double e = ((a*30) / 100) + ((b*30) / 100) + ((c*40) /100);
        if (e >= 90){
            System.out.println("AA");
        }
        else if (e >= 85){
            System.out.println("BA");
        }
        else if (e >= 80){
            System.out.println("BB");
        }
        else if (e >= 75){
            System.out.println("BC");
        }
        else if (e >= 70){
            System.out.println("CC");
        }
        else if (e >= 65){
            System.out.println("CD");
        }
        else if (e >= 60){
            System.out.println("DD");
        }
        else if (e >= 55){
            System.out.println("DF");
        }
        else if (e < 55){
            System.out.println("FF");
        }
        
    }
    
}
