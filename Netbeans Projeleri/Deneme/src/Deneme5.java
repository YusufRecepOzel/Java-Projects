import java.util.Scanner;
public class Deneme5 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("How many kilometers? ");
        int km = s.nextInt(), totalSec = 0; // Değişkenleri tek satırda tanımla

        for (int i = 1; i <= km; i++) {
            System.out.print("km " + i + " (m s): ");
            // Girdiyi alırken anında dakikayı 60 ile çarpıp saniye ile topla
            totalSec += s.nextInt() * 60 + s.nextInt(); 
        }

        // Hesaplamayı direkt yazdırma komutunun içinde yap (Ara değişken yok!)
        System.out.println("Total time: " + (totalSec / 3600) + ":" + ((totalSec % 3600) / 60) + ":" + (totalSec % 60));
        
        // Ortalamayı da yazdırma anında hesapla
        System.out.println("Average time per km: " + ((totalSec / km) / 60) + ":" + ((totalSec / km) % 60));
    }
}
