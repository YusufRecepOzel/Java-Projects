import java.io.*;
import java.util.Scanner;
public class FileEasy {
    public static void main(String [] args){
        File file = new File("gorev.txt");       
        try{
           PrintWriter writer = new PrintWriter("gorev.txt"); 
           writer.println("Merhaba");
           writer.println("Gizli");
           writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        if(file.exists()){
            System.out.println("Dosya Olusturuldu");
        }
        try{
          Scanner scanner = new Scanner(new File("gorev.txt"));
          while(scanner.hasNextLine()){
              String message = scanner.nextLine();
              System.out.println(message);
          }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
}
