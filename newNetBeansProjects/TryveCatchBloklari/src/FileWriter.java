import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileWriter {
    public static void main(String [] args){
        try{
        PrintWriter writer = new PrintWriter("File.txt");
        writer.println("Hello");
        writer.println("My name is: ");
        writer.print("Yusuf");
        writer.println("My age is: ");
        writer.print("19");           
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found Please Change Your File Location");
        System.out.println(e.getMessage());
        e.printStackTrace();
        }        
    }
}
