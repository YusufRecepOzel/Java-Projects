
import java.util.Scanner;


public class Test {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayı : ");
        int birincisayı = scanner.nextInt();
        System.out.print("İkinci Sayı");
        int ikincisayı = scanner.nextInt();
        System.out.println("Değiştirlmeden Önce...");
        System.out.println("Birinci Sayı :" + birincisayı + "ikincisayı: " + ikincisayı);
        int geçici = birincisayı;
        birincisayı=ikincisayı;
        ikincisayı= geçici;
        System.out.println("Değiştirildikten sonra...");
        System.out.println("Birinci Sayı :" + birincisayı + "ikincisayı: " + ikincisayı);
        
    }
    
}
