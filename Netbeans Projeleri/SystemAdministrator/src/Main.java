import java.io.*;
import java.net.URL;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        try{
    // 1. URL'i (Adresi) oluştur
    URL url = new URL("https://www.google.com/index.html"); // 

    // 2. Akışı aç (openStream) ve Scanner'a ver
    Scanner input = new Scanner(url.openStream()); // 

    // 3. Gerisi bildiğin Scanner okuması (next, nextLine vs.)
    while (input.hasNext()) {
        System.out.println(input.nextLine());
    }
} catch (Exception e) {
    System.out.println("Bağlantı hatası!");
}
}
}