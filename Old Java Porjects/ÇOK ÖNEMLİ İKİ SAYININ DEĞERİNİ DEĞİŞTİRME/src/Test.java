
import java.util.Scanner;





public class Test {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayýnýzý Giriniz");
        int birinci_sayý = scanner.nextInt();
        System.out.println("Ýkinci Sayý Giriniz");
        int ikinci_sayý = scanner.nextInt();
        int geçici_sayý = birinci_sayý;
        birinci_sayý = ikinci_sayý;
        ikinci_sayý = geçici_sayý;
        System.out.println("Deðiþtirilen birinci sayýnýz: " + birinci_sayý);
        System.out.println("Deðiþtirilen ikinci sayýnýz: " + ikinci_sayý);
    }
}
