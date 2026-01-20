import java.io.*;
import java.util.Scanner;
public class MediumFile {
    public static void main(String [] args){
        try{
        PrintWriter writer = new PrintWriter("log.txt");
        writer.println("INFO: System started");
        writer.println("ERROR: Disk full");
        writer.println("INFO: User logged in");
        writer.println("ERROR: Connection lost");
        writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
           Scanner scanner = new Scanner(new File("log.txt"));
           while(scanner.hasNextLine()){
               String err = scanner.nextLine();
               if(err.contains("ERROR")){
                   PrintWriter writer = new PrintWriter("errors.txt");
                   writer.println(err);
                   System.out.println(err);
                   writer.close();
               }
           }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
