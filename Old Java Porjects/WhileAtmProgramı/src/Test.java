
   import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATM ye Hoþgeldiniz Lütfen Bir Ýþlem Seçiniz Ýþleminizi 1 2 3 veya q Þeklinde Yazýnýz");
        System.out.println("1. Ýþlem: Bakiye Öðrenme");
        System.out.println("2. Ýþlem Para Çekme");
        System.out.println("3. Ýþlem Para Yatýrma");
        System.out.println("Eðer Çýkmak Ýstiyorsanýz q ye basýnýz");
        int b = 1000;
        while(true){
            String e = scanner.nextLine();
            if("1".equals(e)){
                System.out.println("Bakiyeniz: " + b);
                System.out.println("En Baþa Geri Dönülüyor Tekrar Ýþlem Seçiniz");
                continue;
            }
            if("2".equals(e)){
                System.out.println("Ne Kadar Para Çekmek Ýstersiniz");
                int c = scanner.nextInt();
                scanner.nextLine();
                b = b - c;
                System.out.println("Bakiyeniz Þu Kadar Kalmýþtýr: " + b);
                System.out.println("En Baþa Geri Dönülüyor Tekrar Ýþlem Seçiniz");
                continue;
            }
            if("3".equals(e)){
                System.out.println("Ne Kadar Para Eklemek Ýstersiniz");
                int d = scanner.nextInt();
                scanner.nextLine();
                b = b + d;
                System.out.println("Bakiyeniz Þu Kadar Olmuþtur: " + b);
                System.out.println("En Baþa Geri Dönülüyor Tekrar Ýþlem Seçiniz");
                continue;
            }
            if("q".equals(e)){
                System.out.println("Sistemden Çýkýlýyor");
                break;
            }
            else{
                System.out.println("Geçersiz Giriþ Lütfen Sistemi Yeniden Baþlatýnýz");
                continue;
            }
        }
    }    
} 

