import java.io.*;
public class Deneme {
   public static void main(String [] args){
       try{
       PrintWriter writer = new PrintWriter("File.txt");
       writer.println("Hello");
       writer.println("My Name is: ");
       writer.print("Yusuf");
       writer.println(" ");
       writer.println("My Age is: ");
       writer.println("18");
       writer.close();
       }
       catch(FileNotFoundException e){
           System.out.println("Please Try Again");
       }      
   }
}
