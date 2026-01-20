
import java.util.Scanner;


public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        String İslemler= ("1. Toplama İşlemi\n"
                         +"2. Çıkarma İşlemi\n"
                         + "3. Çarpma İşlemi\n"
                         + "4. Bölme İşlemi");
        System.out.println(İslemler);
        System.out.println("*****************************");
        System.out.println("İşlem Seçiniz");
        int işlem = scanner.nextInt();// Switch Double ile çalışmaz çünkü switchin kendisi kesin sayılarla çalışır fakat double kesin olmayabilir tam olarak double bellekte saklanamaz hata payı vardır 
        switch(işlem){
            case 1 :
                System.out.println("Birinci Sayıyı Giriniz");
                double a = scanner.nextDouble();
                System.out.println("İkinci Sayıyı Giriniz");
                scanner.hasNextLine();
                double b = scanner.nextDouble();
                System.out.println("Toplama İşlemi Sonucu: "+ (a+b));
                break;
            case 2:
                System.out.println("Birinci Sayıyı Giriniz");
                double c = scanner.nextDouble();
                System.out.println("İkinci Sayıyı Giriniz");
                scanner.hasNextLine();
                double d = scanner.nextDouble();
                System.out.println("Çıkarma İşlemi Sonucu: "+ (c-d));
                break;
            case 3:
                System.out.println("Birinci Sayıyı Giriniz");
                double e = scanner.nextDouble();
                System.out.println("İkinci Sayıyı Giriniz");
                scanner.hasNextLine();
                double f = scanner.nextDouble();
                System.out.println("Çarpma İşlemi Sonucu: "+ (e*f));
                break;
            case 4 :
                System.out.println("Birinci Sayıyı Giriniz");
                double g = scanner.nextDouble();
                System.out.println("İkinci Sayıyı Giriniz");
                scanner.hasNextLine();
                double h = scanner.nextDouble();
                System.out.println("Bölme İşlemi Sonucu: "+ (g/h));
                break;
            default :
                System.out.println("Geçersiz İşlem...");
        }
    }
    
}
