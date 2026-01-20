
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vize1 Notunuzu Giriniz");
        double a = scanner.nextDouble();
        System.out.println("Vize2 Notunuzu Giriniz");
        scanner.hasNextLine();
        double b = scanner.nextDouble();
        System.out.println("Final Notunuzu Giriniz");
        scanner.hasNextLine();
        double c = scanner.nextDouble();
        double d = (((a*30)/100)+ ((b*30)/100) + ((c*40) /100));
        System.out.println("Genel Ortalamanız Şudur: " + d);
        System.out.println("Okul Ortalamanızı Yazın: ");
        double e = scanner.nextDouble();
        
        if(d >= 90){
            System.out.println("AA");
        }
        else if(d>= 85){
            System.out.println("BA");
        }
        else if(d>=80){
            System.out.println("BB");
        }
        else if(d>=75){
            System.out.println("BC");
        }
        else if(d>=70){
            System.out.println("CC");
        }
        else if(d>=65){
            System.out.println("DC");
        }
        else if(d>=60){
            System.out.println("DD");
            if (e < 2.5)
                System.out.println("Lütfen Daha Çok Çalış");
        }
        else if(d>=55){
            System.out.println("FD");
        }
        else if(d<55){
            System.out.println("FF");
        }
    }
    
}
