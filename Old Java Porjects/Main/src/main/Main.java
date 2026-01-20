
package main;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
public static void main(String[] args) {
        String a = "Merhaba";
        String arabicText = "مرحبًا بك!";

        try {
            // Çıktıyı bir dosyaya yazıyoruz
            FileWriter writer = new FileWriter("output.txt", true); // Dosyaya ekleme
            writer.write(a + " Hoşgeldiniz...\n");
            writer.write(arabicText + "\n");
            writer.close(); // Dosyayı kapatıyoruz
            System.out.println("Çıktı output.txt dosyasına yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();  // Hata mesajını yazdır
        }
    }
}
